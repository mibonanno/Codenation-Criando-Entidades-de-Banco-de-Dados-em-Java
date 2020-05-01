package com.challenge.entity;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;


@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name ="submission")
public class Submission {


    @EmbeddedId
    private SubmissionId submissionid;


    @Column(nullable = false)
    @NotNull
    private Float score;


    @CreatedDate
    private Timestamp createdAt;


}

