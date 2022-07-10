package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromUser {
    public static final int FAVORITE_NUMBER = 7;

    public static void main(String[] args) {
        String strNum = InputFromUser.getInput("Guess my favorite number?");
        int num = Integer.parseInt(strNum);

        if (FAVORITE_NUMBER == num) {
            System.out.println("Bingo! You got it!");
        } else {
            System.out.println(num + " is not my favorite number.");
        }
    }

    public static String getInput(String msg) {
        try {
            BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(msg);
            return buffReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
