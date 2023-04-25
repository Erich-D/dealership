package com.erich.dealership.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@RestController
public class MainController {

//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public List<Complaint> getAll(@RequestParam(required = false, value = "status") String flag, @RequestParam(required = false, value="id") String id){
//        if(flag==null&&id==null)return complaintService.getAll();
//        else if (id!=null && NumCheck.isNumeric(id)) {
//            return complaintService.getAll(Long.parseLong(id));
//        } else return complaintService.getAll(flag);
//    }
   @GetMapping("/")
   public String testPage(Model model) {
       String name = "John";

       model.addAttribute("number", 42);
       model.addAttribute("firstName", name);

       return "index";
   }
}
