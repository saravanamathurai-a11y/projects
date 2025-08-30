import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     
        System.out.print("Enter a number: ");
        String num = input.nextLine();

        for (int i = num.length() - 1; i >= 0; i--) {
            char character = num.charAt(i);
            System.out.print(character);  // use print instead of println
        }

        input.close(); // Good practice to close the scanner
    }
}
