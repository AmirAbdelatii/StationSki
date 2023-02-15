package tn.esprit.arctic.projetspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.entities.Abonnement;
import tn.esprit.arctic.projetspring.repositories.AbonnementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AbonnementService implements IAbonnementService{
    AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement e) {
        return abonnementRepository.save(e);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement e) {
        return abonnementRepository.save(e);
    }

    @Override
    public Abonnement retrieveAbonnement(Integer idAbonnement) {
        return abonnementRepository.findById(idAbonnement).get();
    }

    @Override
    public void deleteAbonnement(Integer idAbbonement) {
        abonnementRepository.deleteById(idAbbonement);
    }
}
