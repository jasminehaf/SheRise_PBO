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

public class User {
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private boolean isAdmin;
    private boolean isLoggedIn;
    private String status;
    private List<ForumKomunitas> komunitasDiikuti;
    private List<KontenEdukasi> kontenDiakses;

    public User(String username, String email, String password, String phoneNumber, boolean isAdmin) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.isAdmin = isAdmin;
        this.isLoggedIn = false;
        this.status = "Active";
        this.komunitasDiikuti = new ArrayList<>();
        this.kontenDiakses = new ArrayList<>();
    }

    public void registrasi() {
        // Implementasi untuk mendaftarkan pengguna baru.
        System.out.println("Registrasi berhasil untuk " + username);
    }

    public void login(String inputEmail, String inputPassword) {
        if (inputEmail.equals(email) && inputPassword.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login as " + username);
        } else {
            System.out.println("Login failed. Incorrect email or password.");
        }
    }

    public void editProfile(String newUsername, String newEmail, String newPhoneNumber, String newPassword) {
        username = newUsername;
        email = newEmail;
        phoneNumber = newPhoneNumber;
        password = newPassword;
        System.out.println("Profile updated successfully.");
    }

    public void ikutiForumKomunitas(ForumKomunitas komunitas) {
        komunitasDiikuti.add(komunitas);
        System.out.println("Anda sekarang mengikuti komunitas: " + komunitas.getNamaKomunitas());
    }

    public void aksesKontenEdukasi(KontenEdukasi konten) {
        kontenDiakses.add(konten);
        System.out.println("Anda telah mengakses konten edukasi: " + konten.getJudulKonten());
    }

    public void kirimPesan(User penerima, String isiPesan) {
        // Implementasi untuk mengirim pesan ke pengguna lain.
        System.out.println("Pesan terkirim ke " + penerima.getUsername() + ": " + isiPesan);
    }

    public void beriKomentar(KontenEdukasi konten, String komentar) {
        konten.beriKomentar(komentar);
        System.out.println("Komentar Anda telah ditambahkan pada konten: " + konten.getJudulKonten());
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }

   

class ForumKomunitas {
    private String namaKomunitas;

    public ForumKomunitas(String namaKomunitas) {
        this.namaKomunitas = namaKomunitas;
    }

    public String getNamaKomunitas() {
        return namaKomunitas;
    }
}

class KontenEdukasi {
    private String judulKonten;

    public KontenEdukasi(String judulKonten) {
        this.judulKonten = judulKonten;
    }

    public String getJudulKonten() {
        return judulKonten;
    }

    public void beriKomentar(String komentar) {
        System.out.println("Komentar: " + komentar);
    }
  }
}
