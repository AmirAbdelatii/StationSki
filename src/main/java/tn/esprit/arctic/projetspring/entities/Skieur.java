package tn.esprit.arctic.projetspring.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idSkieur")
    private Integer idSkieur;
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private Date dateNaissance;
    private String ville;
}
