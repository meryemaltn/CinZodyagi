import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int year;
		Scanner inp=new Scanner(System.in);
		System.out.println("Do�um Y�l�n�z� Giriniz: ");
		year=inp.nextInt();
		
		if (year%12==0) {
			System.out.println("�in burcunuz maymun");
		}
		else if (year%12==1) {
			System.out.println("�in burcunuz horoz");
		}
		else if (year%12==2) {
			System.out.println("�in burcunuz k�pek");
		}
		else if (year%12==3) {
			System.out.println("�in burcunuz domuz");
		}
		else if (year%12==4) {
			System.out.println("�in burcunuz fare");
		}
		else if (year%12==5) {
			System.out.println("�in burcunuz �k�z");
		}
		else if (year%12==6) {
			System.out.println("�in burcunuz kaplan");
		}
		else if (year%12==7) {
			System.out.println("�in burcunuz tav�an");
		}
		else if (year%12==8) {
			System.out.println("�in burcunuz ejderha");
		}
		else if (year%12==9) {
			System.out.println("�in burcunuz y�lan");
		}
		else if (year%12==10) {
			System.out.println("�in burcunuz at");
		}
		else if (year%12==11) {
			System.out.println("�in burcunuz koyun");
		}
	}
}