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
public class Mail implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String objectmail;
    private String message;
    
    @ManyToOne
    private User emmetteur;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date dateEnvoi;
    @OneToMany(mappedBy = "mail")
    private List<PieceJointe> pieceJointes;

    @OneToMany(mappedBy = "mail")
    private List<MailDetail> mailDetails;

    public Mail() {
    }

    public Mail(Long id) {
        this.id = id;
    }

    public Mail(Long id, String objectmail, String message, User emmetteur, Date dateEnvoi) {
        this.id = id;
        this.objectmail = objectmail;
        this.message = message;
        this.emmetteur = emmetteur;
        this.dateEnvoi = dateEnvoi;
    }

    public String getObjectmail() {
        return objectmail;
    }

    public void setObjectmail(String objectmail) {
        this.objectmail = objectmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getEmmetteur() {
        return emmetteur;
    }

    public void setEmmetteur(User emmetteur) {
        this.emmetteur = emmetteur;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
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
        if (!(object instanceof Mail)) {
            return false;
        }
        Mail other = (Mail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mail{" + "id=" + id + ", objectmail=" + objectmail + ", message=" + message + ", emmetteur=" + emmetteur + ", dateEnvoi=" + dateEnvoi + '}';
    }

    
    
}
