package tugasoop1;

public class Mobil{
	
	String nama;
	int kecepatan = 100;
	float percepatan = 20;
	float kecstop = 0;
	float rem = kecepatan/2;
	
	void start(){
		System.out.println("Jalankan mobil"+ nama);
	}	
	
	void stop(){
		System.out.println("Mobil berhenti Kecepatan "+ kecstop);
	}
}
	