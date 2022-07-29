public class reversestring {
    public static void main(String[] args) {
        String s = "Nikita";
        System.out.println("after reversing string is: ");
        for (int i = s.length(); i > 0; --i) {
            System.out.print(s.charAt(i - 1));
        }
    }
}
