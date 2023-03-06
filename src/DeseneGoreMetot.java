import java.util.Scanner;

public class DeseneGoreMetot {
    static void Azalma(int a, int miktar){
        System.out.print(a + " ");
        if (a > 0){
            miktar++;
            Azalma(a -5, miktar);
        }
        else{
            while (miktar > 0){
                System.out.print((a + 5) + " ");
                a += 5;
                miktar--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        Azalma(sayi, 0);
    }
}