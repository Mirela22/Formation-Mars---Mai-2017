/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.formation.filtrelogin.beans;

 
import fr.formation.dbb.beans.PersonBean;
import fr.formation.dbb.beans.UserBean;
import fr.formation.fonctions.PersonConnectDBB;
import fr.formation.fonctions.UserConnectDBB;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
 
 
/**
 * Simple login bean.
 * 
 * @author itcuties
 */
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {
 
    private static long serialVersionUID = 7765876811740798583L;
    
    private String username;
    private String password;
     
    private boolean loggedIn;
      
    @ManagedProperty(value="#{navigationBean}")
    private NavigationBean navigationBean;
     

    public String doLogin() throws SQLException {
        List<PersonBean> ListPersons;
        ListPersons= PersonConnectDBB.getPersonn();

        List<UserBean> ListUsers;
        ListUsers= UserConnectDBB.getUser();        
        // Get every user from our database 
        for (PersonBean ListPerson : ListPersons) {
            String dbUsername = ListPerson.getNom();
            String dbPassword = ListPerson.getPassword();
            // Successful login
            if (dbUsername.equals(getUsername()) && dbPassword.equals(getPassword())) {
                setLoggedIn(true);
                return getNavigationBean().redirectToWelcome();
            } 
        } 
        
        for (UserBean ListUser : ListUsers) {
            String dbUsername = ListUser.getNom();
            String dbPassword = ListUser.getPassword();
            // Successful login
            if (dbUsername.equals(getUsername()) && dbPassword.equals(getPassword())) {
                setLoggedIn(true);
                return getNavigationBean().redirectToWelcome();
            } 
        } 
        

        // Set login ERROR
        FacesMessage msg = new FacesMessage("Login error!", "ERROR MSG");
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(null, msg);
         
        // To to login page
        return getNavigationBean().toLogin();
    }
    
    public String doLogout() {
        // Set the paremeter indicating that user is logged in to false
        setLoggedIn(false);
         
        // Set logout message
        FacesMessage msg = new FacesMessage("Logout success!", "INFO MSG");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, msg);
         
        return getNavigationBean().toLogin();
    }

   
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
  
    public NavigationBean getNavigationBean() {
        return navigationBean;
    }
    public void setNavigationBean(NavigationBean navigationBean) {
        this.navigationBean = navigationBean;
    }
 
}
