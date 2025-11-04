import java.util.Scanner;

public class uklmudahExpedisi {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("=== volume paket ===");
        System.out.println("panjang (cm) :");
        int panjang = input.nextInt();
        System.out.println("Lebar (cm) :");
        int lebar = input.nextInt();
        System.out.println("Tinggi (cm) :");
        int tinggi = input.nextInt();

        System.out.println("Masukkan berat barang (kg)  :");
        int berat = input.nextInt();

        System.out.println("Masukkan jarak pengiriman (km) :");
        int jarak = input.nextInt();

        int volume = panjang*lebar*tinggi;

        int biayaPerKg;
        if(jarak <= 10){
              biayaPerKg = 4250;
        } else {    
            biayaPerKg = 6000;    
        }

        int biayaTotal = berat * biayaPerKg;

        if(volume > 100000){
                biayaTotal += 50000;
        }

        System.out.println("=== RINCIAN BIAYA ===");
        System.out.println("Volume paket: " + volume + "cm");
        System.out.println("Berat paket: " + berat + "kg");
        System.out.println("Jarak pengiriman: "+ berat + "km");
        System.out.println("Biaya per kg: Rp " + biayaPerKg);
        System.out.println("total biaya yang di bayar kan: " + biayaTotal);



        System.out.println("=============================");
        System.out.println("Total biaya pengiriman: Rp " + biayaPerKg);
        System.out.println("Terima kasih telah menggunakan layanan kami !!");
    }
}  
