package tn.esprit.arctic.projetspring.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMoniteur")
    private Integer idMoniteur;
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;
}
