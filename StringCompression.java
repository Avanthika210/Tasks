public class StringCompression {

    public static void main(String[] args) {
        String input = "aaabbccddaa";
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }

    public static String compressString(String str) {
        String result = "";  
        int count = 1;
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result = result + str.charAt(i - 1) + count;
                count = 1;
            }
        }
        result = result + str.charAt(str.length() - 1) + count;

        return result;
    }
}
