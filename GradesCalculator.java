package for_assignment;

import java.util.Scanner;

public class GradesCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int semesters_covered = theSemestersCovered(s);
		int courses;
		int total_number_of_courses=0;
		float current_sum_of_grades;

		float final_sum_of_grades = 0;

		for (int i = 0; i < semesters_covered; i++) {
			courses = number_of_courses_this_semester(s,i);
			
			
			current_sum_of_grades = semesterGPA(s, courses);
			
			total_number_of_courses = total_number_of_courses + courses;
			final_sum_of_grades = final_sum_of_grades + current_sum_of_grades;
			
			finalGPA(semesters_covered, total_number_of_courses, final_sum_of_grades, i);
		}
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static int theSemestersCovered(Scanner s) { //asks user to input no. of semesters covered
		System.out.print("how many semesters have you covered? ");
		while(!s.hasNextInt()) {//makes sure that correct data type is input
			System.out.println("Invalid datatype");
			System.out.print("how many semesters have you covered? ");
			s.next();
		}
		int semesters_covered = s.nextInt();
		while(semesters_covered>15 || semesters_covered<0) {//makes sure that semesters are within valid range
			
			System.out.println("invalid number of semesters");
			System.out.print("how many semesters have you covered?");
			semesters_covered = s.nextInt();
			
		}
		
		return semesters_covered;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static void finalGPA(int semesters_covered, int total_number_of_courses, float final_sum_of_grades, int i) {
		//finds total GPA
		float total_GPA;
		double total_GPA_out_of_4;
		total_GPA = final_sum_of_grades / total_number_of_courses;
		total_GPA_out_of_4 = total_GPA * 0.04;
		
		if (i == semesters_covered - 1) {
			System.out.printf("\ntotal GPA = %.2f" , total_GPA);
			System.out.printf("\nGPA out of 4 = %.2f", total_GPA_out_of_4);
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static float semesterGPA(Scanner s, int courses) {
		//prints GPA and returns the current sum of grades
		float semester_GPA;
		double semester_GPA_out_of_4;
		float current_sum_of_grades;
		current_sum_of_grades = sum_of_marks_semester(s, courses);
		semester_GPA = current_sum_of_grades / courses;
		semester_GPA_out_of_4 = semester_GPA * 0.04;
		
		System.out.printf("this semsters GPA = %.2f", semester_GPA  );
		System.out.printf("\nGPA out of 4 = %.2f", semester_GPA_out_of_4);
	    return current_sum_of_grades;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static int number_of_courses_this_semester(Scanner s, int i) {
		//returns valid number of courses for semester from user input
		System.out.print(" \nhow many courses did you take in semester  "+ (i+1) +"?");
		while(!s.hasNextInt()) {
			System.out.println("Invalid datatype");
			System.out.print("how many courses did you take in semester  "+ (i+1) +"?");
			s.next();
		}
		
		int courses = s.nextInt();
		while(courses>=11 || courses <=0 ) {
			System.out.println("invalid number of courses");
			System.out.print(" how many courses did you take in semester  "+ (i+1) +"?");
			courses = s.nextInt();

		}
		return courses;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static float sum_of_marks_semester(Scanner s, int courses) {
		//asks user to input grades. Makes sure that grades input are valid. Returns the sum of these grades
		float sum_of_grades=0;
		System.out.println("\nenter your grades (out of 100):");
		for (int j = 1; j < courses+1; j++) {
			System.out.print("enter grade number "+j + ":");
			while(!s.hasNextFloat()) {
				System.out.println("Invalid datatype");
				System.out.print("enter grade number "+j + ":");
				s.next();
			}
			float grade = s.nextFloat();
			if(grade>=100) {
				grade=100;
				System.out.println("grade assumed to be 100");
				System.out.println("continue entering your grades");
			}
			if(grade<=35) {
				grade= 35;
				System.out.println("grade assumed to be 35");
				System.out.println("continue entering your grades");
			}
			sum_of_grades = sum_of_grades + grade;
		}
		return sum_of_grades;
	}

}
