public class Main {
    public void Pr1(int n){
        for (int i = 1; i <= n ; i++) {
            System.out.print(Math.pow(i,3)+"  ");
        }
    }
    public void Pr2(){
        for (int i = 100; i < 1000; i++) {
            int ones = i%10;
            int tens = (i%100)/10;
            int hundreds = i/100;
            if (ones==tens || ones==hundreds || tens==hundreds){
                System.out.print(i+" ");
            }
        }
    }
    public void Pr3(){
        for (int i = 10; i < 100; i++) {
            int ones = i%10;
            int tens = i/10;
            if (ones+tens==9 || ones+tens==15){
                System.out.print(i+" ");
            }
        }
    }
    public void Pr4(){
        for (int i = 100; i <1000 ; i++) {
            int ones = i%10;
            int tens = (i%100)/10;
            int hundreds = i/100;
            if (ones+tens+hundreds==5){
                System.out.print(i+" ");
            }
        }
    }
    public int Pr5(int s, int n){
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= s;
        }
        return power;
    }
    public void Pr6(int n){
        for (int i = 1; i <= n  ; i++) {
            for (int j = n; j < n+i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void Pr7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(1);
        }
    }
    public void Pr8(int a, int b){
        double c = Math.sqrt((a*a)+(b*b));
        double perimeter = a+b+c;
        System.out.printf("Hypotenuse: %.2f",c);
        System.out.printf("\nPerimeter: %.2f",perimeter);
    }
    public void Pr9(){
        for (int j = 2; j <= 9; j++) {
            for (int i = 2; i <= 9; i++) {
                System.out.print(i+" x "+j+" = "+ (i*j) + "\t");
            }
            System.out.println();
        }
    }
    public void Pr10(int n){
        int half = n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==half || j==half){
                    System.out.print("+ ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public boolean Pr11(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public void Pr12(int n){
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(i+" ");
            }
        }
    }
    public void Pr13(int a, int b){
        for (int i = 0; i < b; i++) {
            System.out.print(a+" ");
        }
    }
    public int Pr14(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a=temp;
        }
        return a;
    }
    public void Pr15(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("% ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public int Pr16(int a, int n){
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= a;
        }
        return power;
    }
    public int Pr17(int a, int b){
        return (a*b)/Pr14(a,b);
    }
    public void Pr18(int n ){
        for (int i = 1; i <= n  ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
    public void Pr19(int n ){
        for (int i = 1; i <= n/2+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        for (int i = n/2; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    public void Pr20(int n){
        for (int i = 1; i <= n  ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
