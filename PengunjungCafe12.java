public class PengunjungCafe12 {
    public static void daftarpengunjung (String... namapengunjung) {
        System.out.println("Daftar nama pengunjung : ");
        for (String nama : namapengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        daftarpengunjung("Ali", "Budi", "Citra");
    }
}