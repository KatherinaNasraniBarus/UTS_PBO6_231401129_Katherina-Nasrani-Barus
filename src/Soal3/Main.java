package Soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LotreBoard board = new LotreBoard();

        System.out.println("===== SELAMAT DATANG DI LOTRE GOSOK =====");
        System.out.println("Papan Lotre : ");
        board.displayBoard();

        while (true) {
            System.out.print("Tebak Baris (0-3) : ");
            int r = input.nextInt();
            System.out.print("Tebak Kolom (0-4) : ");
            int c = input.nextInt();

            if (r < 0 || r >= 4 || c < 0 || c >= 5) {
                System.out.println("Posisi tidak valid!");
                continue;
            }

            if (board.isAlreadyOpened(r, c)) {
                System.out.println("kotak telah dibuka sebelumnya!");
            } else {
                boolean aman = board.guess(r, c);
                if (!aman) {
                    System.out.println("Papan Lotre : ");
                    System.out.print("BOOM! Anda menemukan bom! Permainan berakhir.\n");
                    board.displayBoard();
                    break;
                } else {
                    System.out.println("Kotak Aman");
                }
            }

            System.out.println("Papan Lotre : ");
            board.displayBoard();

            if (board.isGameOver()) {
                System.out.println("Selamat! Kamu menang");
                break;
            }
        }
        input.close();
    }
}

