package com.madakis.hruser.resources;

import com.madakis.hruser.entities.User;
import com.madakis.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository repository;


    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findbyId(@PathVariable Long id) {

        User porId = repository.findById(id).get();
        return ResponseEntity.ok(porId);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findbyEmail(@RequestParam String email) {

        User porEmail = repository.findByEmail(email);
        return ResponseEntity.ok(porEmail);
    }

}

