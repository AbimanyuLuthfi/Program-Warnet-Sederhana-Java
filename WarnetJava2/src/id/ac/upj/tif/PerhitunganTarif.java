package id.ac.upj.tif;/* Ini merupkan program untuk Soal Nomor 4, pada program ini akan meng - extends
    dari class VariableRental, Program ini digunakan untuk menghitung tarif
    bagi user yang datang pada Warnet Connect
*/

// Untuk mengimport scanner
import java.util.Scanner;
public class PerhitunganTarif extends VariableRental {

    // pendeklarasian variable menggunakan modifier private
    private static float inet,ketik,game,scan,tb,print1,print2,grandtotal,uang,kembali;
    private static char jawab;
    private static String list1,list2,list3,list4,list5,list6,list7,totallist="";

    // Membuat scanner baru
    Scanner baru2 = new Scanner(System.in);

    // Method Untuk Menu dan kalkulasi Tarif Harga
    public void inputUser () {
        /*Program Untuk Menampilkan Menu Rental, disini saya menggunakan perulangan
            do while, agar dapat diulang sebanyak keinginan user
        */
        do {
            System.out.println("Selamat datang di Warnet Connect");
            System.out.println("==============================================================");
            System.out.println("Silahkan Pilih Menu Yang Tersedia Pada Warnet Connect");
            System.out.println("1. Internet (Rp 4000 / Jam)");
            System.out.println("2. Pengetikan (Rp 2000 / Jam)");
            System.out.println("3. Game Online (Rp 5000 / Jam)");
            System.out.print("\n");
            System.out.println("Menu Tambahan Pada Warnet Connect");
            System.out.print("\n");
            System.out.println("4. Scan (Rp 1000 / File)");
            System.out.println("5. Print Warna (Warna / Hitam Putih)");
            System.out.println("6. Teh Botol (Rp 3000 / Botol)");
            System.out.println("==============================================================");

            // Mencetak String dan memasukkan scanner Untuk Switch Case
            System.out.print("Masukkan Menu Yang Anda Pilih = ");
            this.pilihan1 = baru.nextInt();

            switch(pilihan1){
                // Case 1 untuk kalkulasi dan tampilan, jika user memilih menu internet
                case 1 :
                    System.out.println("Anda Memilih Menu 1");
                    System.out.println("Silahkan Masukan Jumlah Waktu Yang Ingin Anda Booking dalam Menit = ");
                    this.internet = baru.nextFloat();
                    inet = (this.internet / 60 * 4000);
                    System.out.println("Harganya adalah = Rp " + inet);
                    list1 = " Internet ";
                    totallist = totallist + list1;
                    grandtotal = grandtotal + inet;
                    break;

                // Case 2 untuk kalkulasi dan tampilan, jika user memilih menu pengetikan
                case 2:
                    System.out.println("Anda Memilih Menu 2");
                    System.out.println("Silahkan Masukan Jumlah Waktu Yang Ingin Anda Booking dalam Menit = ");
                    this.pengetikan = baru.nextInt();
                    ketik = (this.pengetikan / 60 * 2000);
                    System.out.println("Harganya adalah = Rp " + ketik);
                    list2 = " Pengetikan ";
                    totallist = totallist + list2;
                    grandtotal = grandtotal + ketik;
                    break;

                // Case 3 untuk kalkulasi dan tampilan, jika user memilih menu Game Online
                case 3:
                    System.out.println("Anda Memilih Menu 3");
                    System.out.println("Silahkan Masukan Jumlah Waktu Yang Ingin Anda Booking dalam Menit = ");
                    this.gameonline = baru.nextInt();
                    game = (this.gameonline / 60 * 5000);
                    System.out.println("Harganya adalah = Rp " + game);
                    list3 = " Game Online ";
                    totallist = totallist + list3;
                    grandtotal = grandtotal + game;
                    break;

                // Case 4 untuk kalkulasi dan tampilan, jika user memilih menu Scan
                case 4:
                    System.out.println("Anda Memilih Menu 4");
                    System.out.println("Silahkan Masukan Jumlah Kertas Yang Ingin Anda Scan = ");
                    this.scan = baru.nextInt();
                    scan = (this.scan * 1000);
                    System.out.println("Harganya adalah = Rp " + scan);
                    list4 = " Scan ";
                    totallist =totallist + list4;
                    grandtotal = grandtotal + scan;
                    break;
            
            /* Case 5 untuk kalkulasi dan tampilan, jika user memilih menu Print
                pada menu print ini, saya menggunakan switch case lagi, nantinya
                user dapat memilih antara 2 menu, yaitu menu print kertas berwarna
                maupun print kertas hitam putih, dan disetiap case nya
                sudah ada kalkulasi nilainya
            */
                case 5:
                    System.out.println("Anda Memilih Menu 5");
                    System.out.println(" Menu Print ");
                    System.out.println("1. Print Berwarna Rp 500 / Lembar");
                    System.out.println("2. Print Hitam Putih Rp 300 / Lembar");
                    System.out.println("Silahkan Masukan Pilihan Menu Print [1/2] = ");
                    this.pilihan2 = baru.nextInt();

                    switch(pilihan2){
                        case 1 :
                            System.out.println("Anda Memilih Print Berwarna");
                            System.out.println("Masukan Jumlah Kertas Yang Ingin Anda Print = ");
                            this.pilihan2 = baru.nextInt();
                            print1 = (this.pilihan2 * 500);
                            System.out.println("Harganya adalah = Rp " + print1);
                            list5 = " Print Berwarna ";
                            totallist = totallist + list5;
                            grandtotal = grandtotal + print1;
                            break;

                        case 2 :
                            System.out.println("Anda Memilih Print Hitam Putih");
                            System.out.println("Masukan Jumlah Kertas Yang Ingin Anda Print = ");
                            this.pilihan2 = baru.nextInt();
                            print2 = (this.pilihan2 * 300);
                            System.out.println("Harganya adalah = Rp " + print2);
                            list6 = " Print Hitam Putih ";
                            totallist = totallist + list6;
                            grandtotal = grandtotal + print2;
                            break;
                    }
                    break;

                // Case 1 untuk kalkulasi dan tampilan, jika user memilih menu Teh Botol
                case 6:
                    System.out.println("Anda Memilih Menu 6");
                    System.out.println("Silahkan Masukan Jumlah Teh Botol Yang Ingin Anda Beli = ");
                    this.tehbotol = baru.nextInt();
                    tb = (this.tehbotol * 3000);
                    System.out.println("Harganya adalah = Rp " + tb);
                    list7 = " Teh Botol ";
                    totallist = totallist + list7;
                    grandtotal = grandtotal + tb;
                    break;

                // Untuk mencetak String jika user menginput nilai > 4
                default:
                    System.out.println(pilihan1 + " Menu yang anda pilih tidak ada pada daftar menu!!!");

            }

            // Mencetak String untuk menanyakan apakah user ingin menambah menu?
            System.out.println("Apakah Anda ingin memilih menu kembali [Y/T] = ");
            jawab = baru.next().charAt(0);
        }while((jawab == 'y') || (jawab == 'Y'));  // untuk mengulang kembali program

        // Menampilkan Transaksi Pembayaran
        System.out.println("================ INFO MENU YANG ANDA PILIH ================");
        System.out.println(totallist);
        System.out.println("");
        System.out.println("================== TOTAL PEMBAYARAN ANDA ==================");
        System.out.println("Total Tarif Yang Harus Anda Bayar Adalah = Rp " + grandtotal);
        System.out.print("Masukkan Nominal Yang Akan Anda Bayar = Rp ");
        uang = baru.nextFloat();
        System.out.println("Nominal Uang Anda = Rp " + uang);
        kembali = uang - grandtotal;
        System.out.println("Nominal Kembalian Anda = Rp " + uang + " " + " - " + "Rp " + grandtotal + " = " + " Rp " + kembali);
        System.out.println("");
        System.out.println("Terima Kasih dan Sampai Jumpa Kembali Ya :) ");
    }
    public static void main (String [] args) {
        // Membuat Obect baru dan memanggil method InputUser
        PerhitunganTarif jawaban = new PerhitunganTarif();
        jawaban.inputUser();
    }

}