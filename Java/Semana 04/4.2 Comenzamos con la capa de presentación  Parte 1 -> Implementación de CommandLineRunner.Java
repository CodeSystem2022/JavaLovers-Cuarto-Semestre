package utn.estudiantes;

import org.springframewor.boot.SpringApplication;
import org.springframewor.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudianteApplication  implements  CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EstudianteApplication.class, args);

	}
	@Override
	public void  run(String... args) throws  Exception{
		
	}
}

