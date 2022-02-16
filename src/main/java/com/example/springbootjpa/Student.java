package com.example.springbootjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Student")
@Getter
@Setter
@NoArgsConstructor
public class Student {
  
  @Id
  @SequenceGenerator(
    name = "student_sequence",
    sequenceName = "student_sequence",
    allocationSize = 1    
  )
  @GeneratedValue(
     strategy = GenerationType.SEQUENCE,
     generator = "student_sequence"
  )
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private Integer age;

}
