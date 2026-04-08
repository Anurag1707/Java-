public class non_repeat {
    public static void main(String[] args) {
        String str1 = "aabbccde";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int count = 0;

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeating char: " + ch);
                break;
            }
        }
    }
}