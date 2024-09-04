// Kelas Mahasiswa menggunakan enkapsulasi
class Mahasiswa {
    // Variabel privat (hanya bisa diakses di dalam kelas ini)
    private String nama;
    private int umur;
    
    // Constructor untuk inisialisasi objek
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter untuk mengambil nilai variabel nama
    public String getNama() {
        return nama;
    }

    // Setter untuk mengubah nilai variabel nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mengambil nilai variabel umur
    public int getUmur() {
        return umur;
    }

    // Setter untuk mengubah nilai variabel umur
    public void setUmur(int umur) {
        if(umur > 0) {  // Validasi umur
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid");
        }
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", 20);

        // Mengambil dan menampilkan data menggunakan getter
        System.out.println("Nama Mahasiswa: " + mahasiswa1.getNama());
        System.out.println("Umur Mahasiswa: " + mahasiswa1.getUmur());

        // Mengubah data menggunakan setter
        mahasiswa1.setNama("Budi");
        mahasiswa1.setUmur(21);

        // Menampilkan info setelah perubahan
        mahasiswa1.tampilkanInfo();
    }
}
