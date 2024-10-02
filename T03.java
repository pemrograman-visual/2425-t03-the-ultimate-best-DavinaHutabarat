// 12S24047-Davina Olivia 
// 12S24050-Ester Hasianna

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[10], judul = new String[10], penulis = new String[10], penerbit = new String[10], formatBukuElektronik = new String[10], kategori = new String[10], gol = new String[10];
        int[] tahunTerbit = new int[10], stok = new int[10];
        double[] hargaPembelian = new double[10], minimumMargin = new double[10], rating = new double[10];

        iSBN = input.nextLine();
        while (!iSBN.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahunTerbit = Integer.parseInt(input.nextLine());
            penerbit = input.nextLine();
            formatBukuElektronik = input.nextLine();
            hargaPembelian = Double.parseDouble(input.nextLine());
            minimumMargin = Double.parseDouble(input.nextLine());
            stok = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7) {
                kategori = "Best Pick";
            } else {
                if (rating >= 4.5) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0) {
                            kategori = "Average";
                        } else {
                            kategori = "Low";
                        }
                    }
                }
            }
            if (Diskon >= 0.4) {
                gol = "Once in lifetime";
            } else {
                if (Diskon >= 0.2) {
                    gol = "Never come true";
                } else {
                    gol = "No regret";
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektronik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori + "|" + gol);
    }
}
