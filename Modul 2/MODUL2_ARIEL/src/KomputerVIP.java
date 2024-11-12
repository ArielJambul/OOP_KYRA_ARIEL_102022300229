class KomputerVIP extends Komputer {
    protected boolean vipCard;
    // To do: Buatlah 1 variable sesuai ketentuan
    
    // To do: Buatlah constructor pada class KomputerVIP    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi() {
        super.Informasi();
        if (vipCard) {
            System.out.println("Status : Ruangan Vip\n");
            System.out.println("Fasilitas Ruangan Standar:");
            System.out.println("ruangan gerah");
            System.out.println("sofa majapahit");
            System.out.println("komputer speksifikasi rendah");
            System.out.println("Koneksi internet");
        } else {
            System.out.println("Status : Ruangan Premium\n");
            System.out.println("Fasilitas Ruangan Premium:");
            System.out.println("Ruangan Ber-AC Pribadi");
            System.out.println("Sofa Gaming exclusive");
            System.out.println("Komputer spesifikasi tinggi");
            System.out.println("koneksi internet dedicated 100mbps");
        }
    }
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username) {
        System.out.println("Login dengan username" + username);
    }
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam) {
        System.err.println("Bermain selama 2 jam" + jam);
    }
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menitTambahan) {
        System.err.println("Bermain nambah billing selama 2 jam 3 menit" + int jam, int menitTambahan);
    }
}