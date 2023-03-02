import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kAy,kGun;

        Scanner oku=new Scanner(System.in);

        System.out.println("Hangi ayda Dogdunuz (sayiyla giriniz) : ");
        kAy=oku.nextInt();

        System.out.println("Hangi günde Dogdunuz (sayiyla giriniz) : ");
        kGun=oku.nextInt();

        if(kAy==1){
            if(kGun<=31 && kGun>=22){
                System.out.println("Kova Burcu");
            }else {
                System.out.println("Oglak Burcu");
            }
        }

        if(kAy==2){
            if(kGun<=29 && kGun>=20){
                System.out.println("Balık Burcu");
            }else {
                System.out.println("Kova Burcu");
            }
        }

        if(kAy==3){
            if(kGun<=31 && kGun>=21){
                System.out.println("Koc Burcu");
            }else {
                System.out.println("Balık Burcu");
            }
        }

        if(kAy==4){
            if(kGun<=30 && kGun>=21){
                System.out.println("Boga Burcu");
            }else {
                System.out.println("Koc Burcu");
            }
        }

        if(kAy==5){
            if(kGun<=31 && kGun>=22){
                System.out.println("İkizler Burcu");
            }else {
                System.out.println("Boga Burcu");
            }
        }

        if(kAy==6){
            if(kGun<=30 && kGun>=23){
                System.out.println("Yengec Burcu");
            }else {
                System.out.println("Ikizler Burcu");
            }
        }

        if(kAy==7){
            if(kGun<=31 && kGun>=23){
                System.out.println("Aslan Burcu");
            }else {
                System.out.println("Yengec Burcu");
            }
        }

        if(kAy==8){
            if(kGun<=31 && kGun>=23){
                System.out.println("Basak Burcu");
            }else {
                System.out.println("Aslan Burcu");
            }
        }

        if(kAy==9){
            if(kGun<=30 && kGun>=23){
                System.out.println("Terazi Burcu");
            }else {
                System.out.println("Basak Burcu");
            }
        }

        if(kAy==10){
            if(kGun<=31 && kGun>=23){
                System.out.println("Akrep Burcu");
            }else {
                System.out.println("Terazi Burcu");
            }
        }

        if(kAy==11){
            if(kGun<=30 && kGun>=22){
                System.out.println("Yay Burcu");
            }else {
                System.out.println("Akrep Burcu");
            }
        }

        if(kAy==12){
            if(kGun<=31 && kGun>=22){
                System.out.println("Oglak Burcu");
            }else {
                System.out.println("Akrep Burcu");
            }
        }


    }
}