import java.util.Scanner;

public class Incometaxcalculator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        int income = sc.nextInt();
        int tax;
        int total;

        if (income < 500000) {
            tax = 0;
        } else if (income > 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        total = income - tax;
        System.out.println("The amount of tax is " + tax);
        System.out.println("Total income after tax deduciton is :" + total);

    }
}
