import java.util.Scanner;

public class DigitalToBinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter digit");
		
		convert(scan.nextInt());
	}

	private static void convert(int n) {
		for(int i=0;i<12;i++){

				if(Integer.bitCount(i)==n) {
					System.out.println(i+":00");
				}
			
			
			}
		for(int j=0;j<59;j++) {
			if(Integer.bitCount(j)==n) {
				System.out.println("0:"+check(j));
			}
	}

}

	private static String check(int j) {
		return j<10 ? "0"+j : Integer.toString(j);
	}
}
