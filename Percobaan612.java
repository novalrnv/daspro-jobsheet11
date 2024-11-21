import java.util.Scanner;

public class Percobaan612 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        L = hitungluas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungvolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);
    }

    static int hitungluas (int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungvolume (int tinggi, int a, int b) {
        int volume = hitungluas(a, b) * tinggi;
        return volume;
    }
}