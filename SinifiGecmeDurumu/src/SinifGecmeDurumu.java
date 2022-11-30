import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fiz,kim,tur,muz;
        double ort;

        System.out.print("Matematik notunuzu girin : ");
        mat=input.nextInt();
        System.out.print("Fizik notunuzu girin : ");
        fiz=input.nextInt();
        System.out.print("Kimya notunuzu girin : ");
        kim=input.nextInt();
        System.out.print("Turkce notunuzu girin : ");
        tur=input.nextInt();
        System.out.print("Muzik notunuzu girin : ");
        muz=input.nextInt();

        ort=(mat+fiz+kim+tur+muz)/5;

        if(ort>=55){
            System.out.println("Tebrikler Sinifi gectiniz !!");
        }else {
            System.out.print("Maalesef sinifta kaldin seneye gorusmek uzere !!");
        }
        System.out.print("Not ortalamaniz : "+ort);
    }
}
