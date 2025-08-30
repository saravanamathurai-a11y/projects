import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter mark1: ");
        int mark1 = input.nextInt();
        System.out.println("Enter mark2: ");
        int mark2 = input.nextInt();
        int avg = (mark1 + mark2) / 2;
        System.out.println("Name: " + name + "Mark1: " + mark1 + "Mark2: " + mark2 + "Avg: " + avg);

        input.close();
    }
}
