
public class Sheram {

	private static int x;
	
	private static long nextFieldValue;
	private static int currentRowLength;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x = 0;
		
		currentRowLength = 0;
		
		nextFieldValue = 1;
		
		while (x < 3) {
			
			while (currentRowLength < 8) {
				System.out.print(nextFieldValue + "		");
				
				nextFieldValue = nextFieldValue * 2;
				
				currentRowLength = currentRowLength + 1;
			}
			
			System.out.println();
			currentRowLength = 0;
			x = x + 1;
		}
		
	}

}
