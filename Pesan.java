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

public class Pesan {
    private String isiPesan;
    private String penerima;
    private String pengirim;
    private Date waktuPengiriman;
    private String status;

    // Konstruktor
    public Pesan(String isiPesan, String penerima, String pengirim) {
        this.isiPesan = isiPesan;
        this.penerima = penerima;
        this.pengirim = pengirim;
        this.waktuPengiriman = new Date(); // Menginisialisasi waktu pengiriman saat objek pesan dibuat
        this.status = "Dikirim"; // Status awal pesan adalah "Dikirim"
    }

    // Metode Kirim Pesan
    public void kirimPesan() {
        // Implementasi untuk mengirim pesan, misalnya melalui jaringan atau penyimpanan pesan.
        this.status = "Dikirim";
        // Setelah pengiriman pesan, Anda dapat memberi tahu pengguna tentang pengiriman sukses.
        notifikasiPesanBaru();
    }

    // Metode Tampilkan Pesan
    public void tampilkanPesan() {
        System.out.println("Pengirim: " + pengirim);
        System.out.println("Penerima: " + penerima);
        System.out.println("Isi Pesan: " + isiPesan);
        System.out.println("Waktu Pengiriman: " + waktuPengiriman);
        System.out.println("Status: " + status);
    }

    // Metode Hapus Pesan
    public void hapusPesan() {
  
    if (this.status.equals("Dikirim")) {
        // memeriksa status "Dikirim" sebelum dihapus.
        this.status = "Dihapus";
        this.isiPesan = "Pesan telah dihapus";
        System.out.println("Pesan telah dihapus.");
    } else {
        System.out.println("Pesan tidak dapat dihapus karena telah dibaca atau dalam status lain.");
    }
}


    // Metode Notifikasi Pesan Baru
    public void notifikasiPesanBaru() {
        // Bisa berupa pesan pop-up, suara, atau cara notifikasi lainnya.
        System.out.println("Anda memiliki pesan baru dari " + pengirim);
    }
}