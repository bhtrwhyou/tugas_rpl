/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author bahterawahyu
 */
public class MainMobil {
    public static void main(String[] args) {
        // Membuat objek pertama
        Mobil mobil1 = new Mobil();
        mobil1.merk = "BMW";
        mobil1.model = "F30";
        mobil1.tahunPembuatan = 2015;

        // Membuat objek kedua
        Mobil mobil2 = new Mobil();
        mobil2.merk = "BMW";
        mobil2.model = "f32";
        mobil2.tahunPembuatan = 2017;

        // Menampilkan informasi kedua mobil
        mobil1.infoMobil();
        mobil2.infoMobil();
    }
}

