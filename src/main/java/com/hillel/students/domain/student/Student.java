package com.hillel.students.domain.student;


import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;

     @NotBlank(message = "Name is mandatory")
     String name;

     String email;

     @NotBlank(message = "Telegram is mandatory" )
     String telegram;

     String level;

     public long getId() {
          return id;
     }

     public void setId(long id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getTelegram() {
          return telegram;
     }

     public void setTelegram(String telegram) {
          this.telegram = telegram;
     }

     public String getLevel() {
          return level;
     }

     public void setLevel(String level) {
          this.level = level;
     }
}
