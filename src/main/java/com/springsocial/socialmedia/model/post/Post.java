package com.springsocial.socialmedia.model.post;

import com.springsocial.socialmedia.model.user.User;
import com.springsocial.socialmedia.model.util.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User author;

    private String postBody;

    @OneToMany
    private List<Comment> comment;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

}
