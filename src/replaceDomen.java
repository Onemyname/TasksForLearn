public class replaceDomen {
    public static void main(String[] args) {
        String string = "https://domen.ru/about/reviews";
        String newString = "javarush.ru";
        int index = string.indexOf("/");
        int index2 = string.indexOf("/", index + 2);
        String firstString = string.substring(0, index + 2);
        String lastString = string.substring(index2);
        String result = firstString + newString + lastString;
        System.out.println(result);
    }
}
