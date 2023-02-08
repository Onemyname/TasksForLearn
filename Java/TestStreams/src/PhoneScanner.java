import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneScanner {

    public static final char DOT = '.';
    public static final String SEPARATOR = "\\s+";
    public static final String DELIMITER = " ";
    private static final char COMMA = ',';
    private boolean discount;

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public String getFileName(String fileName) {
        return Objects.requireNonNull(PhoneScanner.class
                        .getClassLoader()
                        .getResource(fileName))
                .toString()
                .replace("file:/", "");
    }

    public List<SmartPhone> getPhoneList(String fileName) throws IOException {
        Stream<SmartPhone> smartPhoneStream = getSmartPhoneStream(fileName);

        return smartPhoneStream.collect(Collectors.toList());

    }

    private Stream<SmartPhone> getSmartPhoneStream(String fileName) throws IOException {
        Stream<String[]> stringArrayStream = getStringArrayStream(fileName);
        return stringArrayStream.map(array -> {
            int n = array.length;
            SmartPhone phone = new SmartPhone();
            phone.setVendor(array[1]);
            phone.setModel(String.join(DELIMITER, Arrays.copyOfRange(array, 2, 4)));
            phone.setRam(array[n - 4]);
            phone.setColor(array[n - 3]);
            phone.setDiscountPrice(Double.parseDouble(array[n - 2]));
            phone.setTotalPrice(Double.parseDouble(array[n - 1]));
            return phone;
        });
    }

    private Stream<String[]> getStringArrayStream(String fileName) throws IOException {
        return Files.readAllLines(Path.of(fileName))
                .stream()
                .map(s -> s.replace(COMMA, DOT))
                .map(s -> s.split(SEPARATOR));
    }

    List<SmartPhone> getBuyList(List<SmartPhone> allPhones, double money, boolean discount) {
        if (discount) {
            return allPhones.stream()
                    .filter(smartPhone -> money >= smartPhone.getDiscountPrice()).toList();
        } else {
            return allPhones.stream()
                    .filter(smartPhone -> money >= smartPhone.getTotalPrice()).toList();
        }
    }
}


