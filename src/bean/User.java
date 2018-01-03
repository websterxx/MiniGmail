/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Ismail Tobiss
 */
@Entity
public class User implements Serializable {

    

    

    private static final long serialVersionUID = 1L;
   
    @Id
    private String login;
    private String nom;
    private String prénom;
    private String mdp;
    @ManyToOne
    private Groupe groupeAdmin;
    @OneToMany(mappedBy = "emmetteur")
    private List<Mail> mails;

    @OneToMany(mappedBy = "user")
    private List<GroupeElement> groupeElements;

    @OneToMany(mappedBy = "createur")
    private List<Groupe> groupes;

    public User() {
    }

    public User(String login) {
        this.login = login;
    }

    public User(String login, String nom, String prénom, String mdp, Groupe groupeAdmin) {
        this.login = login;
        this.nom = nom;
        this.prénom = prénom;
        this.mdp = mdp;
        this.groupeAdmin = groupeAdmin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Groupe getGroupeAdmin() {
        return groupeAdmin;
    }

    public void setGroupeAdmin(Groupe groupeAdmin) {
        this.groupeAdmin = groupeAdmin;
    }
    

     public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", nom=" + nom + ", pr\u00e9nom=" + prénom + ", mdp=" + mdp + ", groupeAdmin=" + groupeAdmin + '}';
    }

   

   
}
