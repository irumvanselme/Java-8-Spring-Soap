package rw.ac.rca.java8springsoap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.rca.java8springsoap.models.Supplier;

@Repository
public interface IStudentRepository extends JpaRepository<Supplier, Long> {

}
