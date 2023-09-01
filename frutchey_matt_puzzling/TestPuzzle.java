import java.util.Arrays;
import java.util.ArrayList;

public class TestPuzzle {
    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle();

        //! Get Ten Rolls:
        int[] tenRolls = puzzle.getTenRolls();
        System.out.println(Arrays.toString(tenRolls));

        //! Get Random Letter:
        char randomLetter = puzzle.getRandomLetter();
        System.out.println(randomLetter);

        //! Generate Password:
        String password = puzzle.generatePassword();
        System.out.println(password);   //? Looked up string builder to convert!

        //! New Password Set:
        ArrayList<String> userPassword = puzzle.getNewPasswordSet(7);
        System.out.println(userPassword);
    }
}