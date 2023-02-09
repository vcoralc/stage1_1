package com.practicas.stage1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

@AllArgsConstructor

public class Catalogo {
    private Long id;
    private String name;
    private String date;
    private Integer numArchivesInside;

}
