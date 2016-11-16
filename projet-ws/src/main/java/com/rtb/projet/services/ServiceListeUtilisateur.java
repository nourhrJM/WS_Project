package com.rtb.projet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtb.projet.bean.User;
import com.rtb.projet.dao.IListeUtilisateurDAO;

@Service
public class ServiceListeUtilisateur implements IServiceListeUtilisateur {

	  @Autowired
	    private IListeUtilisateurDAO dao;
	 
	  @Transactional(readOnly=true)
	public List<User> ListerUtilisateur() {
		
		return dao.ListerUtilisateur();
	}

}
