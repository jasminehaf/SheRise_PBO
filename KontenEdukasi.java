/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sherise;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class KontenEdukasi {
    private String judulKonten;
    private String jenisKonten;
    private String pengirimKonten;
    private Date waktuUnggah;
    private List<String> komentar;
    
    // Konstruktor
    public KontenEdukasi(String judulKonten) {
        this.judulKonten = judulKonten;
        this.jenisKonten = jenisKonten;
        this.pengirimKonten = pengirimKonten;
        this.waktuUnggah = new Date(); // Menginisialisasi waktu unggah saat objek konten dibuat
        this.komentar = new ArrayList<>();
    }
    
    // Metode Unggah Konten
    public void unggahKonten(String jenisKonten, String pengirimKonten) {
    this.jenisKonten = jenisKonten;
    this.pengirimKonten = pengirimKonten;
    }
    
    // Metode Menampilkan Konten
    public void tampilkanKonten() {
        System.out.println("Judul Konten: " + judulKonten);
        System.out.println("Jenis Konten: " + jenisKonten);
        System.out.println("Pengirim Konten: " + pengirimKonten);
        System.out.println("Waktu Unggah: " + waktuUnggah);
        System.out.println("Komentar:");
        for (String kom : komentar) {
            System.out.println(" - " + kom);
        }
    }
    
    // Metode Share Konten
    public void shareKonten() {
        System.out.println("Konten " + judulKonten + " berhasil dibagikan.");
    }
    
    // Metode Memberi Komentar
    public void beriKomentar(String komentar) {
        this.komentar.add(komentar);
    }

    boolean getJudulKonten() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
