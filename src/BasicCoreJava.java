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

        // 2^N
        System.out.println("plz enter the no. ");
        double numb = input.nextInt();
        double result = 1;
        for (int i = 1; i <= numb; i++) {
            result *= 2;
        }
        System.out.println("2^N = " + result);
        // To check
        System.out.println("To check using Math.pow = " + Math.pow(2, numb));

        //Harmonic Number
        System.out.println("plz enter the no. ");
        int harmonicNum = input.nextInt();
        double har = 1.0;
        System.out.print(har +" ");
        for (int i = 2; i <= harmonicNum; i++) {
            har = har + (double) 1 / i;
            System.out.print((double) 1 / i +"  ");
        }
        System.out.println("\nHarmonic no = " +1/har);

        // Prime Factors
        System.out.println("enter the no. :");
        int primeNumber = input.nextInt();
        for (int i = 2; i*i  <= primeNumber; i++) {
            while (primeNumber % i == 0) {
                System.out.println(i + " ");
                primeNumber = primeNumber / i;
            }
        }
        if (primeNumber >= 2)
            System.out.println(primeNumber);
    }
}