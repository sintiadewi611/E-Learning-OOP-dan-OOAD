import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String pilihan;

		Scanner zz = new Scanner(System.in);

		System.out.println("Tekan (A) untuk membeli barang Accessories");
		System.out.println("Tekan (F) untuk membeli barang Fashion");
		System.out.println("Tekan (E) untuk membeli barang Elektronik");
		System.out.println("Silahkan Pilih Menu Barang Yang Akan anda pesan");
		pilihan = zz.next();

		Login log = new Login();
			log.datalogin();

		switch(pilihan)
		{
			case "A":
				Accessories acces = new Accessories();
					acces.databarang();
					break;

			case "F":
				Fashion fash = new Fashion();
					fash.databarang();
					break;

			case "E":
				Elektronik elektron = new Elektronik();
					elektron.databarang();
					break;

			default:
			System.out.print("Salah memasukkan data");

			zz.close();
		}

	}
}