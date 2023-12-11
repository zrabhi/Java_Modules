import java.util.Scanner;

class Program {
    public static void main(String args[]) {
        try {
            try (Scanner input = new Scanner(System.in)) {
                int iteration = 0;
                boolean flag = false;
                System.out.print("Enter Your Number:\n-> ");
                int number = input.nextInt();
                if (number <= 0 || number == 1) {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                for (int i = 2; i <= number / 2; ++i) {
                    iteration++;
                    if (number % i == 0) {
                        flag = true;
                        break;
                    }
                }
                System.out.println(flag + " " + iteration);
            }
        } catch (Exception e) {
            System.err.println("You have to enter a valid number!");
        }
    }
}