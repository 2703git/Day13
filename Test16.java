import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();
        System.out.print("Enter power: ");
        int n = scanner.nextInt();
        Main main = new Main();
        System.out.println("Result: "+main.Pr16(a,n));
    }
}
