public class SmartPhone {

    private String vendor;
    private String model;
    private String ram;
    private String color;
    private double discountPrice;
    private double totalPrice;

    @Override
    public String toString() {
        return "SmartPhone{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                ", color='" + color + '\'' +
                ", discountPrice=" + discountPrice +
                ", totalPrice=" + totalPrice +
                "}";
    }


    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


}
