package edu.eci.cvds.services;

import com.google.inject.Injector; 
import edu.eci.cvds.persistence.AuthorDAO; 
import edu.eci.cvds.persistence.BookDAO; 
import edu.eci.cvds.persistence.mybatisimpl.MyBatisAuthorDAO; 
import edu.eci.cvds.persistence.mybatisimpl.MyBatisBookDAO;  
import edu.eci.cvds.services.impl.ECIBookServicesImpl; 
import org.apache.ibatis.transaction.TransactionFactory; 
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory; 
import org.mybatis.guice.XMLMyBatisModule; 
import java.util.Optional; 
import static com.google.inject.Guice.createInjector;

public class ECIBooksServicesFactory {
	private static ECIBooksServicesFactory instance = new ECIBooksServicesFactory(); 
	private static Optional<Injector> optInjector;
	
	private Injector myBatisInjector(String env, String pathResource) { 
		return createInjector(new XMLMyBatisModule() {
			@Override
			protected void initialize() { 
				setEnvironmentId(env);
				setClassPathResource(pathResource); 
				bind(AuthorDAO.class).to(MyBatisAuthorDAO.class);
				bind(BookDAO.class).to(MyBatisBookDAO.class);
			}
		});
	}
	
	private ECIBooksServicesFactory(){ 
		optInjector = Optional.empty();
	}
	
	public ECIBookServices getECIBooksServices(){ 
		if (!optInjector.isPresent()) {
			optInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
		}
		return optInjector.get().getInstance(ECIBookServices.class);
	}
	
	public ECIBookServices getECIBooksServicesTesting(){ 
		if (!optInjector.isPresent()) {
			optInjector = Optional.of(myBatisInjector("test","mybatis-config-h2.xml"));
		}
		return optInjector.get().getInstance(ECIBookServices.class);
	}
	
	public static ECIBooksServicesFactory getInstance(){ 
		return instance;
	}

}
