package com.connect.connect2.controller;

import com.connect.connect2.model.Owner;
import com.connect.connect2.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/owner")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Owner> getAllOwners()
    {
        return ownerRepository.findAll();
    }
}
