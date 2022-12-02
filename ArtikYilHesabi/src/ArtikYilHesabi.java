import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz : ");
        yil=input.nextInt();
        if (yil%4==0){
            if (yil%100==0){
                if (yil%400==0){
                    System.out.print(yil + " Artik yildir . ");
                }
                else {
                    System.out.print(yil + " Artik yil degildir . ");
                }
            }else {
                System.out.print(yil + " Artik yildir . ");
            }
        }
        else {
            System.out.print(yil + " Artik yil degildir . ");
        }
    }
}
