
public class yonetici extends Islemler {				// Inheritence;

	public yonetici(String kullanici_adi1, String sifre1) {
		super(kullanici_adi1, sifre1);
		// TODO Auto-generated constructor stub
	}
	
	public boolean denetle(String name,String password) {
		if(getKullanici_adi().equals(name) && getSifre().equals(password)) {
			
			return true;
		}
		else {
			return false;
		
		}
		
	}
	
}
