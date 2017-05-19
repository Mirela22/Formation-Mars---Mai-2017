package fr.formation.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorController {
	
	//formulaire
	@RequestMapping(value="/index2" ,method = RequestMethod.GET)
	public String afficherprofilget(HttpServletRequest request){
        request.getSession();
        return "index2";
    }
	
	@RequestMapping(value="/index2",method = RequestMethod.POST)
	public String chooseColor(final ModelMap pModel, @RequestParam(value="theme") final String theme, HttpServletRequest request, @RequestParam(value="prenom") final String prenom, @RequestParam(value="nom") final String nom,  @RequestParam(value="entete") final String entete){
	
		pModel.addAttribute("prenom",prenom);
		pModel.addAttribute("nom",nom);
		request.getSession().setAttribute("prenom",prenom);
		request.getSession().setAttribute("nom",nom);
		request.getSession().setAttribute("theme",theme);
		pModel.addAttribute("entete",entete);
		return "Color";		
	}
	
	//Color = welcome
    @RequestMapping(value="/Color" ,method = RequestMethod.GET)
    public String afficherbonjour(final ModelMap pModel,HttpServletRequest request){
    request.getSession();
    return "Color";
    }
    
    //actu
    @RequestMapping(value="/actu",method = RequestMethod.GET)
    public String afficheractu(final ModelMap pModel,HttpServletRequest request){
        request.getSession();
        return "actu";
    }

	
/*	public String afficheBonjour(final ModelMap pModel, @RequestParam(value="prenom") final String prenom, @RequestParam(value="nom") final String nom){
		pModel.addAttribute("prenom",prenom);
		pModel.addAttribute("nom",nom);
		return "Color";
		
	}*/
	

}
