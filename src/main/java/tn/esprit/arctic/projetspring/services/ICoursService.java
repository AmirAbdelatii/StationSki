package tn.esprit.arctic.projetspring.services;

import tn.esprit.arctic.projetspring.entities.Cours;

import java.util.List;

public interface ICoursService {
    
    List<Cours> retrieveAllCourss();

    Cours addCours(Cours e);

    Cours updateCours (Cours e);

    Cours retrieveCours (Integer idCours);

    void deleteCours( Integer idCours);
}
