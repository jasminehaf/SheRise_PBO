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

public class ForumKomunitas {
    private String namaKomunitas;
    private String deskripsiKomunitas;
    private List<String> anggotaKomunitas;
    private Date tanggalPembuatan;
    private String kategoriKomunitas;
    private String pembuatKomunitas;
    private List<String> kontenKomunitas;

    // Konstruktor
    public ForumKomunitas(String namaKomunitas) {
        this.namaKomunitas = namaKomunitas;
        this.deskripsiKomunitas = deskripsiKomunitas;
        this.anggotaKomunitas = new ArrayList<>();
        this.tanggalPembuatan = new Date(); // Menginisialisasi tanggal pembuatan saat objek komunitas dibuat
        this.kategoriKomunitas = kategoriKomunitas;
        this.pembuatKomunitas = pembuatKomunitas;
        this.kontenKomunitas = new ArrayList<>();
    }

    // Metode Membuat Komunitas
    public void membuatKomunitas(String deskripsiKomunitas, String kategoriKomunitas, String pembuatKomunitas) {
    this.deskripsiKomunitas = deskripsiKomunitas;
    this.kategoriKomunitas = kategoriKomunitas;
    this.pembuatKomunitas = pembuatKomunitas;
    System.out.println("Komunitas " + namaKomunitas + " berhasil dibuat oleh " + pembuatKomunitas);
    }

    // Metode Menampilkan Isi Komunitas
    public void tampilkanIsiKomunitas() {
        System.out.println("Nama Komunitas: " + namaKomunitas);
        System.out.println("Deskripsi Komunitas: " + deskripsiKomunitas);
        System.out.println("Pembuat Komunitas: " + pembuatKomunitas);
        System.out.println("Kategori Komunitas: " + kategoriKomunitas);
        System.out.println("Tanggal Pembuatan: " + tanggalPembuatan);
        System.out.println("Anggota Komunitas: " + anggotaKomunitas);
        System.out.println("Konten Komunitas: " + kontenKomunitas);
    }

    // Metode Menambahkan Anggota
    public void tambahAnggota(String anggota) {
        anggotaKomunitas.add(anggota);
    }

    // Metode Mengunggah Konten
    public void unggahKonten(String konten) {
        kontenKomunitas.add(konten);
        System.out.println("Konten berhasil diunggah!");
    }

    boolean getNamaKomunitas() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}