package com.Service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DAO.ResourceDAO;
import com.Entity.Resource;

@Service
public class ResourceServiceImpl implements ResourceService {

	// inject the resourceDAO
	@Autowired
	private ResourceDAO resourceDAO;

	@Override
	@Transactional
	public List<Resource> getResources() {
		return resourceDAO.getResource();
	}

}
