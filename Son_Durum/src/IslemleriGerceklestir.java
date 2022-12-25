import java.util.Scanner;

public class IslemleriGerceklestir {

	Scanner scanner = new Scanner(System.in);
	Islemler islemler = new yonetici("yonet00", "009250");			// Polymorphism ;	// Aynı Methoda erişip, override edip, farklı kullanıcı adları ve parolaları
	Islemler islemler1 = new sirketcalisanlari("emlak00", "456930");	// Polymorphism ;	// elde etmek için polymorphism kullandık.
	Baglan baglan = new Baglan();
	
	
public void islemYap() {
		
		int islem;
		
		
		System.out.println("				<>-------------------------------------------------HOSGELDINIZ-------------------------------------------------<>\n");
		System.out.println("Islemler icin,\n");
		while(true) {																//	1. Döngü
		System.out.println("1) Giris Yap)          2) Cikis yap\n");					// Ana giris 
		System.out.print("Seciniz :");
		islem = scanner.nextInt();
		
	if(islem == 1 ) {									
			System.out.println("\n1) Yonetici         2) Personel\n");					// Yonetici veya Personel Hesabina giris
			System.out.print("Seciniz :");
			int islem1 = scanner.nextInt();
			
		if(islem1 == 1) {
			scanner.nextLine();
			
				while(true) {																										//	2. Döngü
				System.out.println("Lutfen yonetici kullanici adinizi giriniz :");			// Yönetici hesabına girmek için kullanıcı adı isteme
				String kullaniciAdi = scanner.nextLine();									
				
				System.out.println("Lutfen yonetici sifrenizi giriniz :");						// Yönetici hesabına girmek için şifre isteme
				String sifre = scanner.nextLine();
				
				System.out.println("\nGiris Yapiliyor...\n");
				islemler.denetle(kullaniciAdi, sifre);											// yonetici sınıfı ISlemler sınıfına kalıtılarak "denetle" methodu 
																								//	override edildi ve kullanıcı adı ve şifre kontrol edilerek 
				if(islemler.denetle(kullaniciAdi, sifre)) {										// giriş sağlandı...
					System.out.println("\nGiris basariyla yapildi!\n");
					
					while(true) {											// Yönetici Girişi Yapıldı.								// 3.Döngü
						String yaz = 	"1 )Calisanlari Goruntule\n"
								      + "2) Calisan Ekle\n"
								      + "3) Calisan Guncelle\n"
								      + "4) Calisan Sil\n"
								      + "5) Cikis Yap\n";
								    
						
					System.out.println(yaz);
					System.out.print("Seciniz :\n");
						int islem2 = scanner.nextInt();
						
					if(islem2 == 1) {																// Kategori seçeneği
						
						System.out.println("1) Yonetici Bilgileri \n2) Calisan Personel Bilgileri");
						System.out.print("Seciniz :");
						int sayi = scanner.nextInt();
						if(sayi == 1) {
							String bilgi = "yoneticiler";		// yönetici tablosuna erişim
							baglan.calisanlariGetir(bilgi);
						}
						else if(sayi == 2) {
							String bilgi = "calisanlar";		// Çalışan personel tablosuna erişim;
							baglan.calisanlariGetir(bilgi);
						}
						
						System.out.println();
						
							}
				else if(islem2 == 2) {																// Kategori seçeneği
						scanner.nextLine();
						
						System.out.println("1) Yonetici Bilgileri \n2) Calisan Personel Bilgileri");
						System.out.print("Seciniz :");
						int sayi = scanner.nextInt();
						scanner.nextLine();
						
						if(sayi == 1) {
							String bilgi = "yoneticiler";		// yönetici tablosuna erişim
							baglan.calisanlariGetir(bilgi);
							
							System.out.println("\nCalisan bilgilerini giriniz.\n");
							System.out.print("Adi giriniz :");
							String ad = scanner.nextLine();
							System.out.print("Soyadi giriniz :");
							String soyad = scanner.nextLine();
							System.out.print("email adresini giriniz :");
							String email = scanner.nextLine();
							System.out.print("Satis bilgilerini giriniz :");
							String satisSayisi = scanner.nextLine();
							System.out.println();
							if(baglan.kullaniciEkle(ad, soyad, email)) {	// Bu değerlerin girilip girilmediğini kontrol ediyor. Bunlar gerekli girişler (interface)
								continue;									// Eger girilmediyse tekrar girmesini istiyor.
							}
							baglan.kullaniciEkle(ad, soyad, email, satisSayisi,bilgi);		// Kullanıcı ekleme bağlantısı;
							baglan.calisanlariGetir(bilgi);
							System.out.println();
							}
						else if(sayi == 2) {
							String bilgi = "calisanlar";			// Çalışan personel tablosuna erişim;
							baglan.calisanlariGetir(bilgi);
							
							System.out.println("\nCalisan bilgilerini giriniz.\n");
							System.out.print("Adi giriniz :");
							String ad = scanner.nextLine();
							System.out.print("Soyadi giriniz :");
							String soyad = scanner.nextLine();
							System.out.print("email adresini giriniz :");
							String email = scanner.nextLine();
							System.out.print("Satis bilgilerini giriniz :");
							String satisSayisi = scanner.nextLine();
							System.out.println();
							if(baglan.kullaniciEkle(ad, soyad, email)) {	// Bu değerlerin girilip girilmediğini kontrol ediyor. Bunlar gerekli girişler (interface)
								continue;									// Eger girilmediyse tekrar girmesini istiyor.
							}
							baglan.kullaniciEkle(ad, soyad, email, satisSayisi,bilgi);		// Kullanıcı ekleme bağlantısı;
							baglan.calisanlariGetir(bilgi);
							System.out.println();
						}
						
					}
					else if(islem2 == 3) {																// Kategori seçeneği
						System.out.println("1) Yonetici Bilgileri \n2) Calisan Personel Bilgileri");
						System.out.print("Seciniz :");
						int sayi = scanner.nextInt();
						if(sayi == 1) {
							String bilgi = "yoneticiler";		// yönetici tablosuna erişim
							baglan.calisanlariGetir(bilgi);
							
							System.out.print("\nGuncellemek istediginiz kisinin ID'sini giriniz:");
							int idNumber = scanner.nextInt();
							scanner.nextLine();
							System.out.print("\nGuncellemek istediginiz kisinin adini giriniz:");
							String ad = scanner.nextLine();
							System.out.print("\nGuncellemek istediginiz kisinin soyadini giriniz:");
							String soyad = scanner.nextLine();
							System.out.print("\nGuncellemek istediginiz kisinin e-mail adresini giriniz:");
							String email = scanner.nextLine();		
							System.out.print("\nGuncellemek istediginiz kisinin satis sayisini giriniz:");
							String satisSayisi = scanner.nextLine();
							baglan.calisanGuncelle(idNumber,ad,soyad,email,satisSayisi,bilgi);		// Kullanıcı güncelleme bağlantısı;
							System.out.println("\nGuncelleniyor...\n");
							baglan.calisanlariGetir(bilgi);
							System.out.println("\nBasariyla güncellendi.");
						}
						else if(sayi == 2) {
							String bilgi = "calisanlar";			// Çalışan personel tablosuna erişim;
							baglan.calisanlariGetir(bilgi);
							
							System.out.print("\nGuncellemek istediginiz kisinin ID'sini giriniz:");
							int idNumber = scanner.nextInt();
							scanner.nextLine();
							System.out.print("\nGuncellemek istediginiz kisinin adini giriniz:");
							String ad = scanner.nextLine();
							System.out.print("\nGuncellemek istediginiz kisinin soyadini giriniz:");
							String soyad = scanner.nextLine();
							System.out.print("\nGuncellemek istediginiz kisinin e-mail adresini giriniz:");
							String email = scanner.nextLine();		
							System.out.print("\nGuncellemek istediginiz kisinin satis sayisini giriniz:");
							String satisSayisi = scanner.nextLine();
							baglan.calisanGuncelle(idNumber,ad,soyad,email,satisSayisi,bilgi);		// Kullanıcı güncelleme bağlantısı;
							System.out.println("\nGuncelleniyor...\n");
							baglan.calisanlariGetir(bilgi);
							System.out.println("\nBasariyla güncellendi.\n");
						}
						else {
							System.out.println("Lutfen dogru bir deger giriniz...");
						}
						
					}
					if(islem2 == 4) {										// Kategori seçeneği
						System.out.println("\nSilmek istediginiz tabloyu seciniz \n");					// Yönetici veya Çalışan Personel tablolarının seçimi;
						System.out.println("1) Yonetici Bilgileri \n2) Calisan Personel Bilgileri\n");
						System.out.print("Seciniz :");
						int sayi = scanner.nextInt();
						if(sayi == 1) {
							String bilgi = "yoneticiler";											// yönetici tablosuna erişim
								baglan.calisanlariGetir(bilgi);
									System.out.println();
							System.out.print("Silmek istediginiz kisinin ID'sini giriniz :");			
							int id = scanner.nextInt();
							if(baglan.calisanSil(id)) {
								continue;							// ID = 0 giriş kontrolü;
							}
							baglan.calisanSil(bilgi,id);											// Kullanıcı silme bağlantısı
							System.out.println();
							baglan.calisanlariGetir(bilgi);
							System.out.println("\nKisi Basariyla silinmistir...\n");
								
						}
						if(sayi == 2) {
							String bilgi = "calisanlar";									// Çalışan personel tablosuna erişim;
								baglan.calisanlariGetir(bilgi);
									System.out.println();
									System.out.print("Silmek istediginiz kisinin ID'sini giriniz :");		
									int id = scanner.nextInt();
									if(baglan.calisanSil(id)) {
										continue;							// ID = 0 giriş kontrolü;
									}
									baglan.calisanSil(bilgi,id);							// Kullanıcı silme bağlantısı
									System.out.println();
									baglan.calisanlariGetir(bilgi);		
									System.out.println("\nKisi Basariyla silinmistir...\n");
						}
						else { 
							System.out.println("Lutfen gecerli bir deger giriniz...");
							}
			}	
					if(islem2 == 5) {
						System.out.println("Cikis yapiliyor...");
						break;	// Çıkış işlemi için;
						}
		}
					
	}
						else {					
							System.out.println("Yonetici Girisi Hatali ! Lutfen tekrar deneyiniz.");		// Eger girilen kullanıcı adı veya şifre hatalıysa
							continue;
							}	
							break;	// Çıkış işlemi için;
		}		
	}	
		if(islem1 == 2) {
			scanner.nextLine();
			
			
			while(true) {																														
				System.out.println("Lutfen yonetici kullanici adinizi giriniz :");			// Calisan hesabına girmek için kullanıcı adı isteme;
				String kullaniciAdi = scanner.nextLine();									
				
				System.out.println("Lutfen yonetici sifrenizi giriniz :");						// Calisan hesabına girmek için şifre isteme;
				String sifre = scanner.nextLine();
				
				System.out.println("\nGiris Yapiliyor...\n");
				islemler1.denetle(kullaniciAdi, sifre);											// Calisan sınıfı islemler sınıfına kalıtılarak "denetle" methodu 
																								//	override edildi ve kullanıcı adı ve şifre kontrol edilerek 
				if(islemler1.denetle(kullaniciAdi, sifre)) {										// giriş sağlandı...
					System.out.println("\nGiris basariyla yapildi!\n");
					
					while(true) {											// Calisan Girişi Yapıldı.										
						String yaz = 	"1 )Calisanlari Goruntule\n"		// Calisanlar sadece tabloları görüntüleyebilir. Tablolar üzerinde değişiklik yapamaz.
									  + "2) Cikis Yap\n";
						System.out.println(yaz);
						System.out.print("Seciniz :");
						
						int islem2 = scanner.nextInt();
						
						if(islem2 == 1) {																// Kategori seçeneği
							
							System.out.println("1) Yonetici Bilgileri \n2) Calisan Personel Bilgileri");
							System.out.print("Seciniz :");
							int sayi = scanner.nextInt();
							if(sayi == 1) {
								String bilgi = "yoneticiler";		// yönetici tablosuna erişim
								baglan.calisanlariGetir(bilgi);
							}
							else if(sayi == 2) {
								String bilgi = "calisanlar";		// Çalışan personel tablosuna erişim;
								baglan.calisanlariGetir(bilgi);
							}
							
							System.out.println();
							
								}
						else if(islem2 == 2) {
							System.out.println("Cikis yapiliyor...");
							break;
						}	
						
					}
				}
				else {
					System.out.println("Calisan girisi hatali !! Lutfen tekrar deneyiniz.\n");// Kullanici girisi hata mesajı;
					
					continue;
				}
				break;
			}
		}
	}
					else if(islem == 2) {
					break;
						}
							
					else {
					System.out.println("\nGecerli bir deger giriniz ( 1 veya 2)\n");				// Seçilmek istenen bilgilerin numaraları yanlış girilmişse;
					}
					break;	// Çıkış işlemi için;
		}	
	}	
}
