import java.util.Scanner;

public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int menu = sc.nextInt();
            sc.nextLine(); // consume newline character

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi, silakan pilih kursi lain.");
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 
                    }

                    if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil diinput.");
                    } else {
                        System.out.println("Kursi tidak valid, Membatalkan input.");
                    }
                    break;


                case 2:
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isiKursi = (penonton[i][j] != null) ? penonton[i][j] : "***";
                        System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + isiKursi);
                    }
                }
                break;


                case 3:
                    System.out.println("Terima kasih");
                    System.exit(0);

                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu 1-3.");
                    break;
            }

            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}