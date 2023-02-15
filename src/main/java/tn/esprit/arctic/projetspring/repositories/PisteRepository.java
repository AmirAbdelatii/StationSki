package tn.esprit.arctic.projetspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.projetspring.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste,Integer> {
}
