package Datos;

import Entidad.Clientes;
import Entidad.Mascotas;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leer {
    public List<Clientes> leerClientes() {
        List<Clientes> listaCliente = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("clientes.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                
                // Verificar si hay suficientes elementos en el arreglo
                if (datos.length >= 5) {
                    Clientes cliente = new Clientes(datos[0], datos[1], datos[2], datos[3], datos[4]);
                    listaCliente.add(cliente);
                } else {
                    System.out.println("Error: línea inválida en el archivo clientes.txt");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo clientes.txt: " + e.getMessage());
        }

        return listaCliente;
    }

   public List<Mascotas> leerMascotas() {
    List<Mascotas> listaMascotasTemp = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("mascotas.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            
            // Verificar si hay suficientes elementos en el arreglo
            if (datos.length >= 4) {
                Mascotas mascota = new Mascotas(datos[0], datos[1], datos[2], datos[3]);
                listaMascotasTemp.add(mascota);
            } else {
                System.out.println("Error: línea inválida en el archivo mascotas.txt");
            }
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo mascotas.txt: " + e.getMessage());
    }

    return listaMascotasTemp;
}

}
