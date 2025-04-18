package org.example.spring_mvc_demo.controller;

import org.example.spring_mvc_demo.entity.*;
import org.example.spring_mvc_demo.service.NganhService;
import org.example.spring_mvc_demo.service.SVService;
import org.example.spring_mvc_demo.service.TruongService;
import org.example.spring_mvc_demo.service.impl.NganhServiceImpl;
import org.example.spring_mvc_demo.service.impl.TruongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    private TruongService truongService;

    @Autowired
    private NganhService nganhService;

    @Autowired
    private SVService svService;

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/add")
    public String add(Model model) {
        SinhVien sinhVien = new SinhVien();
        TotNghiep totNghiep = new TotNghiep();
        totNghiep.setSinhVien(new SinhVien());
        totNghiep.setTruong(new Truong());
        totNghiep.setNganh(new Nganh());

        //
        model.addAttribute("sinhVien", sinhVien);
        model.addAttribute("totNghiep", totNghiep);
        model.addAttribute("truongs", truongService.getAllTruong());
        model.addAttribute("nganhs", nganhService.getAllNganh());
        return "add.html";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute TotNghiep totNghiep) {
        System.out.println(totNghiep);
        return "index.html";

    }
}
