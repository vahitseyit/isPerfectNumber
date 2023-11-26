public class Main {
    public static void main(String[] args) {
        int number = 49;
        int positiveDivisor = 0;
        boolean isPerfect = false;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) positiveDivisor += i;
            if (number / positiveDivisor == 1) isPerfect = true;
        }
        if (!isPerfect) System.out.println("Number is not a perfect number");
        else System.out.println("Number is  a perfect number");
    }
}