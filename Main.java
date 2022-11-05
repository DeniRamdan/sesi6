package com.bangunruang;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int pilih;
    static int n;

    void display() {
        System.out.println("================================================");
        System.out.println("Nama  : Deni Ramdan Septian");
        System.out.println("Nim   : 20210040055");
        System.out.println("Kelas : TI21C");
        System.out.println("=================================================");
        System.out.println("== TUGAS PEMROGRAMAN BERORIENTASI OBJEK SESI 6 ==");
        System.out.println("=================================================");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.display();
        for (n = 0; n < 99; n++) {
            System.out.println("============= BANGUN RUANG =============");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("==========================================");
            System.out.print("Masukan Pilihan Anda : ");
            pilih = input.nextInt();

            if (pilih == 1) {
                Kubus kubus = new Kubus();
                kubus.display();
            } else if (pilih == 2) {
                Balok balok = new Balok();
                balok.display();
            } else if (pilih == 3) {

                Bola bola = new Bola();
                bola.display();
            } else {
                System.out.println("Pilihan Anda Tidak Ada Di Daftar , Silahkan Pilih kembali pilihan anda");
            }
        }

    }
}
