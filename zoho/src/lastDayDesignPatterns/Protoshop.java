package lastDayDesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class Protoshop{
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
	
		bookShop bs  = new bookShop();
		bs.LoadData();
		System.out.println();
		
		bookShop b2 =bs.clone();
		b2.getBook().remove(0);
		b2.getBook().get(1).setName("ff");
		System.out.println(b2.getBook());
		System.out.println(bs.getBook());
	}
	
}


class book{
	
	private String name;
	private int bookNum;
	
	
	public book(String name, int i) {
		
		this.name = name;
		bookNum = i;
	}

	
	public String getName() {
		return name;
	}


	public int getBookNum() {
		return bookNum;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}


	@Override
	public String toString() {
		return "book [name=" + name + ", bookNum=" + bookNum + "]";
	}
	
	
	
	
}
class bookShop implements Cloneable{
	
	
	private List<book> bookList;
	
	public bookShop()
	{
		bookList = new ArrayList<>();
	}
	
	public void LoadData() {
		
		for(int i=0;i<10;i++)
		{
			book b = new book("fairy tale",i);
			bookList.add(b);
		}
		
	}
	
	public List<book> getBook() {
	
		return bookList;
	}
	
	public bookShop clone() throws CloneNotSupportedException  {
		
		
		bookShop bst = new bookShop();
		

		 for(book b:this.getBook())
		 {
		 	bst.bookList.add(b);
		 }
		 return  bst;
		
	}
	
	
	
	
}