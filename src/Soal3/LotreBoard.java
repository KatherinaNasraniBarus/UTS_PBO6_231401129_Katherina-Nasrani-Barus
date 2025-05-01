package Soal3;

import java.util.Random;

public class LotreBoard {
    private final int baris = 4;
    private final int kolom = 5;
    private final int[][] data = new int[baris][kolom];       // 0 = aman, 1 = bom
    private final boolean[][] revealed = new boolean[baris][kolom];
    private int amanTerbuka = 0;

    public LotreBoard() {
        generateBoard();
    }

    public void generateBoard() {
        Random rand = new Random();
        int count = 0;
        while (count < 2) {
            int r = rand.nextInt(baris);
            int c = rand.nextInt(kolom);
            if (data[r][c] == 0) {
                data[r][c] = 1;
                count++;
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (!revealed[i][j]) {
                    System.out.print(" * ");
                } else if (data[i][j] == 1) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
    }

    public boolean guess(int row, int col) {
        revealed[row][col] = true;

        if (data[row][col] == 1) {
            return false; // bom
        } else {
            amanTerbuka++;
            return true;  // aman
        }
    }

    public boolean isAlreadyOpened(int row, int col) {
        return revealed[row][col];
    }

    public boolean isGameOver() {
        return amanTerbuka == (baris * kolom - 2);
    }
}



