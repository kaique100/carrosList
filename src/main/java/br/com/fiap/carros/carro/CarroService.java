package br.com.fiap.carros.carro;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository){ this.carroRepository = carroRepository;}

    public List<Carro>findAll(){return carroRepository.findAll();}
}
