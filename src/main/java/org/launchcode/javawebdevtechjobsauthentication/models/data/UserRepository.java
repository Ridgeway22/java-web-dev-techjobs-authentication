package org.launchcode.javawebdevtechjobsauthentication.models.data;

import org.launchcode.javawebdevtechjobsauthentication.models.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Integer userId);

    User findByUsername(String username);
}
