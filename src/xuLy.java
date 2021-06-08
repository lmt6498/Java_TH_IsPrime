import java.util.Scanner;

public class xuLy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            boolean checkPrime = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    checkPrime = false;
                    break;
                }
                i++;
            }
            if (checkPrime)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }
}
