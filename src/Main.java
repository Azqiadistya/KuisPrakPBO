/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("=== FORM PENDAFTARAN PT.UDIN ===");
        System.out.println(" 1. Android Development");
        System.out.println(" 2. Web Development");
        System.out.print(" Pilih Jenis Form : ");
        int pilih = input.nextInt();
        
        System.out.println("=== FORM PENDAFTARAN ===");
        Scanner data= new Scanner(System.in);
        System.out.print(" Input NIK : ");
        String NIK = data.next();
        System.out.print(" Input Nama : ");
        String nama = data.next();

        //Scanner input= new Scanner(System.in);
        System.out.print(" Input Nilai Tes Tulis : ");
        int tesTulis = data.nextInt();
        System.out.print(" Input Nilai Tes Coding : ");
        int tesCoding = data.nextInt();
        System.out.print(" Input Nilai Tes Wawancara : ");
        int tesWawancara = data.nextInt();

        if (pilih == 1){
            //UNTUK ANDROID DEVELOPMENT
            AndroidDev androidDev = new AndroidDev(NIK,nama,tesTulis,tesCoding,tesWawancara);
            //input variabel disimpan
            do{
                //Scanner input= new Scanner(System.in);
                System.out.println("=== MENU ===");
                System.out.println(" 1. Edit");
                System.out.println(" 2. Tampil");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    //input ketika edit
                    System.out.print("Input Nilai Tes Tulis : ");
                    androidDev.inputTesTulis(input.nextInt());
                    System.out.print("Input Nilai Tes Coding : ");
                    androidDev.inputTesCoding(input.nextInt());
                    System.out.print("Input Nilai Tes Wawancara : ");
                    androidDev.inputTesWawancara(input.nextInt());
                }
                else if (pilihMenu == 2){
                    //hasil seleksi
                    System.out.println("Nilai Akhir : " + androidDev.hitungNilai());
                    System.out.println("Keterangan : " + androidDev.keterangan());
                }
                else {
                    break;
                }
            }while(true);
        }
        else if (pilih == 2){
            //UNTUK WEB DEVELOPMENT
            WebDev webDev = new WebDev(NIK,nama,tesTulis,tesCoding,tesWawancara);
            do{
                //Scanner input= new Scanner(System.in);
                System.out.println("=== MENU ===");
                System.out.println(" 1. Edit");
                System.out.println(" 2. Tampil");
                System.out.println(" 3. Exit");
                System.out.print(" Pilih : ");
                int pilihMenu = input.nextInt();
                
                if(pilihMenu == 1){
                    //input ketika edit
                    System.out.print("Input Nilai Tes Tulis : ");
                    webDev.inputTesTulis(input.nextInt());
                    System.out.print("Input Nilai Tes Coding : ");
                    webDev.inputTesCoding(input.nextInt());
                    System.out.print("Input Nilai Tes Wawancara : ");
                    webDev.inputTesWawancara(input.nextInt());
                }
                else if (pilihMenu == 2){
                    //hasil seleksi
                    System.out.println("Nilai Akhir : " + webDev.hitungNilai());
                    System.out.println("Keterangan : " + webDev.keterangan());
                }
                else {
                    break;
                }
            }while(true);
        }
        else{
            //JIKA INPUT SELAIN 1/2
            System.out.println("=== Input SALAH ===");
            System.out.println("(Mohon Input Ulang)");
        }
    }

}
