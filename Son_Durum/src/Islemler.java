import java.util.Scanner;

public class Islemler {
	Scanner scanner = new Scanner(System.in);
	Baglan baglan = new Baglan();

	private String kullanici_adi;
	private String sifre;
	
	public Islemler(String kullanici_adi1, String sifre1) {
		this.kullanici_adi = kullanici_adi1;
		this.sifre = sifre1;
	}
	
	public String getKullanici_adi() {
		return kullanici_adi;
	}
	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	public boolean denetle(String username,String password) {
		if(kullanici_adi.equals(username) && sifre.equals(password)) {
			
			return true;
		}
		else { 
			return false;}
	}
	
	
}
