/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Ismail Tobiss
 */
@Entity
public class GroupeElement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User user;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date dateDaffiliation;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date dateSortie;   
    @ManyToOne
    private Groupe groupe;

    public GroupeElement() {
    }

    public GroupeElement(Long id) {
        this.id = id;
    }

    public GroupeElement(Long id, User user, Date dateDaffiliation, Date dateSortie, Groupe groupe) {
        this.id = id;
        this.user = user;
        this.dateDaffiliation = dateDaffiliation;
        this.dateSortie = dateSortie;
        this.groupe = groupe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateDaffiliation() {
        return dateDaffiliation;
    }

    public void setDateDaffiliation(Date dateDaffiliation) {
        this.dateDaffiliation = dateDaffiliation;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
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
        if (!(object instanceof GroupeElement)) {
            return false;
        }
        GroupeElement other = (GroupeElement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GroupeElement{" + "id=" + id + ", user=" + user + ", dateDaffiliation=" + dateDaffiliation + ", dateSortie=" + dateSortie + ", groupe=" + groupe + '}';
    }

    
    
}
