package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Users;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Users,Integer> {

    @Query("select c from Users c where c .username like %:name%")
    public List<Users> search(@Param("name") String name);

}
