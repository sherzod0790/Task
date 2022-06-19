import java.util.Scanner;

public class Boolean17 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // a, butun son berilgan, berilgan son 2 xonali juft  musbat son
        int a;
        boolean g = false;
        System.out.print("a = ");
        a = scan.nextInt();

        g = ((a > 0) && (a % 2 == 1) && (a > 9 && a < 100));
        System.out.println(g);

    }
}
