package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Hospital;

import java.util.List;

@Repository
public interface IHospitalRepository extends JpaRepository<Hospital, Integer> {
    @Query("select h from Hospital h where h.nameHospital like %:nombre%")
    public List<Hospital> buscarNombre(@Param("nombre") String nombre);

}
