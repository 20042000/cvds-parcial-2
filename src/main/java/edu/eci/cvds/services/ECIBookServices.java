package edu.eci.cvds.services;

import java.util.List;

import edu.eci.cvds.entities.Author;
import edu.eci.cvds.entities.Book;
import edu.eci.cvds.entities.Review;
import edu.eci.cvds.persistence.PersistenceException;

public interface ECIBookServices {

	/**
	 * Consultar todas las decanaturas
	 * 
	 * @return la lista de decanaturas
	 * @throws ServicesException
	 */
	public List<Author> listarAutores() throws ServicesException;

	/**
	 * Consultar una decanatura por id
	 * 
	 * @param autorId el id de la decanatura
	 * @return la decanatura encontrada
	 * @throws ServicesException
	 */
	public Author buscarAutor(int autorId) throws ServicesException;

	/**
	 * Consultar todos los programas
	 * 
	 * @return la lista de programas
	 * @throws ServicesException
	 */
	public List<Book> listarLibros() throws ServicesException;

	/**
	 * Consultar todos los programas a partir de un id de decanatura
	 * 
	 * @param autorId el id de la decanatura
	 * @return la lista de programas
	 * @throws ServicesException
	 */
	public List<Book> buscarPorAutor(int autorId) throws ServicesException;

	/**
	 * Consultar todas las materias a partir de un id de programa
	 * 
	 * @param libroId el id del programa
	 * @return la lista de materias
	 * @throws ServicesException
	 */
	public List<Review> buscarResenaPorLibro(int libroId) throws ServicesException;

	/**
	 * Consultar todas las materias por una "búsqueda de similares" basado en el
	 * nombre de la materia.
	 *
	 * @param calificacion la palabra clave a coincidir con el nombre de la
	 *            materia
	 * @return la lista de materias que coinciden
	 * @throws ServicesException
	 */
	public List<Book> buscarLibrosPorCalificacion(int calificacion) throws ServicesException;

	/**
	 * Crear una materia
	 * 
	 * @param review
	 * 
	 * @throws ServicesException
	 */
	public void crearResena(Review review) throws ServicesException;

	/**
	 * Eliminar una materia por su mnemónico
	 * 
	 * @param resena el mnemónico de la materia a eliminar
	 * @throws ServicesException
	 */
	public void eliminarResena(int resena) throws ServicesException;

	/**
	 * Consultar un programa por el id
	 * 
	 * @param libroId el id del programa
	 * @return el programa
	 * @throws ServicesException
	 */
	public Book buscarLibro(int libroId) throws ServicesException;
	
	public void guardar(Book p) throws ServicesException;
	
	public Review buscarResena(short rating)throws ServicesException;

}
