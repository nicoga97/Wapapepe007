/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.managedbeans;

import edu.eci.pdsw.samples.entities.Cliente;
import edu.eci.pdsw.samples.entities.ItemRentado;
import edu.eci.pdsw.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.pdsw.samples.services.ServiciosAlquiler;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 2106913
 */
@ManagedBean(name = "AlquilerItems")
@SessionScoped
public class AlquilerItemsBean implements Serializable {
    
    private String nom;
    private String em;
    
    
    private String doc;
    
    private String tel;
    private String dir;
    

    ServiciosAlquiler sp = ServiciosAlquiler.getInstance();
    Cliente clienteSeleccionado;

    public Cliente getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public ServiciosAlquiler getSp() {
        return sp;
    }

    public void setSp(ServiciosAlquiler sp) {
        this.sp = sp;
    }

    
    

    public void setClienteSeleccionado(Cliente clienteSeleccionado) {
        this.clienteSeleccionado = clienteSeleccionado;
    }

    
    public AlquilerItemsBean() {
    }
    public void buttonListener() throws ExcepcionServiciosAlquiler{
        sp.registrarCliente(new Cliente(nom,Integer.parseInt(doc),tel,dir,em));
        nom="";
        doc="";
        tel="";
        dir="";
        em="";
        
    }
     public String  buttonListener1() throws ExcepcionServiciosAlquiler{
        if(clienteSeleccionado!=null){
        return "RegistroClienteltem";
        }
       
        
    

}
