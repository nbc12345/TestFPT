package fpt.test.bean;

public class Book {

	   private int id;
	   private String book_name;
	   private String company;
	   private int book_page;
	   private String comment;
	 
	   public Book() {
	 
	   }
	 
	   public Book(int id, String book_name, int book_page,String company,String comment) {
	       this.id = id;
	       this.book_name = book_name;
	       this.book_page = book_page;
	       this.company=company;
	       this.comment=comment;
	       
	   }
	 
	   public int getId(){
		   return id;
	   }
	   
	   public void setId(int id){
		   this.id=id;
	   }
	   public String getBook_name(){
		   return book_name;
	   }
	   
	   public void setBook_name(String book_name){
		   this.book_name=book_name;
	   }
	   public int getBook_page(){
		   return book_page;
	   }
	   
	   public void setBook_page(int book_page){
		   this.book_page=book_page;
	   }
	   public String getCompany(){
		   return company;
	   }
	   
	   public void setCompany(String company){
		   this.company=company;
	   }
	   public String getComment(){
		   return comment;
	   }
	   public void setComment(String comment){
		   this.comment=comment;
	   }
}
	   
