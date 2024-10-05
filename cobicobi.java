import java.util.Scanner;
public class no3KalkulasiDis {
    public static void main(String[] args) {
        Scanner woe = new Scanner(System.in);
        double diskon = 0;
        int totbel = 0;
        double totpem;

        System.out.println("Masukan total belanjaan: ");
        totbel = woe.nextInt();

        if (totbel < 100000) {
            diskon = 0;
        } else if (totbel >= 100000 && totbel <= 500000) {
            diskon = 0.10;
        } else if (totbel > 500000) {
            diskon = 0.20;
        }

        totpem = totbel-(totbel *diskon);

        System.out.println("Potongan harga yang anda peroleh: " + (totbel*diskon));
        System.out.println("total yang harus anda bayar adalah Rp: " + totpem);
    }
}
