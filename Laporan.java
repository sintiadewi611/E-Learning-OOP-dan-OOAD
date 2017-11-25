import java.util.Scanner;
public class Laporan {
	public String no_laporan;
	public String tgl_laporan;
	public String jenis_laporan;


	public void cetak() {
		this.no_laporan = "00123";
		this.tgl_laporan = "30 Oktober 2017" ;
		this.jenis_laporan = "keuangan";
		System.out.println(no_laporan);
		System.out.println(tgl_laporan);
		System.out.println(jenis_laporan);
	}

	public void ubah_Laporan() {
		System.out.print("Masukan nomor laporan yang akan anda ubah :");
		no_laporan = input.nextLine();
	}

	public void hapus_Laporan() {
		System.out.print("Masukan nomor laporan yang akan anda hapus :");
		no_laporan = input.nextLine();	
	}
		
}