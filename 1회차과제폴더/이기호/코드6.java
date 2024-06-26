import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c ){
            System.out.print(10000 + a*1000);
        } else if (a == b || b == c || c == a){
            if (a == b){
                System.out.print(1000 + a * 100);
            } else if (b == c){
                System.out.print(1000 + b * 100);
            } else {
                System.out.print(1000 + c * 100);
            }
        } else {
            int max = Math.max(Math.max(a, b), c);
            System.out.print(max * 100);
        }
    }
}
