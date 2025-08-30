import java.util.Scanner;

class MyCalculator {
    int num1;
    int num2;

    MyCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        this.num1 = input.nextInt();
        System.out.print("Enter num2: ");
        this.num2 = input.nextInt();
    }
}

class Addition extends MyCalculator {
    int ans;

    Addition() {
        super();
        ans = num1 + num2;
    }

    void displayResult() {
        System.out.println("The sum is: " + ans);
    }
}
class Subtract extends MyCalculator {
    int ans;

    Subtract() {
        super();
        ans = num1 - num2;
    }

    void displayResult() {
        System.out.println("The subtract is: " + ans);
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.displayResult();
        Subtract sub = new Subtract();
        sub.displayResult();
    }
}
