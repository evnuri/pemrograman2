package pemrograman.pkg2;
import java.util.*;

public class Tugaspertemuan2 {
	public static void main(String[] args){
		String nilai;
		
	Scanner Scan = new Scanner(System.in);
		System.out.println("Input Nilai(A/B/C/D/E):" );
		
		nilai = Scan.next();
		
		if("A".equals(nilai)){
			System.out.println("Excellent");
		}
		else if("B".equals(nilai)){
			System.out.println("Good Job");
		}
		else if("C".equals(nilai)){
			System.out.println("Study Harder");
		}
		else{
			System.out.println("Sorry, you faied");
		}
	}
}