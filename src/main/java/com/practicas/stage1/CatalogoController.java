package com.practicas.stage1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class CatalogoController {

    @GetMapping
    public List<Catalogo> requestCatalogo(){
        return List.of(
                new Catalogo(1L,"Directorio1","09/02/2023",12),
                new Catalogo(2L,"Directorio2", "09/02/2023", 2)
        );
    }
}
