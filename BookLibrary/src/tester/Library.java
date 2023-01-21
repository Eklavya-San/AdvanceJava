package tester;

import java.util.List;
import java.util.Scanner;

import DAL.BookDALImplimentation;
import pojo.Book;
import utils.DButils;

public class Library {

	public static void main(String[] args) {
		try {
			DButils.OpenConnection();
			BookDALImplimentation bookDal = new BookDALImplimentation();
			boolean exit = false;
			System.out.println("Welcomne");
			Scanner sc = new Scanner (System.in);
			while (!exit) {
				System.out.println("\n===================\n1.Show all Books\n"
						+ "2.Add New Book\n"
						+ "3.Update Book Data\n"
						+ "4.Delete Book\n"
						+ "5.Exit\n===================\n");
				
				switch(sc.nextInt()) {
				case 1:
					List <Book> list = bookDal.getAllBooks();
					list.forEach(e->System.out.println(e));
					break;
				case 2:
					System.out.println("Enter Book id ");
					int id = sc.nextInt();
					System.out.println("Enter book name");
					String name = sc.next();
					System.out.println("Enter author name");
					String author = sc.next();
					
					Book newBook = new Book(id,name,author);
					
					int i = bookDal.addBook(newBook);
					if(i>0) {
						System.out.println("Added successfully");
					}else {
						System.out.println("Failed");
					}
					
					break;
				case 3:
					System.out.println("Enter Book id ");
				 id = sc.nextInt();
					System.out.println("Enter book name");
					name = sc.next();
					System.out.println("Enter author name");
					 author = sc.next();
					
					newBook = new Book(id,name,author);
					
					 i = bookDal.updateBook(newBook);
					 if(i>0) {
							System.out.println("Updated successfully");
						}else {
							System.out.println("Failed");
						}
					break;
				case 4:
						System.out.println("Enter book id ");
						id = sc.nextInt();
						i =bookDal.deleteBook(id);
						 if(i>0) {
								System.out.println("Deleted successfully");
							}else {
								System.out.println("Failed");
							}
				case 5:
					exit=true;
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
