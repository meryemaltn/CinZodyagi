import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int year;
		Scanner inp=new Scanner(System.in);
		System.out.println("Doðum Yýlýnýzý Giriniz: ");
		year=inp.nextInt();
		
		if (year%12==0) {
			System.out.println("Çin burcunuz maymun");
		}
		else if (year%12==1) {
			System.out.println("Çin burcunuz horoz");
		}
		else if (year%12==2) {
			System.out.println("Çin burcunuz köpek");
		}
		else if (year%12==3) {
			System.out.println("Çin burcunuz domuz");
		}
		else if (year%12==4) {
			System.out.println("Çin burcunuz fare");
		}
		else if (year%12==5) {
			System.out.println("Çin burcunuz öküz");
		}
		else if (year%12==6) {
			System.out.println("Çin burcunuz kaplan");
		}
		else if (year%12==7) {
			System.out.println("Çin burcunuz tavþan");
		}
		else if (year%12==8) {
			System.out.println("Çin burcunuz ejderha");
		}
		else if (year%12==9) {
			System.out.println("Çin burcunuz yýlan");
		}
		else if (year%12==10) {
			System.out.println("Çin burcunuz at");
		}
		else if (year%12==11) {
			System.out.println("Çin burcunuz koyun");
		}
	}
}