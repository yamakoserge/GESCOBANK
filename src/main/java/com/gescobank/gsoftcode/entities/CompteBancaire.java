package com.gescobank.gsoftcode.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gescobank.gsoftcode.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
@JsonIgnoreProperties({"hibernatelazyInitializer"})
public abstract class CompteBancaire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private double balance;
    private String numCompte;
    private String devis = "CFA";
    private AccountStatus status;
    private Date createdAt = new Date();

}
