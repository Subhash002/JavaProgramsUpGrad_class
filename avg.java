import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        // if (age>=18) {
        //     System.out.println("Eligible to vote");
        // } else {
        //     System.out.println("Ineligible to vote");
        // }
        float a,b,c,avg;
        a=90;
        b=95;
        c=100;
        avg=(a+b+c)/3;
        System.out.println(avg);
        String eligibility= (age>18)? "Eligible" : "Not eligible";
        System.out.println(eligibility);
    }
}
