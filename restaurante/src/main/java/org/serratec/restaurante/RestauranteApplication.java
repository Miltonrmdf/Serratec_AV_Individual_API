package org.serratec.restaurante;

	//Importa a anotação que facilita a configuração da aplicação Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

	//Anotação que indica que esta classe é uma aplicação Spring Boot
@SpringBootApplication
public class RestauranteApplication {

	public static void main(String[] args) {
			// Inicia a aplicação Spring, passando a própria classe e os argumentos
		SpringApplication.run(RestauranteApplication.class, args);
	}

}
