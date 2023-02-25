import java.util.Scanner;

public class BasicCoreJava {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        Scanner input = new Scanner(System.in);
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
}