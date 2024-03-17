package com.bookrepo.repositories;

import com.bookrepo.entities.UserRightsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRightsRepository extends JpaRepository<UserRightsEntity, Integer> {
}
