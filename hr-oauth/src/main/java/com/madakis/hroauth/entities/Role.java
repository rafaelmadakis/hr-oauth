package com.madakis.hroauth.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
public class Role implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;

    private String roleName;
}
