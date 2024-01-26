/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        // membuat objek bangun datar
        Bangundatar bangunDatar = new Bangundatar();

        // membuat objek persegi dan mengisi nilai properti
        persegi persegi = new persegi();
        persegi.sisi = 2;

        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        // membuat objek Persegi Panjang dan mengisi nilai properti
        persegipanjang persegipanjang = new persegipanjang();
        persegipanjang.panjang = 8;
        persegipanjang.lebar = 4;

        // membuat objek Segitiga dan mengisi nilai properti
        segitiga mSegitiga = new segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;


        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegipanjang.luas();
        persegipanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();
    }
    
}