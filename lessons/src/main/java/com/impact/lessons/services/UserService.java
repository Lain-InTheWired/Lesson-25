package com.impact.lessons.services;

import com.impact.lessons.dto.CreateUserRequest;
import com.impact.lessons.repository.CredentialsRepository;
import com.impact.lessons.repository.UserPersonalDataRepository;
import com.impact.lessons.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CredentialsRepository credentialsRepository;
    private final UserPersonalDataRepository personalDataRepository;

    public UserService(
            UserRepository userRepository,
            CredentialsRepository credentialsRepository,
            UserPersonalDataRepository personalDataRepository) {
        this.userRepository = userRepository;
        this.credentialsRepository = credentialsRepository;
        this.personalDataRepository = personalDataRepository;
    }

    public void createUser(CreateUserRequest request) {
    }
}