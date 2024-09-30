package Lab4Ex1;

public class Lab4Ex6 {
    public static void main(String[] args) {
        String myString = "Uyen";
        char myChar = '*';
        int myLength = 7;

        String newString = padString(myString, myChar, myLength);
        System.out.println(newString);
    }

    // Return the padded string with chosen character to fill up the length
    public static String padString(String s, char c, int length) {
        int missingChars = length - s.length();

        String paddedChars = "";
        for (int i = 0; i < missingChars; i++) {
            paddedChars += c;
        }

        s = paddedChars + s;

        return s;
    }
}