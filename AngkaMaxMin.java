import java.util.Scanner;
public class AngkaMaxMin{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int max,min,a,b,c,nilai;
		
		System.out.print("Masukkan Jumlah Bilangan = ");
		a = input.nextInt();
		min = a;
		max = a;
		
		for(b=1; b<=a; b++){
			System.out.print("Masukkan Bilangan ke- "+b+" : ");
			nilai = input.nextInt();
			
			if(nilai<=min){
				min=nilai;
			}
			else if(nilai > max){
				max = nilai;
			}
			else{
			}
		}
		System.out.println("Nilai Maximum adalah : "+max);
		System.out.println("Nilai Minimum adalah : "+min);
	}
}