import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        int number = input.nextInt();
        int max=-999999999,min=999999999;
        for (int i=1;i<=number;i++) {
            System.out.print(i+". sayıyı giriniz : ");
            int a = input.nextInt();
            if (a > max) { max = a;}
            else if (min>a) {min = a;}

        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
