package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Program7
{ 
	public static void main(String[] args) {
	Map<Long,Contact> m=new HashMap<>();
	m.put(10012002l,new Contact(7654322,"ABC","anonymous@abc.com",Contact.Gender.Female));
	
	Set<Long> keys=m.keySet();
	System.out.println("Keys:-");
	for(long i:keys)
	{
		System.out.println(i);
	}
	System.out.println();
	System.out.println("Values:-");
	for(long i:keys)
	{
		System.out.println(m.get(i));
	}
	System.out.println();
	System.out.println("Key and Value-");
	System.out.println(m);
}

}

class Contact{

long phoneNo;
String name;
String email;
private Contact.Gender gen;
enum Gender{
	Male,Female,Others
}
public Contact(long phoneNo, String name, String email ,Gender gen) {
	super();
	this.phoneNo = phoneNo;
	this.name = name;
	this.email = email;
	this.gen=gen;
}
@Override
public String toString() {
	return "Contact [phoneNo=" + phoneNo + ", name=" + name + ", email=" + email + ", gen=" + gen + "]";
}

}
