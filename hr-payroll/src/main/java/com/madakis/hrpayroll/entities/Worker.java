package com.madakis.hrpayroll.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Worker implements Serializable {

    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private Double dailyIncome;
}
