import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.println("Nhập n(>0): ");
            n = Integer.parseInt(sc.nextLine());
        }while(n<0);
        int count = 1;
        int sum = 0;
        while(count <= n){
            System.out.println("Nhập số thứ "+ count);
            int number = Integer.parseInt(sc.nextLine());
            sum += number;
            count++;
        }
        System.out.println("Sum = "+ sum);
    }
}
