class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;
    // To do: Buatlah 1 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi() {
        super.Informasi();
        if (ruangPrivat) {
            System.out.println("Status : Ruangan Premium\n");
            System.out.println("Fasilitas Ruangan Premium:");
            System.out.println("Ruangan Ber-AC Pribadi");
            System.out.println("Sofa Gaming exclusive");
            System.out.println("Komputer spesifikasi tinggi");
            System.out.println("koneksi internet dedicated 100mbps");
        } else {
            System.out.println("Status : Ruangan\n");
            System.out.println("Fasilitas Ruangan Standar:");
            System.out.println("ruangan gerah");
            System.out.println("sofa majapahit");
            System.out.println("komputer speksifikasi rendah");
            System.out.println("Koneksi internet dedicated 1mbps");
        }
    }

    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor : " + nomorKomputer);
    }
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan) {
        System.out.println("TambahLayanan makanan" + TambahLayanan makanan);
    }
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman) {
        System.out.println("TambahLayanan makanan" + TambahLayanan makanan, minuman);
    }
}
