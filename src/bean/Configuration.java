/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Ismail Tobiss
 */
@Entity
public class Configuration implements Serializable {

 
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String extensionNonPermise;
    private float taillePieceJointe;
    private float tailleSommePieceJointe;
    @OneToMany(mappedBy = "configuration")
    private List<PieceJointe> pieceJointes;

    public Configuration() {
    }

    public Configuration(Long id) {
        this.id = id;
    }

    public Configuration(Long id, String extensionNonPermise, float taillePieceJointe, float tailleSommePieceJointe) {
        this.id = id;
        this.extensionNonPermise = extensionNonPermise;
        this.taillePieceJointe = taillePieceJointe;
        this.tailleSommePieceJointe = tailleSommePieceJointe;
    }

    public String getExtensionNonPermise() {
        return extensionNonPermise;
    }

    public void setExtensionNonPermise(String extensionNonPermise) {
        this.extensionNonPermise = extensionNonPermise;
    }

    public float getTaillePieceJointe() {
        return taillePieceJointe;
    }

    public void setTaillePieceJointe(float taillePieceJointe) {
        this.taillePieceJointe = taillePieceJointe;
    }

    public float getTailleSommePieceJointe() {
        return tailleSommePieceJointe;
    }

    public void setTailleSommePieceJointe(float tailleSommePieceJointe) {
        this.tailleSommePieceJointe = tailleSommePieceJointe;
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
        if (!(object instanceof Configuration)) {
            return false;
        }
        Configuration other = (Configuration) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Configuration{" + "id=" + id + ", extensionNonPermise=" + extensionNonPermise + ", taillePieceJointe=" + taillePieceJointe + ", tailleSommePieceJointe=" + tailleSommePieceJointe + '}';
    }

    
    
}
