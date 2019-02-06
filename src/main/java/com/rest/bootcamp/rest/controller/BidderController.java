package com.connect.connect2.controller;

import com.connect.connect2.model.Bidder;
import com.connect.connect2.repository.BidderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/bidder")
public class BidderController {

    @Autowired
    private BidderRepository bidderRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Bidder> getAllBidders()
    {
        return bidderRepository.findAll();
    }
}
