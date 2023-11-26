import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to test if it is the perfect number");
        int number = input.nextInt();
        int positiveDivisorSum = 1;//The sum of positive divisors starts from 1 because 1 is the positive divisor of all numbers.
        boolean isPerfect = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) positiveDivisorSum += i;//Find the positive divisors of the entered number
            if (number == positiveDivisorSum) isPerfect = true;//
        }
        if (!isPerfect) System.out.println("Number is not a perfect number");
        else System.out.println("Number is a perfect number");
    }
}