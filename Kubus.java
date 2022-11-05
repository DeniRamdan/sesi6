package com.bangunruang;
import java.util.Scanner;
import com.Interfaces.*;

public class Kubus extends BangunRuang implements Rusuk {
    Scanner input = new Scanner(System.in);
    int sisi;
    int RusukKubus =12;
    double LuasPermukaan ;
    double Volume ;

   @Override
   public int RusukBangunRuang() {
       System.out.println("Jumlah Rusuk Kubus adalah : "+RusukKubus);
       return RusukKubus;
   }

    @Override
    public double LuasPermukaan() {
            System.out.println("======= MENGHITUNG LUAS PERMUKAAN KUBUS =======");
            System.out.print("Masukan Sisi : ");
            sisi =input.nextInt();
            LuasPermukaan =6 * sisi * sisi;
            System.out.println("Luas Permukaan Kubus Tersebut Adalah : "+LuasPermukaan);
            System.out.println("========================================================");
            return LuasPermukaan;
    }

    @Override
    public double Volume () {
            System.out.println("======= MENGHITUNG VOLUME KUBUS =======");
            System.out.print("Masukan Sisi : ");
            sisi = input.nextInt();
            Volume =sisi * sisi * sisi;
            System.out.println("Luas Permukaan Kubus Tersebut Adalah : "+Volume);
            RusukBangunRuang();
            System.out.println("========================================================");
            return Volume;
    }

    @Override
    public void display() {
        LuasPermukaan();
        Volume();
        
    }

}
