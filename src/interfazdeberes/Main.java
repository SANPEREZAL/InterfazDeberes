/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazdeberes;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Santiago", 19, "Ingenieriaa Industrial");
        Profesor profesor = new Profesor("Nestor", 35, "POO. 2-4");

        estudiante.mostrar();
        estudiante.guardar();

        profesor.mostrar();
        profesor.guardar();
    }
}
