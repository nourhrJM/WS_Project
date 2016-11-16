package com.rtb.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rtb.projet.bean.User;
import com.rtb.projet.services.IServiceListeUtilisateur;

@Controller
@RequestMapping(value="/afficherListeCourses")
public class AfficherListeUtilisateurController {

	@Autowired
    private IServiceListeUtilisateur service;

	   @RequestMapping(method = RequestMethod.GET)
	    public String afficher(ModelMap pModel) {
	        final List<User> lListeUser = service.ListerUtilisateur();
	        pModel.addAttribute("ListeUser", lListeUser);
	        return "listeUser";

}
}