package com.example.demo.controller;

import com.example.demo.repository.dao.DataObject;
import com.example.demo.service.DataObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class HomePageController {

    private final DataObjectService dataObjectService;

    public HomePageController(DataObjectService dataObjectService) {
        this.dataObjectService = dataObjectService;
    }

    @GetMapping("/app_title")
    public String homePage(Model model) {
        List<DataObject> dataList = dataObjectService.findAll();
        model.addAttribute("dataList", dataList);
        model.addAttribute("Data", new DataObject());
        return "HomePage";
    }

    @PostMapping("/save")
    public String saveData(@Validated @ModelAttribute("Data") DataObject data, BindingResult result, Model model) {
        if(result.hasErrors()) {
            List<DataObject> dataList = dataObjectService.findAll();
            model.addAttribute("dataList", dataList);
            return "HomePage";
        }
        dataObjectService.save(data);
        return "redirect:/app_title?saved=true";
    }

}
