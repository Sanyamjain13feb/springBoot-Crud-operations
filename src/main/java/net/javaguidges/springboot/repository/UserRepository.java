package net.javaguidges.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguidges.springboot.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
