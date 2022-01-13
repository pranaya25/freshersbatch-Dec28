
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int r,q=n;
		int sum=0;

		
		while(q>0)
	{
		r=q%10;
		q=q/10;
		sum=sum+(r*r*r);
	}
	if(n==sum)
	{
		System.out.println(sum);
	}
	}

}
