import java.util.Scanner;
public class GanjilGenap{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("Masukkan Nilai = ");
		nilai = input.nextInt();
		
	//posisi if berjalan
	if(nilai % 2 == 0){
		System.out.println("AngkaYang Dimasukkan Adalah Genap");
	}
	else
		System.out.println("Angka Yang Dimasukkan Adalah Ganjil");
	}
}