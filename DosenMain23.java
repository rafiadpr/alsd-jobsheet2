
public class DosenMain23 {

    public static void main(String[] args) {
        Dosen23 dosen1 = new Dosen23();
        dosen1.idDosen = "01";
        dosen1.nama = "Dosen 1";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Pemrograman";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2021);
        dosen1.ubahKeahlian("Struktur Data");
        dosen1.tampilkanInformasi();

        Dosen23 dosen2 = new Dosen23("02", "Dosen 2", true, 2015, "Pemrograman");
        dosen2.ubahKeahlian("Algoritma");
        dosen2.tampilkanInformasi();

        Dosen23 dosen3 = new Dosen23("03", "Dosen 3", false, 2018, "Basis Data");
        dosen3.hitungMasaKerja(2021);
        dosen3.tampilkanInformasi();
    }
}
