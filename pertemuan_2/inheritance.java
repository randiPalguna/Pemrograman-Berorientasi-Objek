// Kelas induk (Superclass)
class Hewan {
    // Properti kelas induk
    String nama;
    
    // Konstruktor kelas induk
    public Hewan(String nama) {
        this.nama = nama;
    }
    
    // Metode kelas induk
    public void suara() {
        System.out.println(nama + " membuat suara");
    }
}

// Kelas anak (Subclass) yang mewarisi dari kelas Hewan
class Anjing extends Hewan {
    // Konstruktor kelas anak
    public Anjing(String nama) {
        super(nama); // Memanggil konstruktor kelas induk
    }
    
    // Metode override dari kelas induk
    @Override
    public void suara() {
        System.out.println(nama + " menggonggong");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Anjing
        Anjing anjing1 = new Anjing("Buddy");
        
        // Memanggil metode suara()
        anjing1.suara(); // Output: Buddy menggonggong
    }
}
