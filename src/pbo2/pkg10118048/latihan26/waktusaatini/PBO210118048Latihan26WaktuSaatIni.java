/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan waktu saat ini
 */
public class PBO210118048Latihan26WaktuSaatIni {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy hh:mm:ss");
        System.out.println("Hari ini adalah hari : " + dateFormat.format(date));
    }
}
