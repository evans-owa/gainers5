import java.util.Scanner;

public class MeW9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your favourite number");

        //Scanner input = new Scanner(System.in); works either way so long as the object is created before use
        int favouriteNumber = input.nextInt();

        System.out.println(favouriteNumber + "is your favorite number! ");
    }
}
