import java.util.Scanner;

public class KamusDictionary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        String[] kata = new String[10];
        int cek = 0;
        do {
            System.out.println(".:MENU:.");
            System.out.println("1. Input Kata");
            System.out.println("2. Cari kata");
            System.out.println("3. Hapus Kata");
            System.out.println("4. Exit");
            System.out.println("Pilihan:");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                scanner.nextLine();

                if (cek >= 10) {

                    System.out.println("data sudah penuh");


                }
                if (cek < kata.length) {
                    System.out.println("Inputkan Kata: ");
                    kata[cek] = scanner.nextLine().toUpperCase();

                }

                if (cek < kata.length) {
                    for (int a1 = 0; a1 < kata.length; a1++) {
                        for (int a = 0; a < cek; a++) {
                            if (kata[a].compareToIgnoreCase(kata[a + 1]) > 0) {
                                //swap
                                String simpan;
                                simpan = kata[a];
                                kata[a] = kata[a + 1];
                                kata[a + 1] = simpan;

                            }
                        }

                    }
                }
                cek++;


            } else if (pilihan == 2) {
                scanner.nextLine();


                System.out.println("Daftar Kata Yang Ada");
                for (int a = 0; a < kata.length; a++) {
                    System.out.println(kata[a]);
                }

                int counter = 0;
                System.out.println("Cari Kata ");
                String cariKata = scanner.next();
                for (int b = 0; b < kata.length; b++) {
                    counter++;
                    if (cariKata.equalsIgnoreCase(kata[b])) {
                        System.out.println("Ada");
                        System.out.println(kata[b]);
                        break;
                    } else if (counter == kata.length) {

                        System.out.println("kata tidak ada");


                    }

                }
            }
            if (pilihan == 3) {
                scanner.nextLine();
                System.out.println("Masukan kata yang mau dihapus ");
                String inputHapus = scanner.nextLine();

                if (inputHapus.equalsIgnoreCase(kata[0])) {
                    kata[0] = kata[1];
                    kata[1] = kata[2];
                    kata[2] = kata[3];
                    kata[3] = kata[4];
                    kata[4] = kata[5];
                    kata[5] = kata[6];
                    kata[6] = kata[7];
                    kata[7] = kata[8];
                    kata[8] = kata[9];
                    kata[9] = null;
                } else if (inputHapus.equalsIgnoreCase(kata[1])) {
                    kata[1] = kata[2];
                    kata[2] = kata[3];
                    kata[3] = kata[4];
                    kata[4] = kata[5];
                    kata[5] = kata[6];
                    kata[6] = kata[7];
                    kata[7] = kata[8];
                    kata[8] = kata[9];
                    kata[9] = null;
                } else if (inputHapus.equalsIgnoreCase(kata[2])) {

                    kata[2] = kata[3];
                    kata[3] = kata[4];
                    kata[4] = kata[5];
                    kata[5] = kata[6];
                    kata[6] = kata[7];
                    kata[7] = kata[8];
                    kata[8] = kata[9];
                    kata[9] = null;
                } else if (inputHapus.equalsIgnoreCase(kata[3])) {
                    kata[3] = kata[4];
                    kata[4] = kata[5];
                    kata[5] = kata[6];
                    kata[6] = kata[7];
                    kata[7] = kata[8];
                    kata[8] = kata[9];
                    kata[9] = null;
                } else if (inputHapus.equalsIgnoreCase(kata[4])) {
                    kata[4] = kata[5];
                    kata[5] = kata[6];
                    kata[6] = kata[7];
                    kata[7] = kata[8];
                    kata[8] = kata[9];
                    kata[9] = null;
                } else if (inputHapus.equalsIgnoreCase(kata[5])) {

                    kata[5] = kata[6];
                    kata[6] = kata[7];
                    kata[7] = kata[8];
                    kata[8] = kata[9];
                    kata[9] = null;
                } else if (inputHapus.equalsIgnoreCase(kata[6])) {
                    kata[6] = kata[7];
                    kata[7] = kata[8];
                    kata[8] = kata[9];
                    kata[9] = null;
                } else if (inputHapus.equalsIgnoreCase(kata[7])) {

                    kata[7] = kata[8];
                    kata[8] = kata[9];
                    kata[9] = null;
                } else if (inputHapus.equalsIgnoreCase(kata[8])) {


                    kata[8] = kata[9];
                    kata[9] = null;
                } else if (inputHapus.equalsIgnoreCase(kata[9])) {

                    kata[9] = null;
                } else {
                    System.out.println("kata tidak ada");
                }


            }

            if (pilihan == 4) {
                break;
            }


        } while (true);














    }
}
