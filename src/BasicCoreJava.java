import java.util.Scanner;

public class BasicCoreJava {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        flipCoin();
        leapYear();
        twoPower_N();
        harmonicFunction();
        primeNumber();
        QuotientRemainder();
        swapToNumber();
        evenOdd();
        alphabet();
        largestNumber();
    }

    public static void flipCoin() {
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
    }

    public static void leapYear() {
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

    public static void twoPower_N() {
        System.out.println("plz enter the no. ");
        double numb = input.nextInt();
        double result = 1;
        for (int i = 1; i <= numb; i++) {
            result *= 2;
        }
        System.out.println("2^N = " + result);
        // To check
        System.out.println("To check using Math.pow = " + Math.pow(2, numb));
    }

    public static void harmonicFunction() {
        System.out.println("plz enter the no. ");
        int harmonicNum = input.nextInt();
        double har = 1.0;
        System.out.print(har + " ");
        for (int i = 2; i <= harmonicNum; i++) {
            har = har + (double) 1 / i;
            System.out.print((double) 1 / i + "  ");
        }
        System.out.println("\nHarmonic no = " + 1 / har);
    }

    public static void primeNumber() {
        System.out.println("enter the no. :");
        int primeNumber = input.nextInt();
        for (int i = 2; i * i <= primeNumber; i++) {
            while (primeNumber % i == 0) {
                System.out.println(i + " ");
                primeNumber = primeNumber / i;
            }
        }
        if (primeNumber >= 2)
            System.out.println(primeNumber);
    }

    public static void QuotientRemainder() {
        System.out.println("Please enter number to divide - ");
        int numberOne = input.nextInt();
        System.out.println("Please enter number to divide with- ");
        int numberTwo = input.nextInt();
        System.out.println("Quotient = " + numberOne / numberTwo);
        System.out.println("Reminder = " + numberOne % numberTwo);
    }

    public static void swapToNumber() {
        System.out.println("Enter value of A - ");
        int valueA = input.nextInt();
        System.out.println("Enter value of B - ");
        int valueB = input.nextInt();
        int temp = valueA;
        valueA = valueB;
        valueB = temp;
        System.out.println("Swapped values are - For A = " + valueA + " For B = " + valueB);
    }

    public static void evenOdd() {
        System.out.println("Please enter the no.- ");
        int evenOdd = input.nextInt();
        if (evenOdd % 2 == 0) {
            System.out.println("Number is Even ");
        } else System.out.println("Number is Odd");
    }

    public static void alphabet() {
        System.out.println("Please enter alphabet ");
        String character = input.next();
        if (character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u")) {
            System.out.println("its vowel");
        } else System.out.println("its consonant");
    }

    public static void largestNumber() {
        int[] array = new int[3];
        int max = 0;
        System.out.println("Enter 3 numbers -");
        for (int i = 0; i < 3; i++) {
            array[i] = input.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum number is = " + max);
    }
}