import java.util.Scanner;

public class THgiaiptbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("giai pt ax+b=c");
        System.out.print("nhap vao a : ");
        double a = sc.nextInt();
        System.out.print("nhap vao b : ");
        double b = sc.nextInt();
        System.out.print("nhap vao c : ");
        double c = sc.nextInt();
        if(a!=0){
            System.out.println("phuong trinh co 1 ngiem duy nhat la : " + (c-b)/a);
        }else if(b==c){
            System.out.println("phuong trinh vo so nghiem");
        }else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
