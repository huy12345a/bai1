import java.util.Scanner;

public class THsongaytrongthang {
    public static void main(String[] args) {
        System.out.println("nhap thang can tim : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String songay = "";
        switch (n) {
            case 2:
                  songay = "28 hoac 29";
                  break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                songay = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                songay = "30";
                break;
        }
        System.out.printf("thang %d co %s ngay", n ,songay);
    }
}
