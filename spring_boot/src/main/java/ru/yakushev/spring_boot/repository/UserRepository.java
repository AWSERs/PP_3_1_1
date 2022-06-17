package ru.yakushev.spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yakushev.spring_boot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
