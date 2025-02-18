public class MahasiswaMain23 {
    public static void main(String[] args) {
        Mahasiswa23 mhs1 = new Mahasiswa23();
        mhs1.nama = "Rafi Adrian";
        mhs1.nim = "244107020026";
        mhs1.kelas = "TI-1F";
        mhs1.ipk = 3.8;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-1G");
        mhs1.updateIpk(3.9);
        mhs1.tampilkanInformasi();

        Mahasiswa23 mhs2 = new Mahasiswa23("Rafi Adrian Prasetya", "244107020026", "TI-1A", 3.7);
        mhs2.updateIpk(3.78);
        mhs2.tampilkanInformasi();
    }
}
