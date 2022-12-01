import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int gun,ay;
        String burc="";
        boolean isError=false;

        System.out.print("Kacinci ay da dogdunuz : ");
        ay=input.nextInt();
        System.out.print("Dogdugunuz gunu girin : ");
        gun=input.nextInt();
        switch (ay){
            case 1:
                if(gun<1 || gun>31){
                    isError=true;
                }else {
                    if (gun < 21) {
                        burc="oglak";
                    } else {
                        burc="kova";
                    }
                }
                break;
            case 2:
                if(gun<1 || gun>29){
                    isError=true;
                }else {
                    if (gun < 20) {
                        burc="kova";
                    } else {
                        burc="balik";
                    }
                }
                break;
            case 3:
                if(gun<1 || gun>31){
                    isError=true;
                }else {
                    if (gun < 22) {
                        burc="Balik";
                    } else {
                        burc="koc";
                    }
                }
                break;
            case 4:
                if(gun<1 || gun>30){
                    isError=true;
                }else {
                    if (gun < 21) {
                        burc="koc";
                    } else {
                        burc="boga";
                    }
                }
                break;
            case 5:
                if(gun<1 || gun>31){
                    isError=true;
                }else {
                    if (gun < 22) {
                        burc="boga";
                    } else {
                        burc="ikizler";
                    }
                }
                break;
            case 6:
                if(gun<1 || gun>30){
                    isError=true;
                }else {
                    if (gun < 22) {
                        burc="ikizler";
                    } else {
                        burc="Yengec";
                    }
                }
                break;
            case 7:
                if(gun<1 || gun>31){
                    isError=true;
                }else {
                    if (gun < 23) {
                        burc="yengec";
                    } else {
                        burc="aslan";
                    }
                }
                break;
            case 8:
                if(gun<1 || gun>31){
                    isError=true;
                }else {
                    if (gun < 24) {
                        burc="aslan";
                    } else {
                        burc="basak";
                    }
                }
                break;
            case 9:
                if(gun<1 || gun>30){
                    isError=true;
                }else {
                    if (gun < 24) {
                        burc="basak";
                    } else {
                        burc="terazi";
                    }
                }
                break;
            case 10:
                if(gun<1 || gun>31){
                    isError=true;
                }else {
                    if (gun < 24) {
                        burc="terazi";
                    } else {
                        burc="akrep";
                    }
                    break;
                }case 11:
                if(gun<1 || gun>30){
                    isError=true;
                }else {
                    if (gun < 23) {
                        burc="akrep";
                    } else {
                        burc="yay";
                    }
                }case 12:
                if(gun<1 || gun>31){
                    isError=true;
                }else {
                    if (gun < 22) {
                        burc="yay";
                    } else {
                        burc="oglak";
                    }
                }
                break;
            default:
                isError=true;

            if (isError == true){
                System.out.print("Hatali bir deger girdiniz lutfen tekrar deneyin");
            }else {
                System.out.print("Burcunuz : " + burc);
            }
        }
    }
}
