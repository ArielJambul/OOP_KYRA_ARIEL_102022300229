public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(5, "jambul", 1000);
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP VIP = new KomputerVIP(20, "jambul", 5000, true)
        // To do: Panggillah Method Informasi dari class KomputerVIP
        VIP.Informasi();
        // To do: Panggillah Method Login
        VIP.Login("JAMBUL123");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        VIP.Bermain(2);
        VIP.Bermain(10, 30);

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium premium = new KomputerPremium(30, "jumbal", 2000, true)
        // To do: Panggillah Method Informasi dari class KomputerPremium
        premium.Informasi();
        // To do: Panggillah Method Pesan
        premium.TambahLayanan("nasi kornet");
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       premium.TambahLayanan("nasi kornet", "air aqua");
    }
}