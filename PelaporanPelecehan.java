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

public class PelaporanPelecehan {
    private String jenisPelecehan;
    private String deskripsiKejadian;
    private List<String> bukti;
    private String statusPelaporan;
    private String penggunaPelapor;
    private Date tanggalLaporan;
    private List<String> penerimaPemberitahuan;

    // Konstruktor
    public PelaporanPelecehan(String jenisPelecehan, String deskripsiKejadian, String penggunaPelapor) {
        this.jenisPelecehan = jenisPelecehan;
        this.deskripsiKejadian = deskripsiKejadian;
        this.bukti = new ArrayList<>();
        this.statusPelaporan = "Dikirim"; // Status awal pelaporan adalah "Dikirim"
        this.penggunaPelapor = penggunaPelapor;
        this.tanggalLaporan = new Date(); // Menginisialisasi tanggal laporan saat objek laporan dibuat
        this.penerimaPemberitahuan = new ArrayList<>();
    }

    // Metode Buat Laporan
    public void buatLaporan() {
        PelaporanPelecehan laporan = new LaporanPelecehan(jenisPelecehan, deskripsiKejadian, penggunaPelapor, new Date());
        daftarLaporanPelecehan.add(laporan);
        statusPelaporan = "Diterima";
        System.out.println("Laporan pelecehan telah dibuat dan disimpan.")
    }

    // Metode Tinjau Laporan
    public void tinjauLaporan(String status) {
        this.statusPelaporan = status;
        
    }

    // Metode Kirim Pemberitahuan Laporan
    public void kirimPemberitahuanLaporan(String pesan) {
        penerimaPemberitahuan.add(pesan);
       
    }

    // Metode Tanggapi Permintaan Bantuan
 public void tanggapiPermintaanBantuan(String status) {
    System.out.println("Tanggapan atas permintaan bantuan: " + status);
}
    // Metode Tambah Bukti
    public void tambahBukti(String bukti) {
        this.bukti.add(bukti);
       
    }
}