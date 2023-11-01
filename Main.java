/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sherise;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        List<Admin> admins = new ArrayList<>();
        List<ForumKomunitas> komunitasList = new ArrayList<>();
        List<KontenEdukasi> kontenList = new ArrayList<>();
        List<LowonganPekerjaan> lowonganList = new ArrayList<>();
        User loggedInUser = null;
        Admin loggedInAdmin = null;

        while (true) {
            if (loggedInUser == null && loggedInAdmin == null) {
                System.out.println("Pilih peran:");
                System.out.println("1. User");
                System.out.println("2. Admin");
                System.out.println("3. Keluar");
                System.out.print("Pilih peran: ");
                int roleChoice = scanner.nextInt();
                scanner.nextLine();

                if (roleChoice == 1) {
                    System.out.println("\nMenu (User):");
                    System.out.println("1. Login");
                    System.out.println("2. Sign Up");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih opsi: ");
                    int userChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (userChoice) {
                        case 1:
                            System.out.print("Masukkan email Anda: ");
                            String userEmail = scanner.nextLine();
                            System.out.print("Masukkan password Anda: ");
                            String userPassword = scanner.nextLine();

                            for (User user : users) {
                                if (user.getEmail().equals(userEmail) && user.getPassword().equals(userPassword)) {
                                    loggedInUser = user;
                                    System.out.println("Login berhasil sebagai User " + loggedInUser.getUsername());
                                    break;
                                }
                            }
                            if (loggedInUser == null) {
                                System.out.println("Login gagal. Periksa email dan password Anda.");
                            }
                            break;

                        case 2:
                            System.out.print("Nama User: ");
                            String username = scanner.nextLine();
                            System.out.print("Email User: ");
                            String email = scanner.nextLine();
                            System.out.print("Password: ");
                            String password = scanner.nextLine();
                            System.out.print("Nomor Telepon: ");
                            String phoneNumber = scanner.nextLine();
                            User newUser = new User(username, email, password, phoneNumber, false);
                            users.add(newUser);
                            System.out.println("User " + username + " telah ditambahkan.");
                            break;

                        case 3:
                            System.out.println("Keluar dari program.");
                            System.exit(0);
                            break;
                            
                        case 5: // Menampilkan daftar komunitas
                            System.out.println("Daftar Komunitas:");
                            for (ForumKomunitas komunitas : komunitasList) {
                            System.out.println(komunitas.getNamaKomunitas());
                            }
                            break;
                            
                            case 6: // Menampilkan daftar konten edukasi
    System.out.println("Daftar Konten Edukasi:");
    for (KontenEdukasi konten : kontenList) {
        System.out.println(konten.getJudulKonten());
    }
    break;
    
    case 7: // Menampilkan daftar lowongan pekerjaan
    System.out.println("Daftar Lowongan Pekerjaan:");
    for (LowonganPekerjaan lowongan : lowonganList) {
        System.out.println(lowongan.getJudulLowongan());
    }
    break;
                        default:
                            System.out.println("Opsi tidak valid.");
                    }
                } else if (roleChoice == 2) {
                    System.out.println("\nMenu (Admin):");
                    System.out.println("1. Login");
                    System.out.println("2. Sign Up");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih opsi: ");
                    int adminChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (adminChoice) {
                        case 1:
                            System.out.print("Masukkan email Admin: ");
                            String adminEmail = scanner.nextLine();
                            System.out.print("Masukkan password Admin: ");
                            String adminPassword = scanner.nextLine();

                            for (Admin admin : admins) {
                                if (admin.getEmail().equals(adminEmail) && admin.getPassword().equals(adminPassword)) {
                                    loggedInAdmin = admin;
                                    System.out.println("Login berhasil sebagai Admin " + loggedInAdmin.getUsername());
                                    break;
                                }
                            }
                            if (loggedInAdmin == null) {
                                System.out.println("Login gagal. Periksa email dan password Admin Anda.");
                            }
                            break;
                        case 2:
                            System.out.print("Masukkan email Admin: ");
                            String newAdminEmail = scanner.nextLine();
                            boolean adminExists = false;
                            for (Admin admin : admins) {
                                if (admin.getEmail().equals(newAdminEmail)) {
                                    adminExists = true;
                                    break;
                                }
                            }
                            if (adminExists) {
                                System.out.println("Admin dengan email tersebut sudah ada.");
                            } else {
                                System.out.print("Nama Admin: ");
                                String adminUsername = scanner.nextLine();
                                System.out.print("Password: ");
                                String adminPasswordInput = scanner.nextLine();
                                System.out.print("Nomor Telepon: ");
                                String adminPhoneNumber = scanner.nextLine();
                                Admin newAdmin = new Admin(adminUsername, newAdminEmail, adminPasswordInput, adminPhoneNumber);
                                admins.add(newAdmin);
                                System.out.println("Admin " + adminUsername + " telah ditambahkan.");
                            }
                            break;
                        case 3:
                            System.out.println("Keluar dari program.");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opsi tidak valid.");
                    }
                } else if (roleChoice == 3) {
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                } else {
                    System.out.println("Opsi peran tidak valid.");
                }
            } else if (loggedInUser != null) {
                System.out.println("\nMenu (User):");
                System.out.println("1. Logout");
                System.out.println("2. Tambah Komunitas");
                System.out.println("3. Tambah Konten Edukasi");
                System.out.println("4. Tambah Lowongan Pekerjaan");
                System.out.println("Pilih opsi: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Logout berhasil.");
                        loggedInUser = null;
                        break;
                    case 2:
                        System.out.print("Nama Komunitas: ");
                        String komunitasName = scanner.nextLine();
                        ForumKomunitas newKomunitas = new ForumKomunitas(komunitasName);
                        komunitasList.add(newKomunitas);
                        System.out.println("Komunitas " + komunitasName + " telah ditambahkan.");
                        break;
                    case 3:
                        System.out.print("Judul Konten Edukasi: ");
                        String judulKonten = scanner.nextLine();
                        KontenEdukasi newKonten = new KontenEdukasi(judulKonten);
                        kontenList.add(newKonten);
                        System.out.println("Konten " + judulKonten + " telah ditambahkan.");
                        break;
                    case 4:
                        System.out.print("Judul Lowongan Pekerjaan: ");
                        String judulLowongan = scanner.nextLine();
                        LowonganPekerjaan newLowongan = new LowonganPekerjaan(judulLowongan, "", "", "", "", "");
                        lowonganList.add(newLowongan);
                        System.out.println("Lowongan " + judulLowongan + " telah ditambahkan.");
                        break;
                    default:
                        System.out.println("Opsi tidak valid.");
                }
            } 
            
    // Admin login
    System.out.println("\nMenu (Admin):");
    System.out.println("1. Login");
    System.out.println("2. Sign Up");
    System.out.println("3. Keluar");
    System.out.print("Pilih opsi: ");
    int adminChoice = scanner.nextInt();
    scanner.nextLine();

    switch (adminChoice) {
        case 1:
            System.out.print("Masukkan email Admin: ");
            String adminEmailInput = scanner.nextLine();
            System.out.print("Masukkan password Admin: ");
            String adminPasswordInput = scanner.nextLine();

            // Periksa kebenaran login admin
            Admin adminToLogin = null;
            for (Admin admin : admins) {
                if (admin.getEmail().equals(adminEmailInput) && admin.getPassword().equals(adminPasswordInput)) {
                    adminToLogin = admin;
                    break;
                }
            }

            if (adminToLogin != null) {
                loggedInAdmin = adminToLogin;
                System.out.println("Login Admin berhasil.");
            } else {
                System.out.println("Login Admin gagal. Email atau password salah.");
            }
            break;
        case 2:
            // Implementasi sign up sebagai Admin
            System.out.print("Masukkan email Admin: ");
            String newAdminEmail = scanner.nextLine();
            // Periksa apakah email admin sudah ada
            boolean adminExists = false;
            for (Admin admin : admins) {
                if (admin.getEmail().equals(newAdminEmail)) {
                    adminExists = true;
                    break;
                }
            }
            if (adminExists) {
                System.out.println("Admin dengan email tersebut sudah ada.");
            } else {
                System.out.print("Nama Admin: ");
                String adminUsername = scanner.nextLine();
                System.out.print("Password: ");
                String adminPassword = scanner.nextLine();
                System.out.print("Nomor Telepon: ");
                String adminPhoneNumber = scanner.nextLine();
                Admin newAdmin = new Admin(adminUsername, newAdminEmail, adminPassword, adminPhoneNumber);
                admins.add(newAdmin);
                System.out.println("Admin " + adminUsername + " telah ditambahkan.");
            }
            break;
        case 3:
            System.out.println("Keluar dari program.");
            System.exit(0);
            break;
        default:
            System.out.println("Opsi tidak valid.");
        }
        }
    }
}
