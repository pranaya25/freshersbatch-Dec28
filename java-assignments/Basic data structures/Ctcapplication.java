import java.util.*;
public class Ctcapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String username="pranaya",password="text123";
String userinput,userpassword;
int i;
Scanner sca=new Scanner(System.in);
for( i=0;i<3;i++) {
	System.out.println("enter user name");
	userinput=sca.nextLine();
System.out.println("enter password");
userpassword=sca.nextLine();

if((userinput.equals(username)) && (userpassword.equals(password))) {
	System.out.println("welcome"+username);
	return;
}

System.out.println("invalid credintials you have only "+(2-i)+" attempts left");
	}
	System.out.println("Contact Admin");

	}

}
