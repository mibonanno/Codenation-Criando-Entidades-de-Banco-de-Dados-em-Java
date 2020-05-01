package com.challenge.entity;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.List;


@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "company")
public class Company {



    @Id
    private int id;


    @Column(nullable = false, length = 100)
    @Size(max = 100)
    @NotNull
    private String name;


    @Column(nullable = false, length = 50)
    @Size(max = 50)
    @NotNull
    private String slug;

    @OneToMany
    private List<Candidate> candidates;


    @CreatedDate
    private Timestamp createdAt;

}

