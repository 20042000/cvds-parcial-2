package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Book;
import edu.eci.cvds.entities.Review;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ReviewMapper;

public class MyBatisReviewDAO {
	
	@Inject
	private ReviewMapper reviewMapper;
	
	public Review buscarResena(short rating)throws PersistenceException {
		try{ 
			return reviewMapper.buscarResena(rating);
		}catch(org.apache.ibatis.exceptions.PersistenceException e){
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

}
