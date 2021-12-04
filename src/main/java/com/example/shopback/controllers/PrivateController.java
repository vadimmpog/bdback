package com.example.shopback.controllers;

import com.example.shopback.models.Private;
import com.example.shopback.services.TableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/private")
public class PrivateController {

    private final TableService service;

    @RequestMapping(value = "/add-row", method = RequestMethod.POST)
    public String addRow(@RequestBody Private info){
        return service.addRow(info);
    }
}
