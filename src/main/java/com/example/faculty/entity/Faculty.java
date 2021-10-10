package com.example.faculty.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private Long id;
    private String facultyName;
    private String facultyCode;
}
