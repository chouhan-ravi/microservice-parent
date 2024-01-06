package com.techie.rk;

import com.techie.rk.model.Inventory;
import com.techie.rk.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return (args -> {
            inventoryRepository.save(Inventory.builder().skuCode("iphone_13").quantity(100).build());
            inventoryRepository.save(Inventory.builder().skuCode("iphone_13_red").quantity(0).build());
        });
    }

}