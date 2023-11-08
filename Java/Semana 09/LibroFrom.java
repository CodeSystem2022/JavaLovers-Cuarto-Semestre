package utn.tiendo_libros.vista;

import org.springframework.beans.factory.annotation.Autowired;
import utn.tiendo_libros.servicio.LibroServicio;

import javax.swing.*;
import java.awt.*;

public class LibroFrom extends JFrame{
    LibroServicio libroServicio;

    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarFrom();
        agregarButton.addActionListener(e -> agregarLibro());
    }
    private void iniciarFroma(){...}

    private void agregarLibro(){
        //Leer los valores del formulario
        if(libroTexto.getText().equals("")){
            mostrarMensaje("Ingresael nombre del libro");
        }
    }
    private createUIComponents() {
        this.tablaModeloLibros = newDefaultTableModel(0, 5);
        String[] cabecera = {"Id", "Libro", "Autor", "Precio", "Existencias"};
        this.tablaModeloLibros.SetColumnIdentifiers(cabecera);
        //Instanciar el objeto de JTable
        this.tablaLibres = new JTabla(tablaModeloLibros);
        listarLibros();
    }

    private void iniciarFrma(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900,800);
        //Para obtener les dimensiones de la ventana
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = toolkit.getScreenSize();
        int x = (tamanioPantalla.width - getWidth()/2);
        int y = (tamanioPantalla.height - getHeight()/2);
        setLcation(x , y);

    }
}
