public class PalindromSayi {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0){
            //System.out.println("-----------------------");
            //System.out.println("Sayı : " + geciciSayi);
            /* sonSayi=sayi dersen sayi'yi 345 olarak alır ve son basamak 5 olur yine.
               geçici sayı kullanmamızın (yeni sayıya atama) nedeni bu.
             */
            lastNumber = temp % 10;
            //System.out.println("Son basamak : " + sonSayi);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            //System.out.println("Yeni Sayı : " + tersSayi);
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(4004));
    }
}