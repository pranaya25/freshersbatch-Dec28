package org.collection.app;
import java.util.EnumSet;

public class TreeMapEX {
	long phn;
    String name, email;
    public enum gen  {F,M}
   gen g;
public void TreeMapEx(long phn, String name, String email, gen g) {
	
	this.phn = phn;
	this.name = name;
	this.email = email;
	this.g = g;
}
public long getPhn() {
	return phn;
}
public void setPhn(long phn) {
	this.phn = phn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public gen getG() {
	return g;
}
public void setG(gen g) {
	this.g = g;
}
		
}


