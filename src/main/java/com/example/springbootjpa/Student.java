package com.example.springbootjpa;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Student")
@Getter
@Setter
@NoArgsConstructor
public class Student {
  
  @Id
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private Integer age;
  
  public Student(Long id, String firstName, String lastName, String email, Integer age) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.age = age;
  }

}
