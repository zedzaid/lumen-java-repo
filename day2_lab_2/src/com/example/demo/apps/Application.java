package com.example.demo.apps;

import com.example.demo.Book;
import com.example.demo.services.BookService;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookService service = new BookService();

		ArrayList<Book> bookRepo = new ArrayList<Book>();
		bookRepo.add(new Book(1,"A TIME TO KILL","JOHN GRISHMA",499.00));
		bookRepo.add(new Book(2,"THE HOUSE OF MIRTH","EDITH WHARTON",1599.00));
		bookRepo.add(new Book(3,"EAST OF EDEN","JOHN STEINBECK",149.00));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Book Library");
		
		for(Book b : bookRepo) {
			System.out.println(b.getId()+" "+b.getBookName()+" by  "+b.getAuthor()+" | Price "+b.getPrice());
		}
		
		System.out.println("Enter your book ID");
		int id=sc.nextInt()-1;
		
		Book selectedBook = bookRepo.get(id);
		
		System.out.println("Select the Customer type");
		
		System.out.println("1. Corporate\n2. Retail\n3. other ");
		int type=sc.nextInt();
		
		switch (type) {
		case 1: {
			
			System.out.println("your corporate discount for the book is "+service.calculateDiscount(selectedBook,"cOrporate"));
			break;
		}
		case 2:
			System.out.println("your Retail discount for the book is "+service.calculateDiscount(selectedBook,"retail"));
			break;
		default:
			System.out.println("your  discount for the book is "+service.calculateDiscount(selectedBook));
			break;
		}
			
			
		
		
	}

}
