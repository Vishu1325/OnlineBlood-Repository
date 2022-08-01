package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.BloodCamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BloodCampRepository extends JpaRepository<BloodCamp,Integer> {

    @Query(nativeQuery=true,value="select * from blood_Camp where BDstate =:s")
    List<BloodCamp> SearchWithState(@Param("s") String state);

}
