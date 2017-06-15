package fpt.test.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fpt.test.bean.Book;

public class BookDAO {
 
	 public static List<Book> queryBook(Connection con) throws SQLException {
	      String sql = "Select a.idbooks, a.bookname, a.company,a.page from books a ";
	 
	      PreparedStatement ps = con.prepareStatement(sql);
	 
	      ResultSet rs = ps.executeQuery();
	      List<Book> list = new ArrayList<Book>();
	      while (rs.next()) {
	          int id = rs.getInt("idbooks");
	          String bookname = rs.getString("bookname");
	          String company = rs.getString("company");
	          int book_page=rs.getInt("page");
	          Book book = new Book();
	          book.setId(id);
	          book.setBook_name(bookname);
	          book.setCompany(company);
	          book.setBook_page(book_page);
	          list.add(book);
	      }
	      return list;
	  }
	
	
}
