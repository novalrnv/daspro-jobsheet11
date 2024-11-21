import java.util.Scanner;

public class Kafe12 {
    static Scanner sc = new Scanner(System.in);
    static int hargatotal;
    public static void Menu (String namapelanggan, boolean ismember) {
        System.out.println("Selamat datang, " +namapelanggan+ "!");

        if (ismember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===== MENU RESTO KAFE =====");
        
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

        
    public static int hitungtotalharga (int pilihanmenu, int banyakitem, String kodepromo, boolean ismember) {
        int[] hargaitem = {15000, 20000, 22000, 12000, 10000, 18000};
            
        hargatotal = hargaitem[pilihanmenu-1] * banyakitem;
        
        if (ismember) {
            hargatotal *= 0.9;
        }

        if (("DISKON30").equals(kodepromo)) {
            hargatotal *= 0.7;
            System.out.println("Anda mendapatkan diskon 30%");
        } else if (("DISKON50").equals(kodepromo)) {
            hargatotal *= 0.5;
            System.out.println("Anda mendapatkan diskon 50%");
        } else {
            System.out.println("Kode promo tidak valid!");
        }
        return hargatotal;
    }

    public static void main(String[] args) {
        boolean ismember = true;
        Menu("Andi", ismember);

        double totalbayar = 0;
        String pilihan;
        String kodepromo = "DISKON50";

        do {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan : ");
            int pilihanmenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan : ");
            int banyakitem = sc.nextInt();
            totalbayar += hitungtotalharga(pilihanmenu, banyakitem, kodepromo, ismember);

            System.out.print("Apakah Anda ingin memesan menu lain?(y/n) : ");
            pilihan = sc.next();
        } while (pilihan.equalsIgnoreCase("y"));
        sc.nextLine();

        System.out.println("Total harga untuk pesanan Anda : Rp" + totalbayar);
    }
}