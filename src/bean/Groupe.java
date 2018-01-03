/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Ismail Tobiss
 */
@Entity
public class Groupe implements Serializable {

    

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomGroupe;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date datecréation;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date dateCloture;
    @ManyToOne
    private User createur;
    @OneToMany(mappedBy = "groupe")
    private List<GroupeElement> groupeElements;
    @OneToMany(mappedBy = "groupeAdmin")
    private List<User> admin;

    public Groupe() {
    }

    public Groupe(Long id) {
        this.id = id;
    }

    public Groupe(Long id, String nomGroupe, Date datecréation, Date dateCloture, User createur) {
        this.id = id;
        this.nomGroupe = nomGroupe;
        this.datecréation = datecréation;
        this.dateCloture = dateCloture;
        this.createur = createur;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public Date getDatecréation() {
        return datecréation;
    }

    public void setDatecréation(Date datecréation) {
        this.datecréation = datecréation;
    }

    public Date getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Date dateCloture) {
        this.dateCloture = dateCloture;
    }

    public User getCreateur() {
        return createur;
    }

    public void setCreateur(User createur) {
        this.createur = createur;
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
        if (!(object instanceof Groupe)) {
            return false;
        }
        Groupe other = (Groupe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Groupe{" + "id=" + id + ", nomGroupe=" + nomGroupe + ", datecr\u00e9ation=" + datecréation + ", dateCloture=" + dateCloture + ", createur=" + createur + '}';
    }

    
    
}
