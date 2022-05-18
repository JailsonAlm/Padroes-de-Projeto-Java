package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeing
 *
 * @author JailsonAlm
 */

@EnableWebMvc
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringJavaApplication.class, args);
	}

}
