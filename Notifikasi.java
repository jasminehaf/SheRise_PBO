/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sherise;

/**
 *
 * @author Lenovo
 */
import java.util.Date;

class Notifikasi {
    private String jenisNotifikasi;
    private String penerimaNotifikasi;
    private String isiNotifikasi;
    private Date waktuNotifikasi;

    // Constructor
    public Notifikasi(String jenisNotifikasi, String penerimaNotifikasi, String isiNotifikasi) {
        this.jenisNotifikasi = jenisNotifikasi;
        this.penerimaNotifikasi = penerimaNotifikasi;
        this.isiNotifikasi = isiNotifikasi;
        this.waktuNotifikasi = new Date(); // Menginisialisasi waktu notifikasi saat objek notifikasi dibuat
    }

    // Metode Kirim Notifikasi
    public void kirimNotifikasi() {
        System.out.println("Mengirim notifikasi kepada " + penerimaNotifikasi);
        System.out.println("Jenis Notifikasi: " + jenisNotifikasi);
        System.out.println("Isi Notifikasi: " + isiNotifikasi);
        System.out.println("Waktu Notifikasi: " + waktuNotifikasi);
}

    // Metode Tampilkan Notifikasi
    public void tampilkanNotifikasi() {
        System.out.println("Jenis Notifikasi: " + jenisNotifikasi);
        System.out.println("Penerima Notifikasi: " + penerimaNotifikasi);
        System.out.println("Isi Notifikasi: " + isiNotifikasi);
        System.out.println("Waktu Notifikasi: " + waktuNotifikasi);
    }

    // Metode Edit Notifikasi
    public void editNotifikasi(String isiBaru) {
        this.isiNotifikasi = isiBaru;
    }
}
