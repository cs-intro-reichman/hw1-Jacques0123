// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {

    public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int a = (int) (Math.random() * lim);
        int b = (int) (Math.random() * lim);
        int c = (int) (Math.random() * lim);

        System.out.println(a + " " + b + " " + c + " ");

        int halfMax = Math.max(a, b);
        int max = Math.max(halfMax, c);
        int halfMin = Math.min(a, b);
        int min = Math.min(halfMin, c);

        int midNum = (a + b + c) - (max + min);

        System.out.println(min + " " + midNum + " " + max + " ");

    }
}
