import java.util.*;
public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,num;
Scanner sc=new Scanner(System.in);
int array[]=new int[15];
for(i=0;i<=14;i++) {
	System.out.println("enter 14 numbers");
	array[i]=sc.nextInt();
}
System.out.println("enter to find in array");
num=sc.nextInt();
for(i=0;i<=14;i++) {
	if(num==array[i])
	{
		System.out.println("number is found"+num);
		return;
	}
}
	System.out.println("number not found"+num);

	}

}
