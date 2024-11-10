public class Burung extends Hewan {
    private String warnabulu;

    public Burung(String nama, int umur, String warnabulu) {
        super(nama, umur);
        this.warnabulu = warnabulu;
    }

    @Override
    public void suara() {
        System.out.println(nama + " berkicau");
    }

    @Override
    public void infoHewan() {
        System.out.println("nama burung: " + nama + ", umur: " + umur + " tahun, warna bulu: " + warnabulu);
    }
}