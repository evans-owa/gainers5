import java.util.Scanner;

public class MeW10 {
    public static void main(String[] args) {
        System.out.print("Enter you favorite number: ");

        Scanner input = new Scanner(System.in);
        //no need to store example 3
        System.out.println(input.nextInt() + " is your favorite number");
    }
}
