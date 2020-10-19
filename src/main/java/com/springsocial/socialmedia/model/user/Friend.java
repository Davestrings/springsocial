package com.springsocial.socialmedia.model.user;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "relationship")
@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User beFriended;

    @OneToOne
    private User friendee;

}
