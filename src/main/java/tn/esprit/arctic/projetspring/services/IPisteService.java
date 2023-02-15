package tn.esprit.arctic.projetspring.services;

import tn.esprit.arctic.projetspring.entities.Piste;

import java.util.List;

public interface IPisteService {
    
    List<Piste> retrieveAllPistes();

    Piste addPiste(Piste e);

    Piste updatePiste (Piste e);

    Piste retrievePiste (Integer idPiste);

    void deletePiste( Integer idPiste);
}
