package tn.esprit.arctic.projetspring.services;

import tn.esprit.arctic.projetspring.entities.Skieur;

import java.util.List;

public interface ISkieurService {

    List<Skieur> retrieveAllSkieurs();

    Skieur addSkieur(Skieur e);

    Skieur updateSkieur (Skieur e);

    Skieur retrieveSkieur (Integer idSkieur);

    void deleteSkieur( Integer idSkieur);
}
