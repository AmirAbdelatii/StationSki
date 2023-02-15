package tn.esprit.arctic.projetspring.services;

import tn.esprit.arctic.projetspring.entities.Abonnement;

import java.util.List;

public interface IAbonnementService {

    List<Abonnement> retrieveAllAbonnements();

    Abonnement addAbonnement(Abonnement e);

    Abonnement updateAbonnement (Abonnement e);

    Abonnement retrieveAbonnement (Integer idAbonnement);

    void deleteAbonnement( Integer idAbbonement);
}
