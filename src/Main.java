import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Menyimpan objek ke dalam array
        Mahasiswa[] daftar = new Mahasiswa[5];

        daftar[0] = new Mahasiswa(
                "Andi Pratama",
                "2440001",
                "Teknik Informatika",
                3.75);

        daftar[1] = new Mahasiswa(
                "Budi Santoso",
                "2440002",
                "Sistem Informasi",
                3.40);

        daftar[2] = new Mahasiswa(
                "Citra Lestari",
                "2440003",
                "Teknik Informatika",
                3.90);

        daftar[3] = new Mahasiswa(
                "Joni Suhartono",
                "2440004",
                "Teknik Industri",
                3.00);

        daftar[4] = new Mahasiswa(
                "Bulan Suci",
                "2440005",
                "Akuntansi",
                3.20);

        // Menampilkan seluruh data mahasiswa
        System.out.println("=== DATA MAHASISWA ===\n");

        for (Mahasiswa mhs : daftar) {
            mhs.tampilkanInfo();
        }

        // Input NIM
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNim = input.nextLine();

        boolean ditemukan = false;

        // Mencari mahasiswa berdasarkan NIM
        for (Mahasiswa mhs : daftar) {

            if (mhs.getNim().equals(cariNim)) {

                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();

                mhs.updateIpk(ipkBaru);

                System.out.println("\nData berhasil diperbarui!\n");

                System.out.println("=== DATA MAHASISWA ===");
                mhs.tampilkanInfo();

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("NIM tidak ditemukan!");
        }

        input.close();
    }
}