package br.com.fiap.carros.carro;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class CarroController {

    private final CarroService carroService;

    public CarroController(CarroService carroService){ this.carroService = carroService;}

    @GetMapping
    public String index(Model model){
        var carros = carroService.findAll();
        model.addAttribute("carros", carros);
        return "index";
    }
}
