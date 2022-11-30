import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,secim;
        System.out.print("Birinci sayiyi girin : ");
        n1= input.nextInt();
        System.out.print("Ikinci sayiyi girin : ");
        n2=input.nextInt();
        System.out.print("Menu\n***************************************************\n");
        System.out.print("1->Toplama\n2->Cikarma\n3->carpma\n4->Bolme\n");
        System.out.print("Hangi islemi yapmak istersiniz : ");
        secim= input.nextInt();

        if(secim>4 || secim<1){
            System.out.print("Hatali deger girdiniz lutfen tekrar giriniz : ");
        }
        else {
            switch (secim) {
                case 1:
                    System.out.print("Islemin sonucu : " + (n1 + n2));
                    break;
                case 2:
                    System.out.print("Islemin sonucu : " + (n1 - n2));
                    break;
                case 3:
                    System.out.print("Islemin sonucu : " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.print("Hicbir sayi 0 a bolunemez Lutfen farkli bir sayi girin :) ");
                    } else
                        System.out.print("Islemin sonucu : " + (n1 / n2));
                    break;
            }
        }
    }
}
