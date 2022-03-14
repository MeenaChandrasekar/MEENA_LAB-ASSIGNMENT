

package b;

import java.awt.print.Book;

public class BookStore {
	private final int SIZE;
	public BookStore(String bookStoreName, int size) {
		SIZE=size;
		init();
	}
	//populate some books
	private void init() {
		//------------------------Initialized book store------------------------
		
//			books[0]=new Book("rich dad poor dad", "RK", "54545A12", 10);
//			books[1]=new Book("basic physics", "abc", "54595A12", 20);
//			books[2]=new Book("pointer in c", "YK", "94545A12", 8);
//			books[3]=new Book("head first core java", "food", "50545A12", 20);
//			books[4]=new Book("spring in action", "bar", "14545A12", 10);
	}



	//------------------------IMPLEMENT LOGIC to sell the books------------------------
	public void sell(String bookTitle, int noOfCopies) {
//		boolean found=false;
//		for(in i=0;i<SIZE; i++) {
//			if(	books[i].getBookTitle().equals(bookTitle)) {
//				
//				books[i].setNumOfCopies(books[i].getNumOfCopies()-noOfCopies);
//				found=true;
//			}
//		}
//		
//		if(found)
//			System.out.println("book sell is successful");
//		else
//			System.out.println("book is not found in store");
	}

	//------------------------IMPLEMENT LOGIC to order the books------------------------
	public void order(String bookTitle, int noOfCopies) {
//		boolean found=false;
//		for(into i=0;i<SIZE; i++) {
//			if(	books[i].getBookTitle().equals(bookTitle)) {
//				books[i].setNumOfCopies(books[i].getNumOfCopies()+noOfCopies);
//				found=true;
//			}
//		}
//		if(found)
//			System.out.println("book order is successful");
//		else
//			System.out.println("book order is not successful");
	}

	//------------------------IMPLEMENT LOGIC to display the books------------------------
	public void display() {
//		System.out.println("**********Book store *****************");
//		System.out.println(bookStoreName);
//		System.out.println("^^^^^^^^^^^^^^^Books details^^^^^^^^^^^^^^^^^^^^^^^^^");
//		for(Book book: books) {
//			book.display();
//		}
//		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//		
	}
}