package edu.eci.cvds.services.client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import edu.eci.cvds.entities.Author;
import edu.eci.cvds.entities.Book;
import edu.eci.cvds.entities.Review;

import edu.eci.cvds.services.ServicesException;
import edu.eci.cvds.services.ECIBookServices;
import edu.eci.cvds.services.ECIBooksServicesFactory;


public class MainExample {
	public static void main(String args[])throws SQLException, ServicesException{
		ECIBookServices servicio = ECIBooksServicesFactory.getInstance().getECIBooksServicesTesting();
		servicio.guardar(new Book(2157762, "La ultima Carta", 20000, "Espanol", null,(short)0, null));
		System.out.println(servicio.buscarLibro(2157762));
		System.exit(0);
	}

}
