package com.gescobank.gsoftcode.enums;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;


public enum AccountStatus {

    ACTIVATED,
    SUSPENDED

}
