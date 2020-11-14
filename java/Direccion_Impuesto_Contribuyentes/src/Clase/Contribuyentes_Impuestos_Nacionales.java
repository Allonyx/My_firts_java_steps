/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author juan david peñaranda
 */
public class Contribuyentes_Impuestos_Nacionales 
{
     private String nombre;
     private int tipo_contribuyente, cedula, pagos_credit_anuales,valor_patrimonio, nit, valor_ingresos_anuales, valor_desc_tributarios;

    public Contribuyentes_Impuestos_Nacionales(String nombre, int tipo_contribuyente, int cedula, int pagos_credit_anuales, int valor_patrimonio) {
        this.nombre = nombre;
        this.tipo_contribuyente = tipo_contribuyente;
        this.cedula = cedula;
        this.pagos_credit_anuales = pagos_credit_anuales;
        this.valor_patrimonio = valor_patrimonio;
    }

    public Contribuyentes_Impuestos_Nacionales(String nombre, int tipo_contribuyente, int valor_patrimonio, int nit, int valor_ingresos_anuales, int valor_desc_tributarios) {
        this.nombre = nombre;
        this.tipo_contribuyente = tipo_contribuyente;
        this.valor_patrimonio = valor_patrimonio;
        this.nit = nit;
        this.valor_ingresos_anuales = valor_ingresos_anuales;
        this.valor_desc_tributarios = valor_desc_tributarios;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo_contribuyente() {
        return tipo_contribuyente;
    }

    public void setTipo_contribuyente(int tipo_contribuyente) {
        this.tipo_contribuyente = tipo_contribuyente;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getPagos_credit_anuales() {
        return pagos_credit_anuales;
    }

    public void setPagos_credit_anuales(int pagos_credit_anuales) {
        this.pagos_credit_anuales = pagos_credit_anuales;
    }

    public int getValor_patrimonio() {
        return valor_patrimonio;
    }

    public void setValor_patrimonio(int valor_patrimonio) {
        this.valor_patrimonio = valor_patrimonio;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public int getValor_ingresos_anuales() {
        return valor_ingresos_anuales;
    }

    public void setValor_ingresos_anuales(int valor_ingresos_anuales) {
        this.valor_ingresos_anuales = valor_ingresos_anuales;
    }

    public int getValor_desc_tributarios() {
        return valor_desc_tributarios;
    }

    public void setValor_desc_tributarios(int valor_desc_tributarios) {
        this.valor_desc_tributarios = valor_desc_tributarios;
    }

    
    
    
    
}
