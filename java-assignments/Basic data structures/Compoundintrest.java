import java.util.*;
import java.lang.Math;

public class Compoundintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double pr,r,t,simple,compound;
Scanner sc=new Scanner(System.in);
System.out.println("enter amount");
pr=sc.nextDouble();
System.out.println("enter no of years");
t=sc.nextDouble();
System.out.println("enter rate");
r=sc.nextDouble();
simple=(pr*r*t)/100;
compound=pr*Math.pow(1.0+r/100.0,t)-pr;
System.out.println("simple intrest="+simple);
System.out.println("compound intrest="+compound);
	}

}
