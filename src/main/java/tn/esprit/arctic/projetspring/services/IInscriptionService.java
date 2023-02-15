package tn.esprit.arctic.projetspring.services;

import tn.esprit.arctic.projetspring.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    
    List<Inscription> retrieveAllInscriptions();

    Inscription addInscription(Inscription e);

    Inscription updateInscription (Inscription e);

    Inscription retrieveInscription (Integer idInscription);

    void deleteInscription( Integer idInscription);
}
