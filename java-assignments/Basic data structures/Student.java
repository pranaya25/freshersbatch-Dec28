import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-geneintrated method stub
int A,B,C;
int total;
float avg;
int i;
Scanner sc=new Scanner(System.in);
for(i=0;i<=3;i++)
{
	System.out.println("enter A suject marks");
	A=sc.nextInt();
	System.out.println("enter B subject marks");
	B=sc.nextInt();
	System.out.println("enter C subject marks");
	C=sc.nextInt();
	total=A+B+C;
	avg=total/3;
	System.out.println("total marks="+total);
	System.out.println("avg marks="+avg);
}
	}

}
