package paradigms;

public class AverageOf3 {// procedural programming

	public static void main(String[] args) {
		printReason();
		averageOf3(255, 145, 569);
		averageOf3(60, 85, 58);

	}
////////////////////////////////////////////////////////////////////////////
	private static void averageOf3(float a, float b, float c) {
		float my_sum = sum_of_3_numbers(a, b, c);
		System.out.printf("the sum is %.1f \n", my_sum);
		double my_average = average_of_3_numbers(my_sum);
		System.out.printf("the average is %.1f \n", my_average);
	}
	
//////////////////////////////////////////////////////////////////////////////////
	public static void printReason() {// function that prints "hello!" when called
		System.out.println("The goal is to show the sum and average of any three numbers");

	}
	
//////////////////////////////////////////////////////////////////////////////
	public static float sum_of_3_numbers(float a, float b, float c) {
		return a + b + c;
	}
	
//////////////////////////////////////////////////////////////////////////////////////
	public static double average_of_3_numbers(float sum_of_3_numbers) {
		return sum_of_3_numbers / 3;
	}
}
