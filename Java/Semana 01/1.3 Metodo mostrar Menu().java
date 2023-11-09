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
