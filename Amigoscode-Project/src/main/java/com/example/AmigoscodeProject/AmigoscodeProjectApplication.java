package com.example.AmigoscodeProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmigoscodeProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigoscodeProjectApplication.class, args);
    }

    @GetMapping
    Customer getCustomer() {
        return new Customer(1L, "Bobby Young");
    }

    class Customer {
        private final Long id;
        private final String name;

        Customer(Long id, String name) {
            this.id = id;
            this.name = name;
        }


        // Can only generate getters because we set the fields to be final
        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
