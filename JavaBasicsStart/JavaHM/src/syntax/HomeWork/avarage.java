package syntax.HomeWork;

import java.util.Scanner;

public class avarage {

	public static void main(String[] args) {
		
		
		Scanner boom=new Scanner(System.in);
		
		
		
		System.out.println("enter quiz score");
		
		double quiz=boom.nextDouble();
		System.out.println("enter midterm Score");
		double midTerm=boom.nextDouble();
		System.out.println("enter finalScore");
		double finalScore=boom.nextDouble();
		
		double avarage=(quiz+midTerm+finalScore)/3;
		String grade = null;
		
		if (avarage>=90 && avarage <=100) {
			grade="A";
		}else if (avarage>=70 && avarage<=90) {
			grade="B";
		}else if(avarage>=50 && avarage <=70) {
			grade="C";
		}else if (avarage <50) {
			grade="F";
		
		}else {
			System.out.println("don't lie about your scores");
		}
		
	System.out.println(grade);
		
		
	}

}
