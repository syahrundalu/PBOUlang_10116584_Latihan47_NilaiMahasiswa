/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan47_nilaimahasiswa;

/**
 *
 * @author 
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan47_NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa x = new NilaiMahasiswa();
        x.Nilai(75, 45, 34);
        System.out.println("Quiz\t= "+x.getNilaiQuiz());
        System.out.println("UTS\t= "+x.getNilaiUts());
        System.out.println("UAS\t= "+x.getNilaiUas());
        System.out.println("Nilai Akhir\t= "+x.nilaiAkhir());
        System.out.println("");
        System.out.println("Index\t= "+x.indexNilai());
        System.out.println("Keterangan = "+x.keterangan());
        System.out.println("");
        System.out.println("");
        
        NilaiMahasiswa y = new NilaiMahasiswa();
        y.Nilai(60, 80, 75);
        System.out.println("Quiz\t= "+y.getNilaiQuiz());
        System.out.println("UTS\t= "+y.getNilaiUts());
        System.out.println("UAS\t= "+y.getNilaiUas());
        System.out.println("Nilai Akhir\t= "+y.nilaiAkhir());
        System.out.println("");
        System.out.println("Index\t= "+y.indexNilai());
        System.out.println("Keterangan = "+y.keterangan());
        System.out.println("");
        System.out.println("");
        
        NilaiMahasiswa z = new NilaiMahasiswa();
        z.Nilai(30, 80, 40);
        System.out.println("Quiz\t= "+z.getNilaiQuiz());
        System.out.println("UTS\t= "+z.getNilaiUts());
        System.out.println("UAS\t= "+z.getNilaiUas());
        System.out.println("Nilai Akhir\t= "+z.nilaiAkhir());
        System.out.println("");
        System.out.println("Index\t= "+z.indexNilai());
        System.out.println("Keterangan = "+z.keterangan());
    }
    
}
