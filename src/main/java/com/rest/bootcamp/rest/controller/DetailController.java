package com.connect.connect2.controller;

import com.connect.connect2.model.Detail;
import com.connect.connect2.repository.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/detail")
public class DetailController {

    @Autowired
    private DetailRepository detailRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Detail> getAllDetails()
    {
        return detailRepository.findAll();
    }
}
