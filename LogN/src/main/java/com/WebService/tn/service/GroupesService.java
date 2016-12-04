package com.WebService.tn.service;

import java.util.List;

import com.WebService.tn.database.model.Groupes;

public interface GroupesService {
	 public boolean saveOrUpdate(Groupes groupes);
	   
	    public List<Groupes> list();
	 
	    public boolean delete(Groupes groupes);
}
