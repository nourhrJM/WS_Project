package com.WebService.tn.database.dao;
import java.util.List;

import com.WebService.tn.database.model.Groupes;


public interface GroupesDao {
	
	 public boolean saveOrUpdate(Groupes groupes);
	 
	    public List<Groupes> list();
	 
	    public boolean delete(Groupes groupes);

}
