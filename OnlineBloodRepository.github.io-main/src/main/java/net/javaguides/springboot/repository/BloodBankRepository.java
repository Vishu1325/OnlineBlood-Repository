package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.BloodBank1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BloodBankRepository extends JpaRepository<BloodBank1,Integer> {

    @Query(nativeQuery=true,value="select * from blood_bank where BBstate =:s")
    List<BloodBank1> SearchWithState(@Param("s") String state);

}
