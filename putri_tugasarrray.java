/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ACENKCOM
 */
public class putri_tugasarrray {
    
    public static void main(String[] args) {
        double[][] nilaiMahasiswa = {
            {80, 85, 78, 75},
            {95, 88, 80, 76},
            {78, 70, 75, 73},
            {64, 65, 76, 72}
        };
        
        double[] nilaiAkhir = new double[nilaiMahasiswa.length];
        char[] nilaiHuruf = new char[nilaiMahasiswa.length];
        
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            nilaiAkhir[i] = hitungNilaiAkhir(nilaiMahasiswa[i]);
            nilaiHuruf[i] = hitungNilaiHuruf(nilaiAkhir[i]);
        }
        
        System.out.println("Tabel Total Nilai Akhir Mahasiswa:");
        System.out.println("=================================");
        System.out.println("No.   | Absen | Tugas | UTS   | UAS   | Nilai Akhir | Nilai Huruf");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.printf("%-5d | ", (i + 1));
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.printf("%-6.0f| ", nilaiMahasiswa[i][j]);
            }
            System.out.printf("%-11.2f| %-5c%n", nilaiAkhir[i], nilaiHuruf[i]);
        }
    }
    
    public static double hitungNilaiAkhir(double[] nilai) {
        double absen = nilai[0] * 0.1;
        double tugas = nilai[1] * 0.2;
        double uts = nilai[2] * 0.3;
        double uas = nilai[3] * 0.4;
        return absen + tugas + uts + uas;
    }
    
    public static char hitungNilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir > 80) {
            return 'A';
        } else if (nilaiAkhir >= 70) {
            return 'B';
        } else if (nilaiAkhir >= 60) {
            return 'C';
        } else if (nilaiAkhir >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
