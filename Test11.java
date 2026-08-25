import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n =scanner.nextInt();
        Main main = new Main();
        System.out.println("is a Prime number? : "+main.Pr11(n));
    }
}
