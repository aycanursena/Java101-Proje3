import java.util.Scanner;

public class RecursiveUsAlma {
    static int UsAlma(int taban, int kuvvet){
        if (kuvvet == 0){
            return  1;
        }
        return taban * UsAlma(taban, (kuvvet - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri : ");
        int taban = input.nextInt();
        System.out.print("Kuvvet değeri : ");
        int kuvvet = input.nextInt();

        System.out.println("Cevabınız : " + UsAlma(taban, kuvvet));
    }
}
