//package com.spring.security.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(name = "tbl_user_master")
//public class Login {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//
//    private int id;
//    @Column(name = "user_id")
//    private String user_id;
//    @Column(name = "name")
//    private String name;
//    @Column(name = "email")
//    private String email;
//    @Column(name = "password")
//    private String password;
//    @Column(name = "contact_no")
//    private String contact_no;
//    @Column(name = "location_code")
//    private int location_code;
//    @Column(name = "user_type")
//    private String user_type;
//    @Column(name = "status")
//    private String status;
//    @Column(name = "permission_in")
//    private String permission_in;
//    @Column(name = "permission_out")
//    private String permission_out;
//    @Column(name = "permission_in_view")
//    private String permission_in_view;
//}