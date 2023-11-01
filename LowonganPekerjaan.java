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
import java.util.List;

class LowonganPekerjaan {
    private String judulLowongan;
    private String deskripsiLowongan;
    private String perusahaan;
    private String lokasi;
    private String kriteriaPekerja;
    private String kontakNarahubung;

    public LowonganPekerjaan(String judulLowongan, String deskripsiLowongan, String perusahaan, String lokasi, String kriteriaPekerja, String kontakNarahubung) {
        this.judulLowongan = judulLowongan;
        this.deskripsiLowongan = deskripsiLowongan;
        this.perusahaan = perusahaan;
        this.lokasi = lokasi;
        this.kriteriaPekerja = kriteriaPekerja;
        this.kontakNarahubung = kontakNarahubung;
    }

    public String getJudulLowongan() {
        return judulLowongan;
    }

    public void setJudulLowongan(String judulLowongan) {
        this.judulLowongan = judulLowongan;
    }

    public String getDeskripsiLowongan() {
        return deskripsiLowongan;
    }

    public void setDeskripsiLowongan(String deskripsiLowongan) {
        this.deskripsiLowongan = deskripsiLowongan;
    }

    public void unggahLowongan() {
    System.out.println("Lowongan pekerjaan '" + judulLowongan + "' berhasil diunggah.");
}


    public void tampilkanLowongan() {
        System.out.println("Judul Lowongan: " + judulLowongan);
        System.out.println("Deskripsi Lowongan: " + deskripsiLowongan);
        System.out.println("Perusahaan: " + perusahaan);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Kriteria Pekerja: " + kriteriaPekerja);
        System.out.println("Kontak Narahubung: " + kontakNarahubung);
    }

    public void perbaruiLowongan(String judulBaru, String deskripsiBaru, String perusahaanBaru, String lokasiBaru, String kriteriaBaru, String kontakBaru) {
        this.judulLowongan = judulBaru;
        this.deskripsiLowongan = deskripsiBaru;
        this.perusahaan = perusahaanBaru;
        this.lokasi = lokasiBaru;
        this.kriteriaPekerja = kriteriaBaru;
        this.kontakNarahubung = kontakBaru;
    }

    // Metode Hapus Lowongan
    public void hapusLowongan() {
        if (judulLowongan.contains((CharSequence) this)) {
        System.out.println("Lowongan pekerjaan '" + judulLowongan + "' berhasil dihapus.");
    } else {
        System.out.println("Lowongan pekerjaan tidak ditemukan.");
    }
    }
}
