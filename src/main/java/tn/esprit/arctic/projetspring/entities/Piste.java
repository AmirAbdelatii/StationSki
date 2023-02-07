package tn.esprit.arctic.projetspring.entities;
import tn.esprit.arctic.projetspring.entities.Couleur;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Piste")
public class Piste implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idPiste")
    private Integer idPiste;
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longeur;
    private Integer pente;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}