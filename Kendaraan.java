// kelas induk
class Kendaraan {
    void jenis() {
        System.out.println("Ini adalah kendaraan.");
    }
}

// kelas turunan
class Mobil extends Kendaraan {
    void tipe() {
        System.out.println("Ini adalah mobil.");
    }
}

// kelas utama dengan metode main
public class Main {
    public static void main(String[] args) {
        Mobil mb = new Mobil();
        mb.jenis(); // memanggil metode dari kelas induk
        mb.tipe();  // memanggil metode dari kelas turunan
    }
}
