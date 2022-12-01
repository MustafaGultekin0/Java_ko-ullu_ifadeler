import java.util.Scanner;
public class BuyuktenKucuge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1,s2,s3,s4;
        System.out.print("Birinci sayiyi girin : ");
        s1=input.nextInt();
        System.out.print("Ikinci sayiyi girin : ");
        s2=input.nextInt();
        System.out.print("Ucuncu sayiyi girin : ");
        s3=input.nextInt();
        System.out.print("Dorduncu sayiyi girin : ");
        s4=input.nextInt();

        if(s1>s2 && s1>s3 && s1>s4){
            if(s2>s3 && s2>s4){
                if (s3>s4){
                    System.out.print("s1>s2>s3>s4");
                }
                else{
                    System.out.print("s1>s2>s4>s3");
                }
            } else if (s3>s2 && s3>s4) {
                if(s2>s4){
                    System.out.print("s1>s3>s2>s4");
                }
                else{
                    System.out.print("s1>s3>s4>s2");
                }
            } else if (s4>s2 && s4>s3) {
                if (s2>s3){
                    System.out.print("s1>s4>s2>s3");
                }else {
                    System.out.print("s1>s4>s3>s2");
                }
            }
        }
        if(s2>s1 && s2>s3 && s2>s4){
            if(s1>s3 && s1>s4){
                if (s3>s4){
                    System.out.print("s2>s1>s3>s4");
                }
                else{
                    System.out.print("s2>s1>s4>s3");
                }
            } else if (s3>s1 && s3>s4) {
                if(s1>s4){
                    System.out.print("s2>s3>s1>s4");
                }
                else{
                    System.out.print("s2>s3>s4>s1");
                }
            } else if (s4>s1 && s4>s3) {
                if (s1>s3){
                    System.out.print("s2>s4>s1>s3");
                }else {
                    System.out.print("s2>s4>s3>s1");
                }
            }
        }
        if(s3>s1 && s3>s2 && s3>s4){
            if(s1>s2 && s1>s4){
                if (s2>s4){
                    System.out.print("s3>s1>s2>s4");
                }
                else{
                    System.out.print("s3>s1>s4>s2");
                }
            } else if (s2>s1 && s2>s4) {
                if(s1>s4){
                    System.out.print("s3>s2>s1>s4");
                }
                else{
                    System.out.print("s3>s2>s4>s1");
                }
            } else if (s4>s1 && s4>s2) {
                if (s1>s2){
                    System.out.print("s3>s4>s1>s2");
                }else {
                    System.out.print("s3>s4>s2>s1");
                }
            }
        }if(s4>s1 && s4>s2 && s4>s3){
            if(s1>s2 && s1>s3){
                if (s2>s3){
                    System.out.print("s4>s1>s2>s3");
                }
                else{
                    System.out.print("s4>s1>s3>s2");
                }
            } else if (s2>s1 && s2>s3) {
                if(s1>s3){
                    System.out.print("s4>s2>s1>s3");
                }
                else{
                    System.out.print("s4>s2>s3>s1");
                }
            } else if (s3>s1 && s3>s2) {
                if (s1>s2){
                    System.out.print("s4>s3>s1>s2");
                }else {
                    System.out.print("s4>s3>s2>s1");
                }
            }
        }
    }
}
