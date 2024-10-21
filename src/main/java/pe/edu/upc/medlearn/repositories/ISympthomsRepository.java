package pe.edu.upc.medlearn.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Symptom;

@Repository
public interface ISympthomsRepository extends JpaRepository<Symptom,Integer> {



}
