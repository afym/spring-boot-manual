package com.afym.manual.doc03.controller;

import com.afym.manual.doc03.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostWebController {

    @Autowired
    private PostModel postModel;

    @GetMapping("/posts/list")
    public String list(Model model) {
        model.addAttribute("pageTitle", "Posts list");
        model.addAttribute("posts", postModel.getPosts());

        return "post/list";
    }
}