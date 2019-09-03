package com.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.query.Query;
import com.Entity.Resource;

public class ResourceDAOImpl implements ResourceDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Resource> getResource() {
		
		//get the current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create a new query
		Query<Resource> query = currentSession.createQuery("from Resource order by resourceCode", Resource.class);
		
		//execute the query and get the result
		List<Resource> res = query.getResultList();
		
		return res;
	}

}
