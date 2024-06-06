import javax.swing.*;
import java.util.Scanner;

public class THkiemtranamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nam can kiem tra: ");
        int n = sc.nextInt();
        if ((n % 4 == 0) && (n % 100 != 0)) {
            System.out.println(n + " la nam nhuan");
        }else {
            if(n%100==0&&n%400!=0){
                System.out.println(n + " khong la nam nhuan");
            }else if(n%100==0&&n%400==0){
                System.out.println(n + " la nam nhuan");

            }
        }
    }
}
