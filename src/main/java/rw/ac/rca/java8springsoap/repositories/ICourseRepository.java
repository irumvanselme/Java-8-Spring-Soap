package rw.ac.rca.java8springsoap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.ac.rca.java8springsoap.models.Item;

public interface ICourseRepository extends JpaRepository<Item, Long> {

}
