import java.util.Scanner;

public class BasicCoreJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int heads = 0;
        int tails = 0;
        System.out.println("Enter no of times coin flipped - ");
        int flip = input.nextInt();
        for (int i = 0; i < flip; i++) {
            double random = Math.random();
            if (random < 0.5) {
                tails += 1;
            } else heads += 1;
        }

        System.out.println("heads " + heads + "  tails  " + tails);
        System.out.println("percentage of heads " + heads * 100 / flip + "%");
        System.out.println("percentage of tails " + tails * 100 / flip + "%");

        //Leap Year
        System.out.println("plz enter the year ");
        int year = input.nextInt();
        int century = year % 100;
        int leap = year % 4;
        int fourCentury = year % 400;
        if (fourCentury == 0) {
            System.out.println("its leap year ");
        } else if (leap == 0) {
            if (century == 0) {
                System.out.println("its not a leap year");
            } else {
                System.out.println("its leap year ");
            }
        } else System.out.println("not a leap year ");
    }
}