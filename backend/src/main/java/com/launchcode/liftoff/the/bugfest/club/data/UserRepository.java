package com.launchcode.liftoff.the.bugfest.club.data;

import com.launchcode.liftoff.the.bugfest.club.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Boolean existsByEmail(String email);

}
