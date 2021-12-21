package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        //geçme notu 55.Dersler: matematik,müzik,türkçe,tarih,kimya.

        int mat, muzik, turkce, tarih, kimya;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();
        if (mat < 0 || mat > 100) {
            ortalama = (tarih + turkce + kimya + muzik) / 4;
        } else if (tarih < 0 || tarih > 100) {
            ortalama = (mat + muzik + turkce + kimya) / 4;
        } else if (kimya < 0 || kimya > 100) {
            ortalama = (mat + muzik + turkce + tarih) / 4;
        } else if (turkce < 0 || turkce > 100) {
            ortalama = (mat + muzik + kimya + kimya) / 4;
        } else if (muzik < 0 || muzik > 100) {
            ortalama = (mat + turkce + turkce + kimya) / 4;
        } else {
            ortalama = (mat + kimya + turkce + tarih + muzik) / 5;
        }
        System.out.println("Ortalamanız: " + ortalama);
        if (ortalama >= 55) {
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        } else {
            System.out.println("Üzgünüz. Sınıfı geçemediniz!");
        }

    }
}
