// apackage datatypes;

// Strings are similar to character arrays in C/C++/Java/Fortran.
// They can contain any character value, including other strings, arrays, and so on.
// They are first class objects in the language.
// They can be created using the string literal form, or with the "character" function.
// They can also be created with the concat function.
// They are mutable, meaning that they can be changed by the += operator.
// They can also be created with the new keyword.

public class Strings {
    public static void main(String[] args) throws Exception {
        String name = "Adijat";
        // length of a string
        System.out.println(name + " size: " + name.length());

        // string ad characters
        char letter = 'A';
        char[] characters = name.toCharArray();
        characters[2] = letter;
        System.out.println(characters);

        String nickname = name.substring(1, name.length());
        System.out.println("nickname is: " + nickname);
        System.out.println("nickname uppercase: " + nickname.toUpperCase());
        System.out.println("nickname lowercase: " + nickname.toLowerCase());
        System.out.println("Adejare's 3 character: " + "Adejare".charAt(2));
        System.out.println("Is Adjiat == Adojat? " + name.equals("Adojat"));
        // 1==2, 7==7

        String fullname = "Adejare Adijat Humpreh";
        String[] names = fullname.split(" ");
        System.out.println("First name is: " + names[0] + ", Last name is: " + names[2]); // [
        String statement = "Madam Bello Osagie is from Oyo state";
        String[] words = statement.split(" "); // split on whitespace. returns an array of Strings
        for (int x = 0; x < words.length; x++) {
            System.out.println(words[x] + " is palindrome: " + isPalindrome(words[x]));
        }

        System.out.println("\nPrinting on the palindrome words in[" + statement + "]");
        for (int x = 0; x < words.length; x++) {
            if (isPalindrome(words[x])) {
                System.out.println(words[x]);
            }
        }
    }

    // pallindrome algorithm
    private static boolean isPalindrome(String S) {
        final String W = S.toLowerCase();
        for (int i = 0; i < W.length(); i++) { //
            if (W.charAt(i) != W.charAt(W.length() - 1 - i)) { // compare char at same index and
                return false;
            }
        }
        return true;
    }

}
