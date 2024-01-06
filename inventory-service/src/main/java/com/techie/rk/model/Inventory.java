package com.techie.rk.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "t_inventory")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String skuCode;
    private Integer quantity;
}
