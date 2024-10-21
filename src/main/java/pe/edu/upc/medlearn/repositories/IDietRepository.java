package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Diet;

import java.util.List;

@Repository
public interface IDietRepository extends JpaRepository<Diet, Integer> {

    @Query("SELECT d FROM Diet d WHERE d.qualificationDiet = :qualification")
    List<Diet> findByQualification(@Param("qualification") int qualification);

    @Query("SELECT d FROM Diet d WHERE d.descriptionDiet LIKE %:description%")
    List<Diet> findByDescription(@Param("description") String description);

    @Query("SELECT d FROM Diet d JOIN d.illness i WHERE i.idIllness = :idillness")
    List<Diet> listByIllness(@Param("idillness") int idillness);
    //Dietas que han sido asignadas y cuantas han sido cumplidas por el usuario
    @Query(value="SELECT u.username,count(d.start_day_diet) as cantidad_de_dietas_iniciadas, count(d.finish_day_diet) as cantidad_dietas_finalizadas \n" +
            "from diet d\n" +
            "inner join users u on d.id_user=u.id_user\n" +
            "group by u.username", nativeQuery=true)
    List<String[]> quantityBydietsinicidasandfinalizadasbyuser();
}