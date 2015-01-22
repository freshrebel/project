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
public class Nummer implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titel;
    private String artiest;
    private int minuten;
    private int seconden;
    private int bpm;
    private String genres;
    private String labels;
    private Cd cd;

    public Nummer()
    {
    }

    public Nummer(String titel, String artiest, int minuten, int seconden, int bpm, String genres, String labels, Cd cd)
    {
        this.titel = titel;
        this.artiest = artiest;
        this.minuten = minuten;
        this.seconden = seconden;
        this.bpm = bpm;
        this.genres = genres;
        this.labels = labels;
        this.cd = cd;
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
        if (!(object instanceof Nummer))
        {
            return false;
        }
        Nummer other = (Nummer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return titel;
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
     * @return the minuten
     */
    public int getMinuten()
    {
        return minuten;
    }

    /**
     * @param minuten the minuten to set
     */
    public void setMinuten(int minuten)
    {
        this.minuten = minuten;
    }

    /**
     * @return the seconden
     */
    public int getSeconden()
    {
        return seconden;
    }

    /**
     * @param seconden the seconden to set
     */
    public void setSeconden(int seconden)
    {
        this.seconden = seconden;
    }

    /**
     * @return the bpm
     */
    public int getBpm()
    {
        return bpm;
    }

    /**
     * @param bpm the bpm to set
     */
    public void setBpm(int bpm)
    {
        this.bpm = bpm;
    }

    /**
     * @return the genres
     */
    public String getGenres()
    {
        return genres;
    }

    /**
     * @param genres the genres to set
     */
    public void setGenres(String genres)
    {
        this.genres = genres;
    }

    /**
     * @return the labels
     */
    public String getLabels()
    {
        return labels;
    }

    /**
     * @param labels the labels to set
     */
    public void setLabels(String labels)
    {
        this.labels = labels;
    }

    /**
     * @return the cd
     */
    public Cd getCd()
    {
        return cd;
    }

    /**
     * @param cd the cd to set
     */
    public void setCd(Cd cd)
    {
        this.cd = cd;
    }
    
}
