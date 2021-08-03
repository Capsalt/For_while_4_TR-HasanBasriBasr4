import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int sayi = scan.nextInt();
		
		int faktoriyel = 1;
		
		for (int i = 1; i <= sayi; i++) {
			
			faktoriyel*=i;
			
		}
		
		String carpim = Integer.toString(sayi);
		for (int j = sayi-1; j > 0; j--) {
			
			 carpim = carpim +"*" + j;
			
		}
	
		System.out.println(sayi + "!=" + carpim +"=" + faktoriyel);
		scan.close();
  }
}