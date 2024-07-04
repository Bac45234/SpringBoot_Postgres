package Innova.SpringBoot_Postgres.repository;

import Innova.SpringBoot_Postgres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
