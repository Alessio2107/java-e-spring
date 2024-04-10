package com.example.demo.model;

import java.util.List;

import com.example.demo.veterinarioEnum.VeterinarioEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Animale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String specie;

    @NonNull
    private String dieta;

    @NonNull
    private int eta;

    @NonNull
    private VeterinarioEnum famiglia;

    @JsonIgnore
    @OneToMany(mappedBy = "animale")
    private List<Visita> listaDiVisiteAllAnimale;
}
