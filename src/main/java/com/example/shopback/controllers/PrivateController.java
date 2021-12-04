package com.example.shopback.controllers;

import com.example.shopback.models.*;
import com.example.shopback.models.oldmodels.Product;
import com.example.shopback.services.TableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/private")
public class PrivateController {

    private final TableService service;

    /*-----------------------------------add-------------------------------------*/

    @RequestMapping(value = "/add-row1", method = RequestMethod.POST)
    public String addRow1(@RequestBody Private info){
        return service.addRow(info);
    }

    @RequestMapping(value = "/add-row2", method = RequestMethod.POST)
    public String addRow2(@RequestBody Clients client){
        return service.addRow2(client);
    }

    @RequestMapping(value = "/add-row3", method = RequestMethod.POST)
    public String addRow3(@RequestBody Contracts contract){
        return service.addRow3(contract);
    }

    @RequestMapping(value = "/add-row4", method = RequestMethod.POST)
    public String addRow4(@RequestBody Developers developer){
        return service.addRow4(developer);
    }

    @RequestMapping(value = "/add-row5", method = RequestMethod.POST)
    public String addRow5(@RequestBody Employees employer){
        return service.addRow5(employer);
    }

    @RequestMapping(value = "/add-row6", method = RequestMethod.POST)
    public String addRow6(@RequestBody Products product){
        return service.addRow6(product);
    }

    @RequestMapping(value = "/add-row7", method = RequestMethod.POST)
    public String addRow7(@RequestBody Tasks task){
        return service.addRow7(task);
    }

    @RequestMapping(value = "/add-row8", method = RequestMethod.POST)
    public String addRow8(@RequestBody Testers tester){
        return service.addRow8(tester);
    }

    /*---------------------------------update------------------------------------*/

    @RequestMapping(value = "/update-row1", method = RequestMethod.POST)
    public String updateRow1(@RequestBody Private info){
        return service.updateRow(info);
    }

    @RequestMapping(value = "/update-row2", method = RequestMethod.POST)
    public String updateRow2(@RequestBody Clients client){
        return service.updateRow1(client);
    }

    @RequestMapping(value = "/update-row3", method = RequestMethod.POST)
    public String updateRow3(@RequestBody Contracts contract){
        return service.updateRow2(contract);
    }

    @RequestMapping(value = "/update-row4", method = RequestMethod.POST)
    public String updateRow4(@RequestBody Developers developer){
        return service.updateRow3(developer);
    }

    @RequestMapping(value = "/update-row5", method = RequestMethod.POST)
    public String updateRow5(@RequestBody Employees employer){
        return service.updateRow4(employer);
    }

    @RequestMapping(value = "/update-row6", method = RequestMethod.POST)
    public String updateRow6(@RequestBody Products product){
        return service.updateRow5(product);
    }

    @RequestMapping(value = "/update-row7", method = RequestMethod.POST)
    public String updateRow7(@RequestBody Tasks task){
        return service.updateRow7(task);
    }

    @RequestMapping(value = "/update-row8", method = RequestMethod.POST)
    public String updateRow8(@RequestBody Testers tester){
        return service.updateRow8(tester);
    }

    /*----------------------------------all---------------------------------------*/

    @RequestMapping(value = "/all-tablename1", method = RequestMethod.GET)
    public List<Clients> allRows1() {
        return service.getAllRows1();
    }

    @RequestMapping(value = "/all-tablename2", method = RequestMethod.GET)
    public List<Contracts> allRows2() {
        return service.getAllRows2();
    }

    @RequestMapping(value = "/all-tablename3", method = RequestMethod.GET)
    public List<Developers> allRows3() {
        return service.getAllRows3();
    }

    @RequestMapping(value = "/all-tablename4", method = RequestMethod.GET)
    public List<Employees> allRows4() {
        return service.getAllRows4();
    }

    @RequestMapping(value = "/all-tablename5", method = RequestMethod.GET)
    public List<Private> allRows5() {
        return service.getAllRows5();
    }

    @RequestMapping(value = "/all-tablename6", method = RequestMethod.GET)
    public List<Product> allRows6() {
        return service.getAllRows6();
    }

    @RequestMapping(value = "/all-tablename7", method = RequestMethod.GET)
    public List<Tasks> allRows7() {
        return service.getAllRows7();
    }

    @RequestMapping(value = "/all-tablename8", method = RequestMethod.GET)
    public List<Testers> allRows8() {
        return service.getAllRows8();
    }



}
