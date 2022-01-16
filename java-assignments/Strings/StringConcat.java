import java.util.*;
public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1,s2;
Scanner sc=new Scanner(System.in);
System.out.println("enter s1 string");
s1=sc.nextLine();
System.out.println("enter s2 string");
s2=sc.nextLine();
String str=s1.concat(s2);
System.out.println("concatination of two strings is="+str);
	}

}
