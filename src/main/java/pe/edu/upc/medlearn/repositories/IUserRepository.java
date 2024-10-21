package pe.edu.upc.medlearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.medlearn.entities.Users;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Users,Integer> {
    public Users findOneByUsername(String username);

    @Query("select c from Users c where c .username like %:name%")
    public List<Users> search(@Param("name") String name);

    @Query(value = "" +
            "SELECT r.rol as rol, count(*) as usuarios\n" +
            "from users u inner join roles r\n" +
            "on u.id_user = r.user_id\n" +
            "group by r.rol", nativeQuery = true)
    public List<String[]> cantidadUsuariosPorRol();
}
