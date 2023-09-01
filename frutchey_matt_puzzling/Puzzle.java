import java.util.ArrayList;
import java.util.Random;

public class Puzzle {
    Random random = new Random();

    //! Get Ten Rolls (Array of 10 Numbers)
    public int[] getTenRolls() {
        int i = 0;
        int[] tenRolls = new int[10];
        while (i < 10) {
            tenRolls[i] = random.nextInt(21);
            i++;
        }
        return tenRolls;
    }

    //! Generate a Random Letter
    public char getRandomLetter() {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int randomLetter = random.nextInt(alphabet.length); // Declared int because I want the index, not the actual character...
        return alphabet[randomLetter];  // Returns whatever letter is at the random index
    }
    

    //! Generate a Password (8 Characters)
    public String generatePassword() {
        // ArrayList<Character> password = new ArrayList<>();
        //? https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter()); // 'add' to 'append' for strings
        }
        return password.toString();
    }

    //! New Password Set
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> newUserPassword = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            newUserPassword.add(generatePassword());
        }
        return newUserPassword;
    }
}