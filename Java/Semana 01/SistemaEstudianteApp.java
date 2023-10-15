package UTN.presentaciones;

import UTN.conexion.Conexion;
import UTN.datos.EstudianteDAO;
import UTN.domino.Estudiante;

import java.util.Scanner;

public class SistemaEstudiantesApp{
    public static void main(String[] args) {
        var salir = flase; //recuerden esto ya lo hicimos antes
        var consola= new Scanner(System.in);//Para leer información de la consola
        //Se crea una instancia de la clase servicio, esto lo hacemos fuera del ciclo
        var estudianteDao =new EstudianteDAO()://Esta instancia debe hacerse una vez
        while(!salir){
            try{
                mostrarMenu();//Este será el método que devolverá un booleano
                salir = ejecutarOpciones(consola, estudianteDao);//Este arroja una exception
            } catch (Exception e){
                System.out.println("Ocurrióun error al ejecutar la operación: "+e.getMessage());
            }//Fin while
        }//Fin Main

        private static void mostrarMenu(){
            System.out.println("""
                   ******* Sistema de Estudiantes *******
                   1.Listar Estudiantes
                   2.Buscar Estudiantes
                   3.Agregar estudiante
                   4.Modificar Estudiante
                   5.Eliminar Estudiante
                   6.Salir
                   Elige una opción:
                   """);
        }
    }
    //Método para ejecutar las opciones, va a regresar un valor booleano, ya que es el que
    //puede modificar el valor de la varible salir, si es verdadero termina el ciclo while.
    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir =false;
        switch ((opcion) {
        case 1 -> { //Listar estudiantes
            System.out.println("Listado de Estudiantes...");
            //no muestra la información, solo recupera la info y regresa una lista
            var estudiantes = estudianteDAO.listarEstudiantes();//recibe el listado
            //vamos a iterar cada objecto de tipo estudiante
            estudiantes.forEach(System.out::println);//para imprimir la lista
        }//FDin caso 1
        case 2 -> {//Buscar estudiante por id
    
