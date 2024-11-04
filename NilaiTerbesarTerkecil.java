
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class NilaiTerbesarTerkecil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the name of the officer
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = scanner.nextLine();

        // Input for the number of student grades to be entered
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int banyakNilai = scanner.nextInt();

        int[] nilaiMahasiswa = new int[banyakNilai];

        // Input for each student's grade
        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        // Display the entered grades
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < banyakNilai; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }

        // Calculate the maximum and minimum grades
        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        for (int i = 1; i < banyakNilai; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        // Display the results
        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("\nPetugas: " + namaPetugas);
    }
}
