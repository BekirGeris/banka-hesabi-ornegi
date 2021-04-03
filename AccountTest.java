package Bolum_9_Soru_7;

public class AccountTest {
	public static void main(String[] args) {
		Account hesap = new Account(1122, 20_000, 4.5);
		
		hesap.paraCekme(2_500);
		hesap.paraYatir(3_000);
		
		System.out.println("Hesap bakiyesi: " + hesap.getBalance());
		System.out.println("Aylik Faiz Miktari: " + hesap.getAylikGuncelFaizMiktari());
		System.out.println("Hesabin acilis tarihi: " + hesap.getHesabinOlusturulmaTarihi());
	}

}
