import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int randomint = 1 + (int)(Math.random() * 6);
        return randomint;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static double[] sumOfTwoDice(int n) {
        int a[] =  new int[11];
        for (int i = 1; i <= n; i++){
            int c = rollDie() + rollDie();
            a[c-2]++;
        }
        double r[] = new double[11];
        for(int i = 0; i < 11; i++){
            r[i] = 100*((double)a[i])/(double)n;
        }
        return r;
    }


    public static void main(String[] args) {
        System.out.println("How many pair of dice would you like to roll?");
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        double[] a = sumOfTwoDice(n);
        for(int i = 2; i<13; i++){
            System.out.println("% of rolls where sum == "+i+": "+a[i-2]+"\n");
        }
        scan.close();
    }
}
