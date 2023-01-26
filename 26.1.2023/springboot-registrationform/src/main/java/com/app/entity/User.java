package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_register")
public class User {
private String name;
@Id
private String username;
private String userid;
private String email;
private String phone;
private String password;
private String cpassword;
private String gender;

}
