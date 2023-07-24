import java.util.Scanner;

public class EndStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows you want to");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
               System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.err.print("*");
            }
            System.out.println();
        }
        
    }
}
// 5 => 4 space 1 start
// formula will be (num - j) (space) and j star 