package com.pjonas.webapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Usuarios API",
				version = "1.0",
				description = "Exemplo de API com Swagger",
				termsOfService = "Termos de serviço",
				contact = @Contact(
						name = "Paulo Jonas",
						email = "pjonas@email.com"
				),
				license = @License(
						name = "pjonas",
						url = "http://www.linkedin.com/in/paulo-jonas"
				)
		)
)
public class MyFirstWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebApiApplication.class, args);
	}

}
