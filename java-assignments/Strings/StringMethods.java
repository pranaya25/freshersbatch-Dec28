import java.util.*;
import java.lang.String;
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str,strpos,constant;
;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
str=sc.nextLine();
String s1=str.toUpperCase();
System.out.println("string upper case="+s1);
String s2=str.toLowerCase();
System.out.println("string lower case="+s2);
String s3=str.replace("a", "$");
System.out.println("replace the string="+s3);
String s4="str";
if(str.contains("collection")) 
{	//String echo 'true';
	System.out.println("Collection found in the given string");
}

System.out.println("Enter another string to match");
String str2 = sc.nextLine();

if(str.compareTo(str2) == 0) {
	System.out.println("Strings matched with compare to method");
}
else {
	System.out.println("Strings does not matched with compare to method");
}

if(str.compareToIgnoreCase(str2) == 0) {
	System.out.println("Strings matched with compareToIgnoreCase method");
}
else {
	System.out.println("Strings does not matched with compareToIgnoreCase method");
}

}
}
