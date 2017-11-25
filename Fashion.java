import java.util.Scanner;
public class Fashion extends Barang{

	public String nama_barang;
	public String kode_barang;
	public String ukuran;
	public String kategori;
	public String warna;
	public String harga;
	public String no_faktur;
	public String nama_admin;
	public String kode_admin;

	public void databarang()
	{


	Scanner input = new Scanner(System.in);
	System.out.println("==============================");
	System.out.println("Input Barang Fashion");
	System.out.println("Kode Barang : "); kode_barang = input.nextLine();
 	System.out.println(" Nama Barang : "); nama_barang = input.nextLine();
 	System.out.println(" ukuran : "); ukuran = input.nextLine();
 	System.out.println(" kategori : "); kategori = input.nextLine();
 	System.out.println(" warna : "); warna = input.nextLine();
 	System.out.println(" harga : "); harga = input.nextLine();
 	System.out.println("==============================");
	System.out.println(" Faktur Transaksi Anda ");
 	System.out.println(" No Faktur : "); no_faktur = input.nextLine();
 	System.out.println("Nama Admin : Sintia Dewi"); nama_admin = input.nextLine();
 	System.out.println("Kode Admin : 15111097"); kode_admin = input.nextLine();
 	System.out.println(" Kode Barang : "+ kode_barang);
 	System.out.println("Nama Barang :"+ nama_barang);
 	System.out.println("ukuran :"+ ukuran);
 	System.out.println("kategori :"+ kategori);
 	System.out.println("warna :"+ warna);
 	System.out.println("harga :"+ harga);

 	
	}

	
		public static void main(String[] args) {
		Fashion nik = new Fashion();
		nik.susunbarang();
		nik.databarang();
		nik.totalbarang();

		}



	
	

}