public class Kalkulator {

    // Metode untuk menjumlahkan dua bilangan bulat (integer)
    public int tambah(int a, int b) {
        return a + b;
    }

    // Overloading metode untuk menjumlahkan tiga bilangan bulat
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading metode untuk menjumlahkan dua bilangan desimal (double)
    public double tambah(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        // Memanggil metode tambah dengan dua parameter integer
        System.out.println(kalkulator.tambah(5, 10)); // Output: 15

        // Memanggil metode tambah dengan tiga parameter integer
        System.out.println(kalkulator.tambah(3, 4, 5)); // Output: 12

        // Memanggil metode tambah dengan dua parameter double
        System.out.println(kalkulator.tambah(4.5, 3.2)); // Output: 7.7
    }
}
