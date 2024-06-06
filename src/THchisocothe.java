import java.util.Scanner;

public class THchisocothe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu cao: ");
        float cao = sc.nextFloat();
        System.out.println("nhap vao can nang: ");
        float nang = sc.nextFloat();
        float BMi = nang/(cao*cao);
        if(BMi<18.5){
            System.out.println("Underweight");
        }else if(BMi<25){
            System.out.println("normal");
        }else if(BMi<30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
