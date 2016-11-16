package com.rtb.projet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rtb.projet.bean.User;


@Repository
public class ListeUtilisateurDAO implements IListeUtilisateurDAO{
	@PersistenceContext
    private EntityManager entityManager;

	public List<User> ListerUtilisateur() {
		
		
		
		
		
		final CriteriaBuilder lCriteriaBuilder = entityManager.getCriteriaBuilder();

        final CriteriaQuery<User> lCriteriaQuery = lCriteriaBuilder.createQuery(User.class);
        final Root<User> lRoot = lCriteriaQuery.from(User.class);
        lCriteriaQuery.select(lRoot);
        
        final TypedQuery<User> lTypedQuery = entityManager.createQuery(lCriteriaQuery);

        return lTypedQuery.getResultList();
	}

}
