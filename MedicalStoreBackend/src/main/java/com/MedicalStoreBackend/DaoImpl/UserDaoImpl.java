package com.MedicalStoreBackend.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MedicalStoreBackend.Dao.UserDao;
import com.MedicalStoreBackend.model.User;

@Repository

public class UserDaoImpl implements UserDao
{
	@Autowired
	public UserDaoImpl(SessionFactory sessionFac)
	{
		
	super();
	this.sessionFac= sessionFac;

}
@Autowired
SessionFactory sessionFac;

public void insertUser(User user)
{
	Session session=sessionFac.openSession();
	session.beginTransaction();
	session.persist(user);
	session.getTransaction().commit();
	
}
}


