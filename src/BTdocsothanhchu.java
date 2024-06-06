import java.util.Scanner;

public class BTdocsothanhchu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so can doc : ");
        int n = sc.nextInt();
        String[] arr ={"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin", "muoi" };
        int a=n/10;
        int b=n%10;
        if (n>=0 && n<=10){
            System.out.println("doc la : " + arr[n]);
                }
        if (n>10&&n<20){
            System.out.println("doc la : mười "+ arr[b]);
        }
        if(n>20 && n<100&&n%10!=0){
            System.out.println("doc la : "+ arr[a]+" muoi " + arr[b]);
        }
        if (n%10==0&&n!=10){
            System.out.println("đọc là : " + arr[a] + " muoi");
        }
            }
        }


