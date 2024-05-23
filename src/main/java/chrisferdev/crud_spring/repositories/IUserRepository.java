package chrisferdev.crud_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import chrisferdev.crud_spring.models.UserModel;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {

    
}
