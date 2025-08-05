import java.util.Scanner;

public class Pratice2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        double deposit = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập tỉ lệ lãi suất trên năm: ");
        double rate = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tháng gửi ");
        int month = Integer.parseInt(scanner.nextLine());
        double interes = deposit * (rate / 12);
        double suminteres = 0;
        for (int i = 0; i < month; i++){
            suminteres += interes;
        }
        System.out.println("Tổng số tiền nhận khi hết thời hạn gửi: "+ (suminteres + deposit));
        System.out.println("Lãi suất "+ month+ " = "+  suminteres);
    }
}
