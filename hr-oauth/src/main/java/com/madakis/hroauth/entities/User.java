package com.madakis.hroauth.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
public class User implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;

    private String name;


    private String email;

    private String password;

    private Set<Role> roles = new HashSet<>();
}
