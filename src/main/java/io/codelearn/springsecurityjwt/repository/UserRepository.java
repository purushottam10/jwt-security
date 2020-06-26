package io.codelearn.springsecurityjwt.repository;

import io.codelearn.springsecurityjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,String> {
}
