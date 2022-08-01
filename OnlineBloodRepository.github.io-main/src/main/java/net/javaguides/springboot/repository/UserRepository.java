package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);

    @Query(nativeQuery=true,value="select * from user where blood_group =:b and pin_code =:c")
    List<User> filterDataWithPinCodeAndBloodGroup(@Param("b") String bloodGroup,@Param("c") String pinCode);


    @Query(nativeQuery=true,value="select * from user where blood_group = 'rare'")
    List<User> rareBlood();
}
