/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.Leer;
import Entidad.Clientes;

import javax.swing.JOptionPane;

public class ClienteBuscar {
    public boolean buscarCliente(String dniBuscado) {
        Leer leer=new Leer();
        
    for (Clientes cliente : leer.leerClientes()) {
        if (cliente.getDni().equals(dniBuscado)) {
            return true;
        }
    }
    JOptionPane.showMessageDialog(null, "El cliente no existe.", "Alerta", JOptionPane.WARNING_MESSAGE);
    return false;  // Retorna null si no se encuentra el dueño con el dni proporcionado
}
public String buscarNombreCliente(String dniBuscado) {
    Leer leer =new Leer();
    for (Clientes cliente : leer.leerClientes()) {
        if (cliente.getDni().equals(dniBuscado)) {
            return cliente.getNombre();
        }
    }
    
    return null; 
}

}
