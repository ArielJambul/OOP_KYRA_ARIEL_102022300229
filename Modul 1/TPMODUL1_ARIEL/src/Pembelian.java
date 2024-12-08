<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan + " ---> Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan + " ---> Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: Rp." + hargaTiket);
    }
}

class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    // Constructor
    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void tampilDaftarPenumpang() {
        System.out.println("Nomor Induk Kependudukan: " + NIK);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang: " + namaBelakang);
    }
}

public class Pembelian {
    static ArrayList<Penerbangan> penerbanganList = new ArrayList<>();
    static ArrayList<Penumpang> penumpangList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        penerbanganList.add(new Penerbangan("GARUDA23", "JFK, Jakarta", "BALI, Bali", "10:30", "21:15", 1500000));
        penerbanganList.add(new Penerbangan("QATAR98", "SHT, Jakarta", "LMBK, Lombok", "14:00", "23:45", 1200000));

        int pilihan;
        do {
            System.out.println("======= EAD Ticket Booking System ========");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    beliTiket(scanner);
                    break;
                case 3:
                    tampilkanPesananTiket();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
        scanner.close();
    }

    public static void tampilkanDaftarPenerbangan() {
        System.out.println("Daftar Penerbangan:");
        for (int i = 0; i < penerbanganList.size(); i++) {
            System.out.println((i + 1) + ". ");
            penerbanganList.get(i).tampilDaftarPenerbangan();
            System.out.println();
        }
    }

    public static void beliTiket(Scanner scanner) {
        System.out.println("Silahkan isi data diri Anda terlebih dahulu");
        System.out.println("-----------------------------");
        System.out.print("Masukkan NIK: ");
        String NIK = scanner.next();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = scanner.next();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = scanner.next();

        Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
        penumpangList.add(penumpang);

        System.out.println("Terima kasih telah mengisi data pelanggan. Silahkan pilih tiket penerbangan yang tersedia:");
        tampilkanDaftarPenerbangan();
        System.out.print("Pilih nomor penerbangan (ex: 1): ");
        int indexPenerbangan = scanner.nextInt();
        if (indexPenerbangan > 0 && indexPenerbangan <= penerbanganList.size()) {
            System.out.println("Pemesanan tiket berhasil dilakukan, cek pesanan tiket pada menu (3).");
        } else {
            System.out.println("Nomor penerbangan tidak valid.");
        }
    }

    public static void tampilkanPesananTiket() {
        if (penumpangList.isEmpty()) {
            System.out.println("Pembelian Tiket Tidak Ada");
        } else {
            System.out.println("========= Detail Tiket Penerbangan =========");
            for (Penumpang penumpang : penumpangList) {
                penumpang.tampilDaftarPenumpang();
                System.out.println("Nomor Penerbangan: " + penerbanganList.get(0).getNomorPenerbangan());
                System.out.println("Bandara Keberangkatan: " + penerbanganList.get(0).getBandaraKeberangkatan() + " ---> Bandara Tujuan: " + penerbanganList.get(0).getBandaraTujuan());
                System.out.println("Waktu Keberangkatan: " + penerbanganList.get(0).getWaktuKeberangkatan() + " ---> Waktu Kedatangan: " + penerbanganList.get(0).getWaktuKedatangan());
                System.out.println("Harga Tiket: Rp." + penerbanganList.get(0).getHargaTiket());
            }
        }
    }
=======
import java.util.ArrayList;
import java.util.Scanner;

class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan + " ---> Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan + " ---> Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: Rp." + hargaTiket);
    }
}

class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    // Constructor
    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public void tampilDaftarPenumpang() {
        System.out.println("Nomor Induk Kependudukan: " + NIK);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang: " + namaBelakang);
    }
}

public class Pembelian {
    static ArrayList<Penerbangan> penerbanganList = new ArrayList<>();
    static ArrayList<Penumpang> penumpangList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        penerbanganList.add(new Penerbangan("GARUDA23", "JFK, Jakarta", "BALI, Bali", "10:30", "21:15", 1500000));
        penerbanganList.add(new Penerbangan("QATAR98", "SHT, Jakarta", "LMBK, Lombok", "14:00", "23:45", 1200000));

        int pilihan;
        do {
            System.out.println("======= EAD Ticket Booking System ========");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    beliTiket(scanner);
                    break;
                case 3:
                    tampilkanPesananTiket();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
        scanner.close();
    }

    public static void tampilkanDaftarPenerbangan() {
        System.out.println("Daftar Penerbangan:");
        for (int i = 0; i < penerbanganList.size(); i++) {
            System.out.println((i + 1) + ". ");
            penerbanganList.get(i).tampilDaftarPenerbangan();
            System.out.println();
        }
    }

    public static void beliTiket(Scanner scanner) {
        System.out.println("Silahkan isi data diri Anda terlebih dahulu");
        System.out.println("-----------------------------");
        System.out.print("Masukkan NIK: ");
        String NIK = scanner.next();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = scanner.next();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = scanner.next();

        Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
        penumpangList.add(penumpang);

        System.out.println("Terima kasih telah mengisi data pelanggan. Silahkan pilih tiket penerbangan yang tersedia:");
        tampilkanDaftarPenerbangan();
        System.out.print("Pilih nomor penerbangan (ex: 1): ");
        int indexPenerbangan = scanner.nextInt();
        if (indexPenerbangan > 0 && indexPenerbangan <= penerbanganList.size()) {
            System.out.println("Pemesanan tiket berhasil dilakukan, cek pesanan tiket pada menu (3).");
        } else {
            System.out.println("Nomor penerbangan tidak valid.");
        }
    }

    public static void tampilkanPesananTiket() {
        if (penumpangList.isEmpty()) {
            System.out.println("Pembelian Tiket Tidak Ada");
        } else {
            System.out.println("========= Detail Tiket Penerbangan =========");
            for (Penumpang penumpang : penumpangList) {
                penumpang.tampilDaftarPenumpang();
                System.out.println("Nomor Penerbangan: " + penerbanganList.get(0).getNomorPenerbangan());
                System.out.println("Bandara Keberangkatan: " + penerbanganList.get(0).getBandaraKeberangkatan() + " ---> Bandara Tujuan: " + penerbanganList.get(0).getBandaraTujuan());
                System.out.println("Waktu Keberangkatan: " + penerbanganList.get(0).getWaktuKeberangkatan() + " ---> Waktu Kedatangan: " + penerbanganList.get(0).getWaktuKedatangan());
                System.out.println("Harga Tiket: Rp." + penerbanganList.get(0).getHargaTiket());
            }
        }
    }
>>>>>>> af4a32c (MODUL 1)
}