package edu.eci.cvds.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Book;
import edu.eci.cvds.entities.Review;

public interface ReviewMapper {
	
	public Review buscarResena(@Param("rating")short rating);

}
