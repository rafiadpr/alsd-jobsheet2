
class Dosen23 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean statusBaru) {
        statusAktif = statusBaru;
    }

    void hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa kerja dosen: " + masaKerja + " tahun.");
    }

    void ubahKeahlian(String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
    }

    public Dosen23() {

    }

    public Dosen23(String id, String nm, boolean status, int tahun, String keahlian) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = tahun;
        bidangKeahlian = keahlian;
    }
}
