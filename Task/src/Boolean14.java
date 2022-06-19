import java.util.Scanner;

public class Boolean14 {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        // a, b, c butun sonlar berilgan faqat bittasi musbat
        int a, b, c;
        boolean g = false;
        System.out.print("a = "); a = scan.nextInt();
        System.out.println();
        System.out.print("b = "); b = scan.nextInt();
        System.out.println();
        System.out.print("c = "); c = scan.nextInt();

        g = (a > 0 && b <= 0 && c <= 0) ||
                (a <= 0 && b > 0 && c <= 0) ||
                (a <= 0 && b <= 0 && c > 0);
        System.out.println(g);

    }
}
