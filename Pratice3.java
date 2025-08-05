import java.util.Scanner;

public class Pratice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số thứ hai: ");
        int y = Integer.parseInt(scanner.nextLine());
        int a =x ,b = y;
        int temp =0 ;
        while(b != 0){// thuật toán Euclid
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("UCLN của " + x +" và " + y+ " : " + a);
    }
}
