import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int year,remainder;
		Scanner giris=new Scanner(System.in);
		
		System.out.println("Lütfen Doğum Yılınızı Giriniz : ");
		year=giris.nextInt();
		
		remainder=year%12;
		
		switch (remainder) {
		case 0:
			System.out.println("Çin Zodiakı Burcunuz : Maymun");
			break;
		case 1:
			System.out.println("Çin Zodiakı Burcunuz : Horoz");
			break;
		case 2:
			System.out.println("Çin Zodiakı Burcunuz : Köpek");
			break;
		case 3:
			System.out.println("Çin Zodiakı Burcunuz : Domuz");
			break;
		case 4:
			System.out.println("Çin Zodiakı Burcunuz : Fare");
			break;
		case 5:
			System.out.println("Çin Zodiakı Burcunuz : Öküz");
			break;
		case 6:
			System.out.println("Çin Zodiakı Burcunuz : Kaplan");
			break;
		case 7:
			System.out.println("Çin Zodiakı Burcunuz : Tavşan");
			break;
		case 8:
			System.out.println("Çin Zodiakı Burcunuz : Ejderha");
			break;
		case 9:
			System.out.println("Çin Zodiakı Burcunuz : Yılan");
			break;
		case 10:
			System.out.println("Çin Zodiakı Burcunuz : At");
			break;
		case 11:
			System.out.println("Çin Zodiakı Burcunuz : Koyun");
			break;
		
		default:
			System.out.println("Hatalı Giriş Yapıldı!");
			break;
		}

	}

}
