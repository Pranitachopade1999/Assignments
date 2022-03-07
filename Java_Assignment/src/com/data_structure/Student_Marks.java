package com.data_structure;

import java.util.Scanner;

public class Student_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of student");
		int stud_no=sc.nextInt();
		
		System.out.println("Enter the no of subject");
		int sub_no=sc.nextInt();
		
		int total=0,total_each_sub=0;
		int[][] marks= new int[sub_no][sub_no];
		int[][] marks1=new int[sub_no][sub_no];
		for(int i=0;i<stud_no;i++)
		{
			System.out.println("Enter the Marks for student no " + (i+1));
			for(int j=0;j<sub_no;j++)
			{
				marks[i][j]=sc.nextInt();
				total=total+marks[i][j];
			}
			System.out.println("Student no " + (i+1) + " Total = "+ total);	
			System.out.println("Student no " + (i+1) + " Average = "+ (total/sub_no));
			total=0;
		}
		
		for(int i=0;i<stud_no;i++)
		{
			for(int j=0;j<sub_no;j++)
			{
				marks1[i][j]=marks[j][i];
				total_each_sub=total_each_sub+marks1[i][j];
			}
			System.out.println("\nTotal of subject " +(i+1)+ " of all student is :" +total_each_sub);	
			System.out.println("Average of subject " +(i+1)+ " of all student is :" +(total_each_sub/sub_no));
			total_each_sub=0;
			
		}
		
//		for(int i=0;i<stud_no;i++)
//		{
//			for(int j=0;j<sub_no;j++)
//			{
//				System.out.print(marks1[i][j]+ " ");
//				
//			}
//			System.out.println();
//			
//		}
		
		}
		
		}


