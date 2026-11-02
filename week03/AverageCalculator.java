import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter how many numbers you want to average: ");
        int count = scanner.nextInt();
        
        double sum = 0;
        
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += scanner.nextDouble();
        }
        
        double average = sum / count;
        System.out.println("The average is: " + average);
        
        scanner.close();
    }
}
