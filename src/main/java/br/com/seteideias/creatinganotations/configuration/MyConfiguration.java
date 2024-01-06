package br.com.seteideias.creatinganotations.configuration;

import br.com.seteideias.creatinganotations.anotations.Development;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MyConfiguration {

    @Bean
    public CommandLineRunner cmdRunner() {
        return args -> System.out.println("Carregou o bean no development");
    }

}
