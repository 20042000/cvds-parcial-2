/*
 * Copyright (C) 2016 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.cvds.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Book;
import edu.eci.cvds.entities.Review;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.BookDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.BookMapper;

/**
 * Implementación de {@link BookDAO}
 */
public class MyBatisBookDAO implements BookDAO {

	@Inject
	private BookMapper bookMapper;

	@Override
	public List<Book> buscarTodos() throws PersistenceException {
		return bookMapper.getBooks();
	}

	@Override
	public void guardar(Book p) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void actualizar(Book p) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Book buscar(int libroId) throws PersistenceException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public List<Book> buscarPorAutor(int autorId) throws PersistenceException {
		return bookMapper.getByAuthor(autorId);
	}
}
