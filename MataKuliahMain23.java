
public class MataKuliahMain23 {

    public static void main(String[] args) {
        MataKuliah23 mk1 = new MataKuliah23();
        mk1.kodeMK = "IF1234";
        mk1.nama = "Pemrograman Berorientasi Objek";
        mk1.sks = 3;
        mk1.jumlahJam = 10;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(5);
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();

        MataKuliah23 mk2 = new MataKuliah23("IF2345", "Struktur Data", 4, 12);
        mk2.tambahJam(3);
        mk2.tampilkanInformasi();

        MataKuliah23 mk3 = new MataKuliah23("IF3456", "Basis Data", 2, 8);
        mk3.kurangiJam(2);
        mk3.tampilkanInformasi();
    }
}
