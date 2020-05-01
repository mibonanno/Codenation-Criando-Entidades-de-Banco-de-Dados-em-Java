package com.challenge.entity;


import javafx.scene.Camera;
import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.List;


@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    @Column(name = "fullname", nullable = false, length = 100)
    @Size(max = 100)
    @NotNull
    private String fullname;


    @Email
    @Column(nullable = false, length = 100)
    @Size(max = 100)
    @NotNull
    private String email;


    @Column(nullable = false, length = 50)
    @Size(max = 50)
    @NotNull
    private String nickname;


    @Column(nullable = false, length = 255)
    @Size(max = 255)
    @NotNull
    private String password;

    @OneToMany
    private List<Candidate> candidates;

    @OneToMany
    private List<Submission> submissions;


    @CreatedDate
    private Timestamp createdAt;

}

