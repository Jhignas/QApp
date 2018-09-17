package com.aconex.qapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE,generator = "question_generator")
    @SequenceGenerator(
            name = "question_generator",
            sequenceName = "question_sequence",
            allocationSize = 1
    )
    private Integer q_id;

    private String q_text;
    private String q_tags;

    public Integer getQ_id() {
        return q_id;
    }

    public void setQ_id(Integer q_id) {
        this.q_id = q_id;
    }

    public String getQ_text() {
        return q_text;
    }

    public void setQ_text(String q_text) {
        this.q_text = q_text;
    }

    public String getQ_tags() {
        return q_tags;
    }

    public void setQ_tags(String q_tags) {
        this.q_tags = q_tags;
    }


}
