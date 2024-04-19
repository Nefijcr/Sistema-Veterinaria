/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Entidad.Clientes;
import Entidad.Mascotas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nefij
 */
public class Eliminar {
    public void eliminarCliente(int rowIndex, String dni) {
    // Leer todos los clientes desde el archivo
    List<Clientes> clientes = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("clientes.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            if (datos.length >= 5) {
                Clientes cliente = new Clientes(datos[0], datos[1], datos[2], datos[3], datos[4]);
                clientes.add(cliente);
            } else {
                System.out.println("Error: línea inválida en el archivo clientes.txt");
            }
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo clientes.txt: " + e.getMessage());
    }

    // Eliminar el cliente de la lista
    clientes.remove(rowIndex);

    // Escribir todos los clientes de nuevo en el archivo
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("clientes.txt"))) {
        for (Clientes c : clientes) {
            writer.write(c.getNombre() + "," + c.getCelular() + "," + c.getEdad() + "," + c.getDireccion() + "," + c.getDni() + "\n");
        }
    } catch (IOException e) {
        System.out.println("Error al escribir en el archivo clientes.txt: " + e.getMessage());
    }
} 
   public void eliminarMascota(int rowIndex, String dniCliente) {
        // Leer todas las mascotas desde el archivo
        List<Mascotas> mascotas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("mascotas.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 5) { // Se ajusta la verificación a 5 elementos debido a la adición del sexo
                    Mascotas mascota = new Mascotas(datos[0], datos[1], datos[2], datos[3], datos[4]);
                    mascotas.add(mascota);
                } else {
                    System.out.println("Error: línea inválida en el archivo mascotas.txt");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo mascotas.txt: " + e.getMessage());
        }

        // Eliminar la mascota de la lista
        mascotas.remove(rowIndex);

        // Escribir todas las mascotas de nuevo en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mascotas.txt"))) {
            for (Mascotas m : mascotas) {
                writer.write(m.getDniCliente() + "," + m.getNombre() + "," + m.getEdad() + "," + m.getEstado() + "," + m.getSexo() + "\n"); // Se añade el sexo al escribir en el archivo
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo mascotas.txt: " + e.getMessage());
        }
    }
  
}
