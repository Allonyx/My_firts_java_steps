/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author aleja
 */
public class Personas {
    private String tipo_dni;
    private String ndi;
    private String nom;
    
    private float pca;
    private float vp;
    private float via;
    private float vda;
    
     

    public Personas() {
    }

    public Personas(String tipo_dni, String ndi, float pca, String nom,  float vp) {
        this.tipo_dni = tipo_dni;
        this.ndi = ndi;
        this.nom = nom;
        this.pca = pca;
        this.vp = vp;
    }

    public Personas(String tipo_dni, String ndi, String nom, float via, float vda, float vp) {
        this.tipo_dni = tipo_dni;
        this.ndi = ndi;
        this.nom = nom;
        this.via = via;
        this.vda = vda;
        this.vp = vp;
        
    }

   
    

    public String getTipo_dni() {
        return tipo_dni;
    }

    public void setTipo_dni(String tipo_dni) {
        this.tipo_dni = tipo_dni;
    }
    
    

    public String getNdi() {
        return ndi;
    }

    public void setNdi(String ndi) {
        this.ndi = ndi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPca() {
        return pca;
    }

    public void setPca(float pca) {
        this.pca = pca;
    }

    public float getVp() {
        return vp;
    }

    public void setVp(float vp) {
        this.vp = vp;
    }

    public float getVia() {
        return via;
    }

    public void setVia(float via) {
        this.via = via;
    }

    public float getVda() {
        return vda;
    }

    public void setVda(float vda) {
        this.vda = vda;
    }
    
    

    
    
    
    
    
}











