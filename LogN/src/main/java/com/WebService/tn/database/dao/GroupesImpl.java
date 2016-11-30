package com.WebService.tn.database.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.WebService.tn.database.dao.GroupesDao;
import com.WebService.tn.database.model.Groupes;



@Repository
@Transactional
public class GroupesImpl implements GroupesDao{
	
	@Autowired
	SessionFactory session;
	
	 public boolean saveOrUpdate(Groupes groupes) {
	        // TODO Auto-generated method stub
	        session.getCurrentSession().saveOrUpdate(groupes);
	        return true;
	    }
	 
	 public List<Groupes> list() {
	        return session.getCurrentSession().createQuery("from Groupes").list();
	    }
	 
	    public boolean delete(Groupes groupes) {
	        try {
	            session.getCurrentSession().delete(groupes);
	        } catch (Exception ex) {
	            return false;
	        }
	 
	        return true;
	    }

}
