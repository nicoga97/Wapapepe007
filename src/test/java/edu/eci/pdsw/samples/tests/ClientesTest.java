/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.tests;

import edu.eci.pdsw.samples.entities.Cliente;
import edu.eci.pdsw.samples.entities.ItemRentado;
import edu.eci.pdsw.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.pdsw.samples.services.ServiciosAlquilerItemsStub;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

  /**
 * 
 *registrar cliente:
 * 
 * Frontera:
 * CF1: Clientes que ya estan registrados o no
 * 
 * Clases de equivalencia:
 * CE1: todos los clientes que no estan registrados.Resultado esperado: se agregue el cliente correctamente
 * CE2: todos los clientes que estan registrados. Resultado esperado: no agregue el cliente y lance una excepcion
 * 
 */
public class ClientesTest {
    
  

    public ClientesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
      
  
    @Test
    public void testCE2() {
        Cliente c = new Cliente("Nicolas", 123456, "12344", "calle 6", "prueba@gmail.com", false, new ArrayList<ItemRentado>() );
    	ServiciosAlquilerItemsStub a= new ServiciosAlquilerItemsStub();
        
        try{
            a.registrarCliente(c);
            a.registrarCliente(c);
            assertTrue(false);
        }catch(ExcepcionServiciosAlquiler e){
            assertTrue(true);
        }
        
    }
    
    
    
    
    
    
    
}
