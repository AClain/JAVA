public class Main {
    static String toUpperCase(String string) {
        StringBuilder toUpperCaseString = new StringBuilder();

        for (int i = 0 ; i < string.length() ; i++) {
            char currentChar = string.charAt(i);
            int asciiUpperCaseChar = (int) currentChar - 32;
            if (asciiUpperCaseChar < 65 || asciiUpperCaseChar > 90 ) {
                toUpperCaseString.append(currentChar);
                continue;
            }

            toUpperCaseString.append((char) asciiUpperCaseChar);
        }

        return toUpperCaseString.toString();
    }

    public static void main(String[] args) {
        System.out.println(toUpperCase("kAmel#  _"));
    }
}
