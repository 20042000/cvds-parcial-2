package edu.eci.cvds.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Book;
import edu.eci.cvds.entities.Review;

public interface BookDAO {

	public List<Book> buscarTodos() throws PersistenceException;

	public void guardar(Book p) throws PersistenceException;

	public void actualizar(Book p) throws PersistenceException;

	public Book buscar(int liborId) throws PersistenceException;

	public List<Book> buscarPorAutor(int authorId) throws PersistenceException;
	
}
