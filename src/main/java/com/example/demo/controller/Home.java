package com.example.demo.controller;

import com.example.demo.service.TreeSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home implements java.io.Serializable{

    private final TreeSrv treeSrv;

    @Autowired
    public Home(TreeSrv treeSrv) {
        this.treeSrv = treeSrv;
    }


    @GetMapping("/")
    public String GetIndex(Model model) {
        model.addAttribute("findAll", treeSrv.findAll());

        return "index.html";
    }


}
