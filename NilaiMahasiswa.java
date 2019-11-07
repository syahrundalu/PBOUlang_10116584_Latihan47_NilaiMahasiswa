/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan47_nilaimahasiswa;

/**
 *
 * @author syhar
 */
public class NilaiMahasiswa {
   private int nilaiQuiz; 
   private int nilaiUts;
   private int nilaiUas;
   private char index;
   private String keterangan;
   
   public void Nilai(int nilaiQuiz, int nilaiUts, int nilaiUas){
       this.nilaiQuiz = nilaiQuiz;
       this.nilaiUts = nilaiUts;
       this.nilaiUas = nilaiUas;
       
   }
           

    public int getNilaiQuiz() {
        return nilaiQuiz;
    }
     

    public int getNilaiUts() {
        return nilaiUts;
    }

    public int getNilaiUas() {
        return nilaiUas;
    }
    
   
    public double nilaiAkhir(){
        double nilaiAkhir = (getNilaiQuiz()*0.2)+(getNilaiUts()*0.3)+(getNilaiUas()*0.5);
        return nilaiAkhir;
    }
    
   public char indexNilai(){
        if (nilaiAkhir()>=80&&nilaiAkhir()<=100){
            index = 'A';
        }
        else if (nilaiAkhir()>=68&&nilaiAkhir()<80){
            index = 'B';
        }
        else if (nilaiAkhir()>=56&&nilaiAkhir()<68){
            index = 'C';
        }
        else if (nilaiAkhir()>=45&&nilaiAkhir()<56){
            index = 'D';
        }
        else if (nilaiAkhir()<45){
            index = 'E';
        }
        return index;
   }     
    public String keterangan(){    
        if (index  =='A'){
        keterangan = "Sangat Baik";      
        }
        else if (index=='B'){
        keterangan = "Baik";      
        }
        else if (index=='C'){
        keterangan = "Cukup";      
        }   
        else if (index=='D'){
        keterangan = "Kurang";      
        }
        else
        keterangan = "Sangat Kurang";      
        return keterangan;
    
    }
    
   }
        


