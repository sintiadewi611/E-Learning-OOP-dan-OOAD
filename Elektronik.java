import java.util.Scanner;
public class Elektronik extends Barang{

	public String nama_barang;
	public String kode_barang;
	public String type;
	public String merk;
	public String harga;
	public String no_faktur;
	public String nama_admin;
	public String kode_admin;

	public void databarang()
	{


	Scanner input = new Scanner(System.in);
	System.out.println("==============================");
	System.out.println("Input Barang Elektronik");
	System.out.println("Kode Barang : "); kode_barang = input.nextLine();
 	System.out.println(" Nama Barang : "); nama_barang = input.nextLine();
 	System.out.println(" type : "); type = input.nextLine();
 	System.out.println(" merk : "); merk = input.nextLine();
 	System.out.println(" harga : "); harga = input.nextLine();
 	System.out.println("==============================");
	System.out.println(" Faktur Transaksi Anda ");
 	System.out.println(" No Faktur : "); no_faktur = input.nextLine();
 	System.out.println("Nama Admin : Sintia Dewi"); nama_admin = input.nextLine();
 	System.out.println("Kode Admin : 15111097"); kode_admin = input.nextLine();
 	System.out.println(" Kode Barang : "+ kode_barang);
 	System.out.println("Nama Barang :"+ nama_barang);
 	System.out.println("Type :"+ type);
 	System.out.println("Merk :"+ merk);
 	System.out.println("harga :"+ harga);
 

 	
	}

	
		public static void main(String[] args) {
		Elektronik nik = new Elektronik();
		nik.susunbarang();
		nik.databarang();
		nik.totalbarang();

		}



	
	

}