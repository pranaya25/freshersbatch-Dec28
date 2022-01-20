interface Addition {
	int add(int x,int y);
}
public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=4;
Addition ad=(int x,int y)->x-y;
int ans=ad.add(a,b);
Addition sub=(int x,int y)->x+y;
int anss=ad.add(a,b);
System.out.println(anss);
}

}
