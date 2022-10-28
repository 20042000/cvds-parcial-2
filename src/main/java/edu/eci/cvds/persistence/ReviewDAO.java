package edu.eci.cvds.persistence;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Review;

public interface ReviewDAO {
	
	public Review buscarResena(short rating)throws PersistenceException;

}
