/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;

import edu.eci.pdsw.samples.services.ServiciosAlquilerItemsStub;

/**
 *
 * @author 2106913
 */
public class ItemRentado implements Serializable{
    
    private Item item;
    private Date fechainiciorenta;
    private Date fechafinrenta;
    private int multa;

    public ItemRentado(Item item, Date fechainiciorenta, Date fechafinrenta) {
              
        this.item = item;
        this.fechainiciorenta = fechainiciorenta;
        this.fechafinrenta = fechafinrenta;
    }

    public int getMulta() {
        Calendar fecha = new GregorianCalendar();
        LocalDate date = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Date fechaActual=new Date(fecha.get(Calendar.YEAR),fecha.get(Calendar.MONTH),fecha.get(Calendar.DAY_OF_MONTH));

        
        if(fechafinrenta.compareTo(fechaActual)>0){
        	multa=fechafinrenta.compareTo(fechaActual)*ServiciosAlquilerItemsStub.MULTA_DIARIA;
            return (int)item.getTarifaxDia()+multa;
        }else{
        return (int)item.getTarifaxDia();}
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }
    
    
    
    public ItemRentado() {
    }

    
    public Item getItem() {
        return item;
    }
    
    
    public void setItem(Item item) {
        this.item = item;
    }

    public Date getFechainiciorenta() {
        return fechainiciorenta;
    }

    public void setFechainiciorenta(Date fechainiciorenta) {
        this.fechainiciorenta = fechainiciorenta;
    }

    public Date getFechafinrenta() {
        return fechafinrenta;
    }

    public void setFechafinrenta(Date fechafinrenta) {
        this.fechafinrenta = fechafinrenta;
    }

   

}
