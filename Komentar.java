/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sherise;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
import java.util.Date;

public class Komentar {
    private String isiKomentar;
    private String pengirimKomentar;
    private Date tanggalWaktuKomentar;

    public Komentar(String isiKomentar, String pengirimKomentar) {
        this.isiKomentar = isiKomentar;
        this.pengirimKomentar = pengirimKomentar;
        this.tanggalWaktuKomentar = new Date();
    }

    public String getIsiKomentar() {
        return isiKomentar;
    }

    public String getPengirimKomentar() {
        return pengirimKomentar;
    }

    public Date getTanggalWaktuKomentar() {
        return tanggalWaktuKomentar;
    }

    public void tampilkanInfoKomentar() {
        System.out.println("Pengirim: " + getPengirimKomentar());
        System.out.println("Isi Komentar: " + getIsiKomentar());
        System.out.println("Tanggal & Waktu: " + getTanggalWaktuKomentar());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pengirim komentar: ");
        String namaPengirim = input.nextLine();

        System.out.print("Masukkan isi komentar: ");
        String isiKomentar = input.nextLine();

        Komentar komentar = new Komentar(isiKomentar, namaPengirim);

        System.out.println("Info Komentar:");
        komentar.tampilkanInfoKomentar();
    }
}
