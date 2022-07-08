package example;

public class Strings {
    public static void main(String[] args) {
        String str = "apple";
        int index = str.indexOf('l');
        System.out.println("index of 'l' in " + str + " is " + index);

        System.out.println(str.indexOf('p'));
        System.out.println(str.indexOf('e'));

        int lastIndex = str.lastIndexOf('p');
        System.out.println(lastIndex);
    }
}
