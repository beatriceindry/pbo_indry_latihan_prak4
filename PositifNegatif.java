import java.util.Scanner;
public class PositifNegatif{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int bilangan;
		
		System.out.print("Masukkan Bilangan = ");
		bilangan = input.nextInt();
		
		if(bilangan < 0){
			System.out.println("Bilangan "+bilangan+" adalah Bilangan Negatif");
		}
		if(bilangan > 0){
			System.out.println("Bilangan "+bilangan+" adalah Bilangan Positif");
		}
		if(bilangan == 0){
			System.out.println("Bilangan "+bilangan+" adalah Bilangan Nol Bukan Bilangan Positif Ataupun Negatif");
		}
	}
}