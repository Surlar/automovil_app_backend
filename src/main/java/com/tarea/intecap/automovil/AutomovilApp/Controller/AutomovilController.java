package com.tarea.intecap.automovil.AutomovilApp.Controller;

import com.tarea.intecap.automovil.AutomovilApp.Models.Automovil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class AutomovilController {

    @GetMapping("/automovil")


    public List<Automovil> getAllAutos(){
        Automovil toyota = new Automovil(1, "Toyota", "Yaris", "Negro", "P-0001", 150000);
        Automovil honda = new Automovil(2, "Honda", "Civic", "Blanco", "P-0002", 120000);
        Automovil hyundai = new Automovil(3, "Hyundai", "Veloster", "Gris", "P-0003", 130000);
        Automovil changan = new Automovil(4, "Changan", "Alsvin", "Rojo", "P-0004", 180000);
        Automovil nissan = new Automovil(5, "Nissan", "Sentra", "Naranja", "P-0005", 100000);

        return List.of(toyota, honda, hyundai, changan, nissan);
    }

}
