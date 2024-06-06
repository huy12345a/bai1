import java.util.Scanner;

public class BTchuyendoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien USD : ");
        float USD = sc.nextFloat();
        System.out.println("chuyen sang VND : " + USD*23000);
    }
}
