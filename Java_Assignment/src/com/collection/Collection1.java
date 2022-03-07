package com.collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.Contact.Gender;


class Contact{
	
	long phoneNo;
	String name;
	String email;
	Gender gender;
	enum Gender{
		Male,Female,Others
	}
	public Contact(long phoneNo, String name, String email ,Gender gender) {
		this.phoneNo = phoneNo;
		this.name = name;
		this.email = email;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "Contact [phoneNo=" + phoneNo + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
}

public class Collection1 {


		public static void main(String[] args) {
			Map<Long,Contact> m=new HashMap<>();
			m.put(7020946957l,new Contact(7020946957l,"Pranav","Pranav@gmail.com",Gender.Male));
			m.put(7798031810l,new Contact(7798031810l,"Khushi","Khushi@gmail.com",Gender.Female));
			
			
//			Set set=m.entrySet();
//			Iterator i=set.iterator();
//			while(i.hasNext())
//			{
//				Map.Entry key=(Map.Entry)i.next();
//				System.out.println("Keys "+key.getKey());
//			}
//			
//			while(i.hasNext())
//			{
//				Map.Entry value=(Map.Entry)i.next();
//				System.out.println("values "+value.getValue());
//			}
			System.out.println("keys:");
			for (Map.Entry<Long,Contact> entry : m.entrySet())
			{
	        System.out.println( entry.getKey());
	        
			}
			
			System.out.println("\nvalues:");
			for (Map.Entry<Long,Contact> entry : m.entrySet())
			{
	       
	        System.out.println(entry.getValue());
			}

			System.out.println("\nKey and Value:");
			System.out.println(m);
		
		}

	}

	