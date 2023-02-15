package tn.esprit.arctic.projetspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.projetspring.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Integer> {
}
