package tn.esprit.arctic.projetspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.entities.Moniteur;
import tn.esprit.arctic.projetspring.repositories.MoniteurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MoniteurService implements IMoniteurService{
    MoniteurRepository moniteurRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur e) {
        return moniteurRepository.save(e);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur e) {
        return moniteurRepository.save(e);
    }

    @Override
    public Moniteur retrieveMoniteur(Integer idMoniteur) {
        return moniteurRepository.findById(idMoniteur).get();
    }

    @Override
    public void deleteMoniteur(Integer idMoniteur) {
        moniteurRepository.deleteById(idMoniteur);
    }
}
