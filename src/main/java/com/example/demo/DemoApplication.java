package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

   /* @Bean
    protected CommandLineRunner init(final AgentRepository agentRepository) {

        return args -> {
            Agent agent = new Agent();
            agent.setUsername("admin");
            user.setPassword("admin");
            user.setName("Administrator");
            user.setEmail("admin@javahelps.com");
            userRepository.save(user);

        };
    }*/

}
