import java.util.Scanner;

public class InverseStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = scanner.nextInt();

        for (int i = num; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
