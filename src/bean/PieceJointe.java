/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ismail Tobiss
 */
@Entity
public class PieceJointe implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String chemin;
    @ManyToOne
    private Configuration configuration;
    @ManyToOne
    private Mail mail;

    public PieceJointe() {
    }

    public PieceJointe(Long id) {
        this.id = id;
    }

    public PieceJointe(Long id, String chemin, Configuration configuration, Mail mail) {
        this.id = id;
        this.chemin = chemin;
        this.configuration = configuration;
        this.mail = mail;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PieceJointe)) {
            return false;
        }
        PieceJointe other = (PieceJointe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PieceJointe{" + "id=" + id + ", chemin=" + chemin + ", configuration=" + configuration + ", mail=" + mail + '}';
    }

    
    
}
