package com.springsocial.socialmedia.model.post;

import com.springsocial.socialmedia.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String commentBody;

    @OneToOne
    private User commentAuthor;

    @ManyToOne
    private Post post_id;


}
