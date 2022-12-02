import java.util.Scanner;

public class UcakBiletRezervasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,yas,ytipi;//ytipi = yolculuk tipi,ntutar=normal tutar
        double indirimTutari = 0,ntutar,toplamTutar=0;
        System.out.print("Mesafeyi Kilometre cinsinden giriniz : ");
        mesafe=input.nextInt();
        if (mesafe<0){
            System.out.print("Hatali deger girdiniz :( ");
            System.exit(0);
        }
        System.out.print("Yasinizi giriniz : ");
        yas=input.nextInt();
        if (yas<0){
            System.out.print("Hatali deger girdiniz :( ");
            System.exit(0);
        }
        System.out.print("Yolculuk tipiniz giriniz ( 1=> Tek Yon , 2=> Gidis donus ) : ");
        ytipi=input.nextInt();
        if (ytipi<0 || ytipi>2){
            System.out.print("Hatali deger girdiniz :( ");
            System.exit(0);
        }
        ntutar= mesafe*0.10;

            if (yas <= 12) {
                indirimTutari = ntutar * 0.50;
                toplamTutar=ntutar-indirimTutari;
            } else if (yas > 12 && yas < 24) {
                indirimTutari = ntutar * 0.10;
                toplamTutar=ntutar-indirimTutari;
            } else if (yas > 65) {
                indirimTutari = ntutar * 0.30;
                toplamTutar=ntutar-indirimTutari;
            }
            else {
                toplamTutar=ntutar;
            }
        if (ytipi==1) {
            System.out.print("Total tutar : " + toplamTutar);
        }else {
            toplamTutar=toplamTutar-toplamTutar*0.20;
            System.out.print("Total tutar : "+toplamTutar*2);
        }
    }
}
