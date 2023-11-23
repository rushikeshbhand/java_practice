import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Convert the rate of interest from percentage to decimal
        rate = rate / 100;

        // Calculate the compound interest
        double amount = principal * Math.pow(1 + rate, time);

        // Calculate the compound interest by subtracting the principal amount
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest: " + compoundInterest);
    }
}
