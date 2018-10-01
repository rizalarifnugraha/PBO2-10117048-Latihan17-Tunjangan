/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha
 * Kelas : PBO2 NIM : 10117048
 * Deskripsi Program : Program ini berisi tentang mencari tunjangan karyawan 
 *                     yang sudah menikah/belum dan total gaji.
 */
public class PBO210117048Latihan17Tunjangan {

    /**
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double gapok;
        double tunjangan = 0;
        double gaTot ;

        String status;
        String status1 = "Menikah";
        String status2 = "Belum";

        Scanner in = new Scanner(System.in);

        System.out.println("====== Program Tunjangan ======");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: " +"Rp.");
        gapok = in.nextDouble();
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        status = in.next();
        System.out.println("\n"+"====== Hasil Perhitungan Gaji Anda ======");
        System.out.println("Gaji Pokok\t : Rp. " + gapok);
        if (status.equals(status1)) {
            tunjangan = gapok * 0.35;
            System.out.println("Tunjangan\t : Rp. "  + tunjangan );
        } else {
            System.out.println("Tunjangan\t : Rp. "  + tunjangan );
        }
        gaTot = gapok + tunjangan;
        System.out.println("Total Gaji\t : Rp. "  + gaTot);
        System.out.println("(Developed by : Rizal Arif Nugraha)");

    }

}
