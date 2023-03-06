import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int toplama(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }
    static int cikarma(int a, int b){
        int result = a - b;
        System.out.println("Fark : "+ result);
        return result;
    }
    static int carpma(int a, int b){
        int result = a * b;
        System.out.println("Çarpım : " + result);
        return result;
    }static  double bolme(int a, int b){
        double result = a / b;
        System.out.println("Bölüm : " + result);
        return result;
    }
    static  double UsAlma(int a, int b){
        double result;
        result = Math.pow(a, b);
        System.out.println("Üslü İfade Sonucunuz : " + result);
        return  result;
    }
    static double ModAlma(int a, int b){
        double result;
        result = a % b;
        System.out.println("Mod Alma İşlemi Sonucunuz : " + result);
        return result;
    }
    static void AlanCevreHesabi(int a, int b){
        System.out.println("Çevresi : " + (a + b));
        System.out.println("Alanı : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int secim;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesanı\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("İŞlem seçiminiz : ");
            secim = inp.nextInt();

            if (secim == 0){
                break;
            }
            System.out.print("Sayı giriniz : ");
            int a = inp.nextInt();
            System.out.print("Sayı giriniz : ");
            int b = inp.nextInt();

            switch (secim) {
                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikarma(a, b);
                    break;
                case  3:
                    carpma(a, b);
                    break;
                case 4:
                    bolme(a, b);
                    break;
                case 5:
                    UsAlma(a, b);
                    break;
                case 6:
                    ModAlma(a, b);
                    break;
                case 7:
                    AlanCevreHesabi(a, b);
                    break;
                default:
                    System.out.println("Yanlış Bir Değer Girdiniz..!");
            }
        }
        System.out.println("Güle Güle...");
    }
}