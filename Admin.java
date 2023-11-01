/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sherise;

/**
 *
 * @author Lenovo
 */
public class Admin extends User {
    public Admin(String username, String email, String password, String phoneNumber) {
        super(username, email, password, phoneNumber, true);
    }

    public void manageUsers() {
        System.out.println("Admin is managing users.");
    }

    public void terimaLaporan(User pelapor, String jenisLaporan, String deskripsiLaporan) {
        System.out.println("Laporan diterima dari " + pelapor.getUsername() + " - Jenis: " + jenisLaporan);
    }

    public void verifikasiLaporan(User pelapor, String jenisLaporan) {
        System.out.println("Laporan dari " + pelapor.getUsername() + " telah diverifikasi - Jenis: " + jenisLaporan);
    }

    public void kelolaDaftarPelapor() {
        System.out.println("Admin is managing the list of reporters.");
    }

    public void tindaklanjuti(User pelapor, String jenisLaporan) {
        System.out.println("Tindak lanjut laporan dari " + pelapor.getUsername() + " - Jenis: " + jenisLaporan);
    }

    public void hapusLaporan(User pelapor, String jenisLaporan) {
        System.out.println("Laporan dari " + pelapor.getUsername() + " telah dihapus - Jenis: " + jenisLaporan);
    }
}
