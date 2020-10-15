import java.util.Scanner;
public class MaxMin{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int max, min, i, angka1,angka2,angka3,angka4,angka5;
		
		
		System.out.println("Masukkan 5 buah angka");
		System.out.print("Angka ke-1 = ");
		angka1 = input.nextInt();
		System.out.print("Angka ke-2 = ");
		angka2 = input.nextInt();
		System.out.print("Angka ke-3 = ");
		angka3 = input.nextInt();
		System.out.print("Angka ke-4 = ");
		angka4 = input.nextInt();
		System.out.print("Angka ke-5 = ");
		angka5 = input.nextInt();
		
		if(angka1>angka2 && angka1>angka3 && angka1>angka4 && angka1>angka5){
			max = angka1;
		} else if (angka2>angka1 && angka2>angka3 && angka2>angka4 && angka2>angka5){
			max = angka2;
		} else if (angka3>angka1 && angka3>angka2 && angka3>angka4 && angka3>angka5){
			max = angka3;
		} else if (angka4>angka1 && angka4>angka2 && angka4>angka3 && angka4>angka5){
			max = angka4;
		} else if (angka5>angka1 && angka5>angka2 && angka5>angka3 && angka5>angka4){
			max = angka5;
		}else {
			max = angka5;
		}
		if(angka1<angka2 && angka1<angka3 && angka1<angka4 && angka1<angka5){
			min = angka1;
		} else if (angka2<angka1 && angka2<angka3 && angka2<angka4 && angka2<angka5){
			min = angka2;
		} else if (angka3<angka1 && angka3<angka2 && angka3<angka4 && angka3<angka5){
			min = angka3; 
		} else if (angka4<angka1 && angka4<angka2 && angka4<angka3 && angka4<angka5){
			min = angka4;
		} else {
			min = angka5;
		}
		System.out.println("Angka Maksimum adalah = "+max);
		System.out.println("Angka Minimum adalah = "+min);
		}
		}