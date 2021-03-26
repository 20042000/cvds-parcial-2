package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import edu.eci.cvds.entities.Book;
import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Review;

public interface BookMapper {

	List<Book> getByAuthor(@Param("author") int authorId);

}
