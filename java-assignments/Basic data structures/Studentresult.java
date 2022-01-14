import java.util.*;
public class Studentresult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int A,B,C;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter A subject marks");
	A=sc.nextInt();
	System.out.println("enter B subject marks");
	B=sc.nextInt();
	System.out.println("enter C subject marks");
	C=sc.nextInt();
if(A>=60 && B>=60 && C>=60) {
	System.out.println("pass");
}
else if((A>=60 && B>=60) || (B>=60 && C>=60) || (A>=60 && B>=60)){
System.out.println("next class promoted");
}
else
System.out.println("fail");
	
	}

}
