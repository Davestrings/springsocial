package com.springsocial.socialmedia.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springsocial.socialmedia.model.post.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String phoneNumber;

    @OneToOne
    private Address address;

    @Column(nullable = false)
    @JsonIgnore
    @ToString.Exclude
    private String password;

    private Date dateOfBirth;

    private String profileImageUrl;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Image> allImages;

    private String bannerImage;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Video> allVideos;

    @OneToMany
    private List<Friend> friends;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "author", cascade = CascadeType.ALL)
    private List<Post> posts;

}
