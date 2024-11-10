public class Main {
    public static void main(String[] args) {
        Kucing kucing0 = new Kucing("momo", 2, "persia");
        Burung burung0 = new Burung("rio", 1, "biru");

        System.out.println("detail hewan");

        kucing0.infoHewan();
        kucing0.suara();
        kucing0.makan();
        kucing0.makan("ikan");

        System.out.println();

        burung0.infoHewan();
        burung0.suara();
        burung0.makan();
        burung0.makan("biji-bijian");
    }
}