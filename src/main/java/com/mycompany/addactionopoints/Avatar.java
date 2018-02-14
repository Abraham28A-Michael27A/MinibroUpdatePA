/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.addactionopoints;

import org.bson.types.ObjectId;

/**
 *
 * @author user
 */


public class Avatar {
    ObjectId id;
    String nom;
    String user;
    String gout;
    String caractere;
    String message;
    String requete;
    Double humeur;
    Double attention;
    Double pa;
    Double img;

    
    public Avatar (){};
    public Avatar (ObjectId i, String n, String iu, String ig, String ic, String im, String ir, Double hu, Double att, Double p,double img) throws Exception{
	setId(i);
	setNom(n);
	setUser(iu);
        setGout(ig);
        setCaractere(ic);
        setMessage(im);
        setRequete(ir);
        setHumeur(hu);
        setAttention(att);
        setPa(p);
        setImg(img);
        
    }
    
        public Double getImg() {
            return img;
        }

        public void setImg(Double img) {
            this.img = img;
        }
        
	public void setId( ObjectId i) throws Exception
	{
		id=i;
	}
	public ObjectId getId(){return id;}
	
	
	public void setNom( String eco) throws Exception 
	{
		nom=eco;
	}
	public String getNom(){return nom;}
	
	
	public void setUser( String ec) throws Exception 
	{
		user=ec;
	}
	public String getUser(){return user;}
        
        public void setGout( String mai) throws Exception 
	{
		gout=mai;
	}
	public String getGout(){return gout;}
        
        public void setCaractere( String ps) throws Exception 
	{
		caractere=ps;
	}
	public String getCaractere(){return caractere;}
        
        public void setMessage( String md) throws Exception 
	{
		message=md;
	}
	public String getMessage(){return message;}
        
        public void setRequete( String qq1) throws Exception
	{
		requete=qq1;
	}
	public String getRequete(){return requete;}
        
        
        public void setHumeur( Double qq2) throws Exception
	{
		humeur=qq2;
	}
	public Double getHumeur(){return humeur;}
        
        public void setAttention( Double rr1) throws Exception
	{
		attention=rr1;
	}
	public Double getAttention(){return attention;}
        
        public void setPa( Double rr2) throws Exception
	{
		pa=rr2;
	}
	public Double getPa(){return pa;}
    
}
