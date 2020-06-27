package io.codelearn.springsecurityjwt.repository;

import io.codelearn.springsecurityjwt.model.User;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User,String> , JpaSpecificationExecutor<User> {
    User findUserById(String userName);
}
