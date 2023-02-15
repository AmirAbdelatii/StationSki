package tn.esprit.arctic.projetspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.arctic.projetspring.entities.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur,Integer> {
}
