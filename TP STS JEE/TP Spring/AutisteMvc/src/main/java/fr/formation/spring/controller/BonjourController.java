package fr.formation.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Bonjour/{info}")

//@RequestMapping("/Bonjour")

public class BonjourController {
	@RequestMapping(method = RequestMethod.GET)
	/*public String afficheBonjour(final ModelMap pModel){
		pModel.addAttribute("info","vive Mirela");*/
	
/*	public String afficheBonjour(final ModelMap pModel, @RequestParam(value="prenom") final String prenom, @RequestParam(value="nom") final String nom){
		pModel.addAttribute("prenom",prenom);
		pModel.addAttribute("nom",nom);
		return "Bonjour";
		
	}
	*/
	public String afficheBonjour(final ModelMap pModel, @PathVariable(value="info") final String prenom){
		pModel.addAttribute("info","vive Mirela");

		return "Bonjour";
		
	}

}
