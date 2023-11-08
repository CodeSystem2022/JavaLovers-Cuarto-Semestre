package utn.tiendo_libros;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.EventQueue;

@SpringBootApplication
class TiendoLibrosApplication {
	public static void main(String [] args) {SpringApplication.run (TiendoLibrosAplicacion )}
	    ConfigurableApplicationContext contextSpring = new SpringApplicationBuilder(TiendoLibrosApplicacion.class)
				        .headless(false)
				        .web(WebApplicacionType.NONE)
				        .run(arg);

	//Ejecutamos el código para cargar el formulario
	EventQueue.invokerLater(() ->{
		//Obtenemos el objeto from a través del spring
		LibroFrom libroFrom= contextoSpring.getBean(LibroFrom.class);
	});

	@Test
	void contextLoads() {
	}

}
