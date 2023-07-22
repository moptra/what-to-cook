package hu.hobby.whattocook.service;


import hu.hobby.whattocook.domain.CustomUser;
import hu.hobby.whattocook.dto.incoming.CustomUserCommand;
import hu.hobby.whattocook.repository.CustomUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomUserService implements UserDetailsService {
    private CustomUserRepository customUserRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public CustomUserService(CustomUserRepository customUserRepository, PasswordEncoder passwordEncoder) {
        this.customUserRepository = customUserRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
        //TODO

    }

    public void registerUser(CustomUserCommand customUserCommand) {
        CustomUser customUser = new CustomUser(customUserCommand);
        customUser.setPassword(passwordEncoder.encode(customUserCommand.getPassword()));
        customUserRepository.save(customUser);
    }
}
