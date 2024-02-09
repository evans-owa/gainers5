import java.util.Scanner;

public class MeW5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //keyboard input of  integer
        int i1 = input.nextInt();
        System.out.println(i1);

        //keyboard input of float
        float f1 = input.nextFloat();
        System.out.println(f1);

        boolean b1 = input.nextBoolean();
        System.out.println(b1);

        int r1 = input.nextInt();
        int r2 = input.nextInt();
        int r3 = r1 + r2;
        System.out.println(r3);


    }
}
