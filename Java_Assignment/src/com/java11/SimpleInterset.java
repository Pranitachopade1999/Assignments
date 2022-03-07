package com.java11;

interface Interest{
		 double SI(double P,double R,int T);
		}

public class SimpleInterset{
	
		 public static void main(String[] args) {
			 
		 var Principal=50000;
		 var rate=3.5;
		 var time=3;
		 Interest i=(var a, var b, var c)->(a*b*c)/100;
		 System.out.println(i.SI(Principal, rate, time));
		 }
	}
