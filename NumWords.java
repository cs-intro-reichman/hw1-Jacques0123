
public class NumWords {

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        int h = (number / 100);
        int t = (number / 10) % 10;
        int o = number % 10;

        System.out.println(h + " hundreds, " + t + " tens, and " + o + " ones.");
    }
}
