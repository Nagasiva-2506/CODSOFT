import java.util.Scanner;
class Percentage//sub class 
{
	float per(int totMarks)
	{
		float p=(float)totMarks/6;
		return p;//returning the percentage
	}
}
class Codsoft_Task2//main class
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		int i=1,totMarks=0;//begginning with total is zero
		while(i<=6)
		{
			System.out.println("Enter the marks of sub"+i);
			int sub=s.nextInt();//asking to enter the marks
			if(sub<0 && sub>100)
			{
				System.out.println("Invalid marks");
				continue;
			}
			totMarks=totMarks+sub;
			i++;
		}
		System.out.println("Total marks:"+totMarks);
		Percentage ob=new Percentage();
		float pr=ob.per(totMarks);
		System.out.println("Percentage"+pr);
		// Grade Calculation
			String grade;
			if (pr>= 90) 
			{
				grade = "A+";
			} 
			else if (pr>= 80) 
			{
				grade = "A";
			} 
			else if (pr>= 70) 
			{
				grade = "B";
			} 
			else if (pr>= 60) 
			{
				grade = "C";
			} 
			else 
			{
           			 grade = "F";
			}
		System.out.println("Grade: " + grade);
		s.close();
	}
}
