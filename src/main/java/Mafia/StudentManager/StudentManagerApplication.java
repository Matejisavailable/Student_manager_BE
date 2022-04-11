package Mafia.StudentManager;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@SpringBootApplication
public class StudentManagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagerApplication.class, args);
	}
	@Configuration
	@EnableWebMvc
	public class CorsConfig implements WebMvcConfigurer
	{
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedMethods("GET", "POST", "PUT", "DELETE");
		}
	}
}
