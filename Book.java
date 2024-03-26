package com.tech.palle;
import java.util.ArrayList;
import java.util.Scanner;

class Book 
		{
		    private int id;
		    private String title;
		    private String author;
		    private boolean available;

		    public Book(int id, String title, String author) {
		        this.id = id;
		        this.title = title;
		        this.author = author;
		        this.available = true; // Initially available
		    }

		    public int getId() {
		        return id;
		    }

		    public String getTitle() {
		        return title;
		    }

		    public String getAuthor() {
		        return author;
		    }

		    public boolean isAvailable() {
		        return available;
		    }

		    public void setAvailable(boolean available) {
		        this.available = available;
		    }
		}

		// Library class to manage books
		class Library {
		    private ArrayList<Book> books;

		    public Library() {
		        books = new ArrayList<>();
		    }

		    // Add a new book to the library
		    public void addBook(int id, String title, String author) {
		        Book newBook = new Book(id, title, author);
		        books.add(newBook);
		    }

		    // Display all available books
		    public void displayAvailableBooks() {
		        System.out.println("Available Books:");
		        for (Book book : books) {
		            if (book.isAvailable()) {
		                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
		            }
		        }
		    }

		    // Issue a book
		    public void issueBook(int bookId) {
		        for (Book book : books) {
		            if (book.getId() == bookId && book.isAvailable()) {
		                book.setAvailable(false);
		                System.out.println("Book issued successfully.");
		                return;
		            }
		        }
		        System.out.println("Book not available or invalid ID.");
		    }

		    // Return a book
		    public void returnBook(int bookId) {
		        for (Book book : books) {
		            if (book.getId() == bookId && !book.isAvailable()) {
		                book.setAvailable(true);
		                System.out.println("Book returned successfully.");
		                return;
		            }
		        }
		        System.out.println("Book not issued or invalid ID.");
		    }

		}


