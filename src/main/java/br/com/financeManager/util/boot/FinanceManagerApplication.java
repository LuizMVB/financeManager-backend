package br.com.financeManager.util.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "br.com.financeManager.dominio.entidades")
@ComponentScan({"br.com.financeManager"})
@EnableJpaRepositories(basePackages = "br.com.financeManager.dominio.dados")
@SpringBootApplication
public class FinanceManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(FinanceManagerApplication.class, args);
	}
}
