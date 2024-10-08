package com.ims.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "sales")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double saleAmount;
    private Integer soldQuantity;
    @ManyToOne
    private ProductEntity product;
    @ManyToOne
    private UserEntity merchant;
    private String buyerName;
    private String buyerAddress;
    private String buyerPhone;
    private String buyerEmail;
    private Long invoiceId;
    private LocalDateTime createdAt;
}
