package com.afym.manual.doc03;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostModel {

    public List<PostEntity> getPosts() {
        PostEntity p1 = new PostEntity();
        p1.setTitle("Spring boot is awesome framework part 1");
        p1.setBody("Spring boot is one of the most important framework in the java world  so ....");
        p1.setDate("2018-01-01 00:02:22");

        PostEntity p2 = new PostEntity();
        p2.setTitle("Spring boot is awesome framework part 2");
        p2.setBody("Spring boot is one of the most important framework in the java world  so ....");
        p2.setDate("2018-01-02 20:02:22");

        PostEntity p3 = new PostEntity();
        p3.setTitle("Spring boot is awesome framework pat 3");
        p3.setBody("Spring boot is one of the most important framework in the java world  so ....");
        p3.setDate("2018-01-03 00:12:22");

        ArrayList<PostEntity> posts = new ArrayList<>();
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);

        return posts;
    }
}
