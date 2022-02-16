package com.example.springbootjpa;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Student {
  
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
