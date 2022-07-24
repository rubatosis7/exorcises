package example;

public class MyFavoriteNumber2 {
    public static final int FAVORITE_NUMBER = 7;

    public static void main(String[] args) {
        String strNum = InputFromUser.getInput("Guess my favorite number?");
        int num = Integer.parseInt(strNum);
        while (num != FAVORITE_NUMBER) {
            System.out.println(num + " is not my favorite number.");
            num = Integer.parseInt(InputFromUser.getInput("Guess my favorite number?"));
        }
        System.out.println("Bingo! You got it!");
    }
}
