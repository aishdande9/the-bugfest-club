package com.launchcode.liftoff.the.bugfest.club.controllers;

import com.launchcode.liftoff.the.bugfest.club.data.UserRepository;
import com.launchcode.liftoff.the.bugfest.club.exception.ResourceNotFoundException;
import com.launchcode.liftoff.the.bugfest.club.models.User;
import com.launchcode.liftoff.the.bugfest.club.security.CurrentUser;
import com.launchcode.liftoff.the.bugfest.club.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
