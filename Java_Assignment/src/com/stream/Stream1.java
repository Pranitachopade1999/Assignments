package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {

	
	public static List<Fruit> getAllFruits() {
			List<Fruit> fruits = new ArrayList<Fruit>();
			fruits.add(new Fruit("Papaya", 90, 40, "Orange"));
			fruits.add(new Fruit("Banana", 270, 10, "Yellow"));
			fruits.add(new Fruit("Pomegranate", 150, 70, "Red"));
			fruits.add(new Fruit("Apple", 300, 150, "Red"));
			fruits.add(new Fruit("Watermelon", 30, 20, "Red"));
			return fruits;
		}
		public static void printFruits(List<Fruit> fruits) {
			fruits.stream().forEach(System.out::println);
		}

		public static List<News> getAllNews() {
			List<News> newsList = new ArrayList<News>();
			newsList.add(new News(1, "Pranita", "Khushi", "Nice article.."));
			newsList.add(new News(2, "Pooja", "Ram", "Extreamly good"));
			newsList.add(new News(1, "Durga", "sham", "wonderful article"));
			newsList.add(new News(2, "Meera", "Niru", "I agree with you!!"));
			newsList.add(new News(2, "Rani", "Radha", "Less budget and nice idea"));
			newsList.add(new News(3, "Pratiksha", "Nikita", "Good budget"));
			return newsList;
		}
		public static void printNews(List<News> newsList) {
			newsList.stream().forEach(System.out::println);
		}

		public static List<Transaction> getAllTransactions() {
			List<Transaction> transactions = new ArrayList<Transaction>();
			transactions.add(new Transaction(new Trader("Pranita", "Pune"), 2020, 25000));
			transactions.add(new Transaction(new Trader("Ram", "Ahembdabad"), 2017, 15000));
			transactions.add(new Transaction(new Trader("Pooja", "Mumbai"), 2021, 35000));
			transactions.add(new Transaction(new Trader("Rani", "Pune"), 2008, 30000));
			transactions.add(new Transaction(new Trader("Meera", "Pune"), 2013, 70000));
			transactions.add(new Transaction(new Trader("Durga", "Indore"), 2015, 188900));
			return transactions;
		}
		
		public static void printTransactions(List<Transaction> transactions) {
			transactions.stream().forEach(System.out::println);
		}
	}
	
	
