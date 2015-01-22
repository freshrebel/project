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
public class Doos implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int nummer;
    private String commentaar;

    public Doos()
    {
    }

    public Doos(String commentaar, int nummer)
    {
        this.commentaar = commentaar;
        this.nummer = nummer;
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
        if (!(object instanceof Doos))
        {
            return false;
        }
        Doos other = (Doos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Doos " + nummer;
    }

    /**
     * @return the commentaar
     */
    public String getCommentaar()
    {
        return commentaar;
    }

    /**
     * @param commentaar the commentaar to set
     */
    public void setCommentaar(String commentaar)
    {
        this.commentaar = commentaar;
    }

    /**
     * @return the nummer
     */
    public int getNummer()
    {
        return nummer;
    }

    /**
     * @param nummer the nummer to set
     */
    public void setNummer(int nummer)
    {
        this.nummer = nummer;
    }
    
}
