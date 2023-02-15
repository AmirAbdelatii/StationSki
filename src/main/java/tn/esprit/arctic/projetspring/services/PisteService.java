package tn.esprit.arctic.projetspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.entities.Piste;
import tn.esprit.arctic.projetspring.repositories.PisteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteService implements IPisteService{
    PisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste e) {
        return pisteRepository.save(e);
    }

    @Override
    public Piste updatePiste(Piste e) {
        return pisteRepository.save(e);
    }

    @Override
    public Piste retrievePiste(Integer idPiste) {
        return pisteRepository.findById(idPiste).get();
    }

    @Override
    public void deletePiste(Integer idPiste) {
        pisteRepository.deleteById(idPiste);
    }
}
