package com.annotations;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;



@interface Info
{
	String AuthorID();
	String Author() default "[Pranita]"; 
	String Supervisor() default "[Khushi]";
	String Date();
	String Time();
	double Version();
	String Description() default "[Class,Method,Properties]";
	
}


@Info(Author = "", AuthorID = "1235df", Date = "4 Jan 2022", Description = "", Supervisor = "", Time = "06:30", Version = 3.4)
class Developer
{
	String AuthorID;
	String Author; 
	String Supervisor;
	String Date;
	String Time;
	double Version;
	String Description;
	
	public Developer(String authorID, String author, String supervisor, String date, String time, double version,
			String description) {
		super();
		AuthorID = authorID;
		Author = author;
		Supervisor = supervisor;
		Date = date;
		Time = time;
		Version = version;
		Description = description;
	}

	@Info(AuthorID = "13423df", Date = "4 feb 2021", Time = "04:34", Version = 4.5)
	public void javaProject()
	{
		System.out.println("Info Annotation");
	}
	
}

public class Annotation2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Developer j= new Developer("Pranita", "Khushi", "XYZ", "ABC", "SED", 4, "HGF");
		Method m= j.getClass().getMethod("javaProject");
		Info a=m.getAnnotation(Info.class);
		
		System.out.println(a.Author()+ " " + a.AuthorID()+" "+ a.Supervisor()+" " + a.Date()
		+" " + a.Time() +" "+ a.Version()+ " " + a.Description() );
	}

}
