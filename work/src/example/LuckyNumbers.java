package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyNumbers {
    public static void main(String[] args) {

        String strNum = InputFromUser.getInput("Enter any number:");
        int num = Integer.parseInt(strNum);

        if (num == 5 || num == 7 || num == 9) {
            System.out.println("lucky number");
        } else {
            System.out.println("regular number");
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