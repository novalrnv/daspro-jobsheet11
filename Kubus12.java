import java.util.Scanner;

public class Kubus12 {
    public static int volume (int sisi) {
        int volume = (sisi*sisi*sisi);

        return volume;
    }
    
    public static int permukaan (int sisi) {
        int permukaan = 6 * (sisi * sisi);

        return permukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang Sisi : ");
        int sisi = sc.nextInt();
        sc.nextLine();

        int hasilvolume = volume(sisi);
        int hasilpermukaan = permukaan(sisi);

        System.out.println("\nVolume Kubus adalah : " + hasilvolume);
        System.out.println("Luas Permukaan Kubus adalah : " + hasilpermukaan);
    }
}
