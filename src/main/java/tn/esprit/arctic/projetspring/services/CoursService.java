package tn.esprit.arctic.projetspring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projetspring.entities.Cours;
import tn.esprit.arctic.projetspring.repositories.CoursRepository;

import javax.persistence.Id;
import java.util.List;

@Service
@AllArgsConstructor
public class CoursService implements ICoursService{
    CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCourss() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours e) {
        return coursRepository.save(e);
    }

    @Override
    public Cours updateCours(Cours e) {
        return coursRepository.save(e);
    }

    @Override
    public Cours retrieveCours(Integer idCours) {
        return coursRepository.findById(idCours).get();
    }

    @Override
    public void deleteCours(Integer idCours) {
        coursRepository.deleteById(idCours);
    }
}
