import java.util.Scanner;

public class RecursiveAsalSayi {
    static boolean AsalSayi(int sayi) {
        int a = 0;
        for (int i = 2; i < sayi; i++){
            if (sayi % i == 0){
                a++;
            }
        }if (a == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Girin: ");
        int sayi = input.nextInt();

        if (AsalSayi(sayi) && sayi != 1){
            System.out.println("Asal sayıdır!");
        }else{
            System.out.println("Asal sayı değildir.!");
        }
    }
}
