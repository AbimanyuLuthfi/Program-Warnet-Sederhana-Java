package id.ac.upj.tif;/*Ini merupakan program pendeklarasian beberapa variable beserta
    Setter dan Getternya, nantinya class ini akan di inharitance pada
    program soal nomor 4
*/
import java.util.Scanner;
class VariableRental {
    public float internet;
   public float pengetikan;
   public float gameonline;
   public float tehbotol;
   public float scan;
   public float print;
   public int pilihan1;
    public int pilihan2;

    // Membuat scanner baru
    Scanner baru = new Scanner(System.in);

    // Membuat Setter pada setiap Variable yang sudah di deklarasikan
    public void setinternet (int inter) {
        this.internet = inter;
    }
    public void setpengetikan (int ptkn) {
        this.pengetikan = ptkn;
    }
    public void setgameonline (int gamon) {
        this.gameonline = gamon;
    }
    public void setpilihan1 (int pil1) {
        this.pilihan1 = pil1;
    }
    public void setpilihan2 (int pil2) {
        this.pilihan2 = pil2;
    }
    public void settehbotol (int teh) {
        this.tehbotol = teh;
    }
    public void setscan (int sc) {
        this.scan = sc;
    }
    public void setprint (int prt) {
        this.print = prt;
    }

    // Membuat Getter pada setiap Variable yang sudah di deklarasikan
    public float getinternet () {
        return this.internet;
    }
    public float getpengetikan () {
        return this.pengetikan;
    }
    public float getgameonline () {
        return this.gameonline;
    }
    public float gettehbotol () {
        return this.tehbotol;
    }
    public float getscan () {
        return this.scan;
    }
    public float getprint () {
        return this.print;
    }
    public int getpilihan1 () {
        return this.pilihan1;
    }
    public float getpilihan2 () {
        return this.pilihan2;
    }

}