import java.util.Scanner;

public class Pratice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0 ;
        boolean isTrue = false;
        do{
            System.out.println("Nhập vào số (>1): ");
            number = Integer.parseInt(scanner.nextLine());
        }while(number < 2 );

        for(int i = 2; i < number -1;i++){
            if(number %i == 0){
                isTrue = true;
            }
        }
        if(!isTrue){
            System.out.println("Số "+number+ " là số nguyên tố");
        }else {
            System.out.println("Số "+ number+ " Không là số nguyên tố");
        }
    }
}
