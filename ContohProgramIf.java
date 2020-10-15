import java.util.Scanner;
public class ContohProgramIf{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int nilai;
		
		System.out.print("Masukkan Nilai = ");
		nilai = input.nextInt();
		
	//posisi if berjalan
	if(nilai==1){
		System.out.println("Angka Yang Dimasukkan Adalah Satu");
	}
	else
		System.out.println("Angka Yang Dimasukkan Bukan Satu");
	}
}