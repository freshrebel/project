/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Arno
 */
@Entity
public class Cd implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titel;
    private String artiest;
    private Doos doos;

    public Cd()
    {
    }

    public Cd(String titel, String artiest, Doos doos)
    {
        this.titel = titel;
        this.artiest = artiest;
        this.doos = doos;
    }
    
    

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cd))
        {
            return false;
        }
        Cd other = (Cd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "DAL.Cd[ id=" + id + " ]";
    }

    /**
     * @return the titel
     */
    public String getTitel()
    {
        return titel;
    }

    /**
     * @param titel the titel to set
     */
    public void setTitel(String titel)
    {
        this.titel = titel;
    }

    /**
     * @return the artiest
     */
    public String getArtiest()
    {
        return artiest;
    }

    /**
     * @param artiest the artiest to set
     */
    public void setArtiest(String artiest)
    {
        this.artiest = artiest;
    }

    /**
     * @return the doos
     */
    public Doos getDoos()
    {
        return doos;
    }

    /**
     * @param doos the doos to set
     */
    public void setDoos(Doos doos)
    {
        this.doos = doos;
    }
    
}
