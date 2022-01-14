import java.util.*;
public class Incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float tax;
Scanner sc=new Scanner(System.in);
System.out.println("enter your salary");
int CTC=sc.nextInt();
if(0<=CTC && CTC<=180000)
{
	System.out.println("Nill");
}
else if(180001<CTC && CTC<=300000)
{
	tax=CTC*10/100;
	System.out.println(tax);
}
else if(300001<=CTC && CTC<=500000) {
	tax=CTC*20/100;
	System.out.println(tax);
}
else if(500000<=CTC && CTC<=1000000)
{
	tax=CTC*30/100;
	System.out.println(tax);
}
}
	}


