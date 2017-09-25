package com.MedicalStoreBackend.hibernateConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.MedicalStoreBackend.DaoImpl.UserDaoImpl;
import com.MedicalStoreBackend.model.*;

@Configuration
@EnableTransactionManagement
@ComponentScan("com")

public class hiberConfig
{
	@Autowired
	@Bean(name="datasource")
	public DataSource getH2()
	{
		System.out.println("Hibernate initialized");
		DriverManagerDataSource dt= new DriverManagerDataSource();
		dt.setDriverClassName("org.h2.Driver");
		dt.setUrl("jdbc:h2:tcp://localhost/~/test");
		dt.setUsername("sa");
		dt.setPassword("");
		System.out.println("connection established");
		return dt;
		
	}
	private Properties getHiberProps()
	{
		Properties p=new Properties();
		p.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		p.put("hibernate.show_sql","true");
		p.put("hibernate.hbm2ddl.auto", "update");
		return p;
		}
	
	@Autowired
	@Bean(name="UserDaoImpl")
	public UserDaoImpl getUserData(SessionFactory sessionFac)
	{
		return new UserDaoImpl(sessionFac);
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSession(DataSource datasource)
	{
		LocalSessionFactoryBuilder lsfb=new LocalSessionFactoryBuilder(datasource);
		
		lsfb.addProperties(getHiberProps());
		lsfb.addAnnotatedClass(User.class);
		return lsfb.buildSessionFactory();
		
	}
	
	@Autowired
	@Bean(name="TransactionManager")
	public HibernateTransactionManager getTransaction(SessionFactory SessionFactory)
	{
		HibernateTransactionManager tm=new HibernateTransactionManager(SessionFactory);
		
		return tm;
	}
	

}
