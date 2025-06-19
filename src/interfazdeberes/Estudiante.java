/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazdeberes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public void guardar() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estudiante.txt"))) {
            oos.writeObject(this);
            System.out.println("Estudiante guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar estudiante: " + e.getMessage());
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Carrera: " + carrera);
    }
}