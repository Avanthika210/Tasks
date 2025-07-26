public class StringCompression {

    public static void main(String[] args) {
        String input = "aaabbccddaa";
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }

    public static String compressString(String str) {
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i < str.length(); i++) {
         
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1; 
            }
        }

       
        result.append(str.charAt(str.length() - 1)).append(count);

        return result.toString();
    }
}


