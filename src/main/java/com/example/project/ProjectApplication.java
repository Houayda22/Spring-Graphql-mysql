package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }
    
	@Bean
  public graphql.schema.GraphQLScalarType extendedScalarLong() {
    return graphql.scalars.ExtendedScalars.GraphQLLong;
    }
}
