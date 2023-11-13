public class SistemaEstudiantesApp {

    public static void main(String[] args) {
        var salir = false; //recuerden esto ya lo hicimos antes
        var consola = new Scanner(System.in); //Para leer información de la consola
        //Se crea una instancia de la clase servicio, esto lo hacemos fuera del ciclo
        var estudianteDAO = new EstudianteDAO(); //Esta instancia debe hacerse una vez
        while (!salir) {
            try {
                mostrarMenu();//Mostramos el menu
                //Este será el método ejecutarOpciones que devolverá un booleano
                salir = ejecutarOpciones(consola, estudianteDAO); //Este arroja una excepción si ocurre algún error
            } catch (Exception e) {
                System.out.println("Ocurrió un error al ejecutar la operación: " + e.getMessage());
            }
        }
    }
