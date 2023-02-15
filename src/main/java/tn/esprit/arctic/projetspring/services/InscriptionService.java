package tn.esprit.arctic.projetspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.entities.Inscription;
import tn.esprit.arctic.projetspring.repositories.InscriptionRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionService implements IInscriptionService{
    InscriptionRepository inscriptionRepository;
    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription e) {
        return inscriptionRepository.save(e);
    }

    @Override
    public Inscription updateInscription(Inscription e) {
        return inscriptionRepository.save(e);
    }

    @Override
    public Inscription retrieveInscription(Integer idInscription) {
        return inscriptionRepository.findById(idInscription).get();
    }

    @Override
    public void deleteInscription(Integer idInscription) {
        inscriptionRepository.deleteById(idInscription);
    }
}
