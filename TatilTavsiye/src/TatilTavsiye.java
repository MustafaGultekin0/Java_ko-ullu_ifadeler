import java.util.Scanner;
public class TatilTavsiye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hdurumu;
        System.out.print("hava durumunu girin : ");
        hdurumu=input.nextInt();

        if(hdurumu<=5){
            System.out.print("Kayak yapabilirsiniz :) ");
        } else if (hdurumu>5 && hdurumu<10) {
            System.out.println("Sinemaya gidebilirsiniz :)");
        }
        else if (hdurumu>=10 && hdurumu<=15) {
            System.out.println("Sinemaya gidebilirsiniz :)");
            System.out.print("Piknige gidebilirsiniz :) ");
        } else if (hdurumu>15 && hdurumu<=25) {
            System.out.print("Piknige gidebilirsiniz :)");
        }else {
            System.out.print("Yuzmeye gidebilirsiniz :) ");
        }

    }
}
