package br.com.fiap.carros.carro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Carro {

    @Id
    UUID id;

    @NotBlank
    String maker;

    @NotBlank
    String model;

    @NotBlank
    Integer year;

    @NotBlank
    double price;
}
