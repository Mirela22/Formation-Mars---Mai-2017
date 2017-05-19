
package fr.formation.jsf.personn;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="profileBean")
@SessionScoped
public class ProfilBean {
       
    private String theme;
    private String header;
    
       
   @PostConstruct
    public void init(){
         theme="dark";
         header="yes";
    }

    public String getTheme() {
        return theme;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    
    
}
