package com.example.demo.model;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private Date dataDellaVisita;

    @NonNull
    private String descrizione;
    
    private boolean effettuata;
    
    @NonNull
    @ManyToOne
    @JoinColumn(name = "animale_id")
    private Animale animale;
    
    @NonNull
    @ManyToOne
    @JoinColumn(name = "veterinario_id")
    private Veterinario veterinario;
    
    @ManyToMany
    private Set<Farmaco> farmaci;
}
