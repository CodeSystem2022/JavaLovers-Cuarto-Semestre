package utn.tiendo_libros.servicio;

import utn.tiendo_libros.modelo.Libro;
import java.util.List;
public interface ILibroServicio {
    public List<Libro> listarLibros();
    public Libro buscarLibroPorId(Integer idLibro);
    public void eliminarLibro(Libro libro);
}
