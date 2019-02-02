public class Compare2obj{
	public static void main(String[] args){
		
		String s1= "ini isinya sama";
		String s2= s1;
		String s3 = new String(s1);
		
		System.out.println("ini isi objek s1: " + s1);
		System.out.println("ini isi objek s2: " + s2);
		System.out.println("ini isi objek s3: " + s2);
		
		}
}