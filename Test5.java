import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int s = scanner.nextInt();
        System.out.print("Enter power: ");
        int n = scanner.nextInt();
        Main main = new Main();
        System.out.println("Result: "+main.Pr5(s,n));
    }
}
