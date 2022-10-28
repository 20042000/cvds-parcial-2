package edu.eci.cvds.services.impl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Author;
import edu.eci.cvds.entities.Book;
import edu.eci.cvds.entities.Review;
import edu.eci.cvds.persistence.AuthorDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.BookDAO;
import edu.eci.cvds.services.ECIBookServices;
import edu.eci.cvds.services.ServicesException;

/**
 * Implementación de {@link ECIBookServices}
 */
public class ECIBookServicesImpl implements ECIBookServices {

	@Inject
	private AuthorDAO authorDAO;

	@Inject
	private BookDAO bookDAO;

	@Override
	public List<Author> listarAutores() throws ServicesException {
		try {
			return authorDAO.listarTodos();
		} catch (PersistenceException ex) {
			throw new ServicesException("Error listando decanaturas:" + ex.getLocalizedMessage(), ex);
		}
	}

	@Override
	public Author buscarAutor(int autorId) throws ServicesException {
		try {
			return authorDAO.buscarAutor(autorId);
		} catch (PersistenceException ex) {
			throw new ServicesException("Error buscando decanatura:" + ex.getLocalizedMessage(), ex);
		}
	}

	@Override
	public List<Book> listarLibros() throws ServicesException {
		try {
			return bookDAO.buscarTodos();
		} catch (PersistenceException e) {
			throw new ServicesException("Error en la consulta:" + e.getLocalizedMessage(), e);
		}
	
	}

	@Override
	public List<Book> buscarPorAutor(int autorId) throws ServicesException {
		try {
			return bookDAO.buscarPorAutor(autorId);
		} catch (PersistenceException ex) {
			throw new ServicesException("Error en la consulta:" + ex.getLocalizedMessage(), ex);
		}
	}

	@Override
	public List<Review> buscarResenaPorLibro(int libroId) throws ServicesException {
			throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public List<Book> buscarLibrosPorCalificacion(int calificacion) throws ServicesException {
		throw new UnsupportedOperationException("Not supported yetT.");
	}

	@Override
	public void crearResena(Review review) throws ServicesException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void eliminarResena(int resena) throws ServicesException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Book buscarLibro(int libroId) throws ServicesException {
		try {
			return bookDAO.buscar(libroId);
		} catch (PersistenceException ex) {
			throw new ServicesException("Error en la consulta:" + ex.getLocalizedMessage(), ex);
		}
	}
	
	@Override
	public void guardar(Book p) throws ServicesException{
		try { 
			bookDAO.guardar(p);
		} catch (PersistenceException ex) { 
			throw new ServicesException("Error al agregar el libro"+p,ex);
		}
		
	}
	
	@Override
	public Review buscarResena(short rating)throws ServicesException{
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
