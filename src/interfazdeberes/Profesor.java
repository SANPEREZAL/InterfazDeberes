/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazdeberes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    @Override
    public void guardar() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("profesor.txt"))) {
            oos.writeObject(this);
            System.out.println("Profesor guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar profesor: " + e.getMessage());
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Asignatura: " + asignatura);
    }
}