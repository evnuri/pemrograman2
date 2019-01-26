package pemrograman.pkg2;
import javax.swing.JOptionPane;

public class Pertemuan2soal2 {
	public static void main(String[] args){
		int[] nilai = new int[3];
		double nilairata = 0;
		int i;
		
		for (i=0; i<=3; i++){
			String bilangan = JOptionPane.showInputDialog("Input Nilai: ");
			nilai[i] = Integer.parseInt(bilangan);
			System.out.println(bilangan);
		}
		for (i=0; i<3; i++){
			nilairata += nilai[i];
			nilairata = nilairata/i;
		
		}
		
		if(nilairata >= 60){
			System.out.println("Nilai rata-rata: "+ nilairata +":)");
		}
		else{
			System.out.println("Nilai rata-rata: "+ nilairata +":-(");
		}
	}
}