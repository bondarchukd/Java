public class TernaryIfExample {

	public static void main(String[] args) {
		
		int x = 3;
		int y =5;

		int minValue maxValue;

		minValue = x < y ? x : y; 
		maxValue = x > y ? x : y;

		System.out.println("Minimume value is " + minValue);
		System.out.println("Maximume value is " + maxValue);
	}
}