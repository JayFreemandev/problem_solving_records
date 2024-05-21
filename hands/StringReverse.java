public class StringReverse {
    public static void main(String[] args) {
        String pizza = "pizza";
        String reverse = new StringBuilder(pizza).reverse().toString();
        System.out.println(reverse);

        String same = "aba";
        String same2 = new StringBuilder(same).reverse().toString();
        System.out.println(same.equals(same2));
    }
}
