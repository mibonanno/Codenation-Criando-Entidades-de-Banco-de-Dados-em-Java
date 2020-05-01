package com.challenge.entity;



import lombok.Data;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;



@Data
@Embeddable
public class SubmissionId implements Serializable {


    @ManyToOne
    private User user;


    @ManyToOne
    private Challenge challenge;


}

