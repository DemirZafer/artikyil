import java.util.Scanner;

public class Artikyil {
    public static void main(String[] args) {
        Scanner dt=new Scanner(System.in);
        int yil , artik;
        System.out.println("Yıl giriniz : ");
        yil = dt.nextInt();
        artik = yil % 4;
        if (artik==0){
            System.out.println(yil+" Bir artık yıldır!");
        }else {
            System.out.println(yil+" Artık yıl değildir!");
        }

    }
}
