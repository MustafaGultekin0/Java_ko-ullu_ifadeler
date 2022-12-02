import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dyili;
        System.out.print("Dogum yilinizi girin : ");
        dyili=input.nextInt();
        if (dyili%12==0){
            System.out.print("Cin Zodyagi Burcunuz : Maymun" );
        } else if (dyili%12==1) {
            System.out.print("Cin Zodyagi Burcunuz : Horoz" );
        }
        else if (dyili%12==2) {
            System.out.print("Cin Zodyagi Burcunuz : Kopek" );
        }
        else if (dyili%12==3) {
            System.out.print("Cin Zodyagi Burcunuz : Domuz" );
        }
        else if (dyili%12==4) {
            System.out.print("Cin Zodyagi Burcunuz : Fare" );
        }
        else if (dyili%12==5) {
            System.out.print("Cin Zodyagi Burcunuz : Okuz" );
        }
        else if (dyili%12==6) {
            System.out.print("Cin Zodyagi Burcunuz : Kaplan" );
        }
        else if (dyili%12==7) {
            System.out.print("Cin Zodyagi Burcunuz : Tavsan" );
        }
        else if (dyili%12==8) {
            System.out.print("Cin Zodyagi Burcunuz : Ejderha" );
        }
        else if (dyili%12==9) {
            System.out.print("Cin Zodyagi Burcunuz : Yilan" );
        }
        else if (dyili%12==10) {
            System.out.print("Cin Zodyagi Burcunuz : At" );
        }else if (dyili%12==11) {
            System.out.print("Cin Zodyagi Burcunuz : Koyun" );
        }
    }
}
