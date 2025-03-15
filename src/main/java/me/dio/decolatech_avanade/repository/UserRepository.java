package me.dio.decolatech_avanade.repository;

import me.dio.decolatech_avanade.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
