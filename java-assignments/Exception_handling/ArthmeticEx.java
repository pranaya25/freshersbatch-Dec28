import java.util.*;
public class ArthmeticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
i=sc.nextInt();
System.out.println("enter the second number");
j=sc.nextInt();
try {
	k=i/j;
}
catch(Exception e) {
	System.out.println(e);
}
System.out.println(k);
	}

}
