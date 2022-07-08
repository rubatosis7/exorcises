package example;

public class StrReplace {
    public static void main(String[] args) {
        String food = "Rocky-Road";
        System.out.println(food);

        food = food.replace("-", " ");
        System.out.println(food);

        String str = "Aliens*Mars*Jupiter";
        System.out.println(str);

        str = str.replace("*", ", ");
        System.out.println(str);
    }
}
