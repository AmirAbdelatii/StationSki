package tn.esprit.arctic.projetspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.projetspring.entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement,Integer> {
}
