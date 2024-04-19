/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidad.Clientes;
import Entidad.Mascotas;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Guardar {
    public void registrarClientes(Clientes cliente) {
    String rutaArchivo = "clientes.txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
        // Escribir los datos en el archivo separados por comas
        writer.write(cliente.getNombre() + "," + cliente.getCelular() + "," + cliente.getEdad() + "," + cliente.getDireccion() + "," + cliente.getDni() + "\n");

        System.out.println("Registro guardado exitosamente en " + rutaArchivo);
    } catch (IOException e) {
        System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
    }
}
   public void registrarMascota(Mascotas mascota, String sexoSeleccionado) {
        String rutaArchivo = "mascotas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir los datos en el archivo separados por comas, incluyendo el sexo
            writer.write(mascota.getDniCliente() + "," + mascota.getNombre() + "," + mascota.getEdad() + "," + mascota.getCondicion() + "," + sexoSeleccionado + "\n");

            System.out.println("Registro guardado en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error en el archivo " + rutaArchivo);
        }
    }
   
   
}
