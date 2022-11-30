import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayac=0;
        String userName,password,ruserName="kodluyoruz",rpassword="kodla123";
        System.out.print("Kullanici adinizi giriniz : ");
        userName=input.nextLine();
        System.out.print("Sifrenizi girin : ");
        password=input.nextLine();

        if(userName.equals(ruserName)&&password.equals(rpassword)){
            System.out.print("Sisteme basarili bir sekilde giris yapildi :)");
        }else{
                System.out.println("Hatali kullanici adi veya sifre :(");
        }
    }
}
