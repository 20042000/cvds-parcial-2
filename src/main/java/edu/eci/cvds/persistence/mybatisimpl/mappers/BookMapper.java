package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import edu.eci.cvds.entities.Book;
import org.apache.ibatis.annotations.Param;


public interface BookMapper {

	List<Book> getByAuthor(@Param("author") int authorId);
	
	public List<Book> getBooks();

}
