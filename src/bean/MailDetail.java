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
public class MailDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Mail mail;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date dateConsultation;   
    @ManyToOne
    private User destinataire;

    public MailDetail() {
    }

    public MailDetail(Long id) {
        this.id = id;
    }

    public MailDetail(Long id, Mail mail, Date dateConsultation, User destinataire) {
        this.id = id;
        this.mail = mail;
        this.dateConsultation = dateConsultation;
        this.destinataire = destinataire;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public User getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(User destinataire) {
        this.destinataire = destinataire;
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
        if (!(object instanceof MailDetail)) {
            return false;
        }
        MailDetail other = (MailDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MailDetail{" + "id=" + id + ", mail=" + mail + ", dateConsultation=" + dateConsultation + ", destinataire=" + destinataire + '}';
    }

   
    
}
