package com.example.shopback.controllers;

import com.example.shopback.models.*;
import com.example.shopback.models.oldmodels.Product;
import com.example.shopback.services.TableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/private")
public class PrivateController {

    private final TableService service;

    /*-----------------------------------add-------------------------------------*/

    @RequestMapping(value = "/add-row-1", method = RequestMethod.POST)
    public String addRow1(@RequestBody Private info){
        return service.addRow(info);
    }

    @RequestMapping(value = "/add-row-2", method = RequestMethod.POST)
    public String addRow2(@RequestBody Clients client){
        return service.addRow2(client);
    }

    @RequestMapping(value = "/add-row-3", method = RequestMethod.POST)
    public String addRow3(@RequestBody Contracts contract){
        return service.addRow3(contract);
    }

    @RequestMapping(value = "/add-row-4", method = RequestMethod.POST)
    public String addRow4(@RequestBody Developers developer){
        return service.addRow4(developer);
    }

    @RequestMapping(value = "/add-row-5", method = RequestMethod.POST)
    public String addRow5(@RequestBody Employees employer){
        return service.addRow5(employer);
    }

    @RequestMapping(value = "/add-row-6", method = RequestMethod.POST)
    public String addRow6(@RequestBody Products product){
        return service.addRow6(product);
    }

    @RequestMapping(value = "/add-row-7", method = RequestMethod.POST)
    public String addRow7(@RequestBody Tasks task){
        return service.addRow7(task);
    }

    @RequestMapping(value = "/add-row-8", method = RequestMethod.POST)
    public String addRow8(@RequestBody Testers tester){
        return service.addRow8(tester);
    }

    /*---------------------------------update------------------------------------*/

    @RequestMapping(value = "/update-row-1", method = RequestMethod.POST)
    public String updateRow1(@RequestBody Private info){
        return service.updateRow(info);
    }

    @RequestMapping(value = "/update-row-2", method = RequestMethod.POST)
    public String updateRow2(@RequestBody Clients client){
        return service.updateRow1(client);
    }

    @RequestMapping(value = "/update-row-3", method = RequestMethod.POST)
    public String updateRow3(@RequestBody Contracts contract){
        return service.updateRow2(contract);
    }

    @RequestMapping(value = "/update-row-4", method = RequestMethod.POST)
    public String updateRow4(@RequestBody Developers developer){
        return service.updateRow3(developer);
    }

    @RequestMapping(value = "/update-row-5", method = RequestMethod.POST)
    public String updateRow5(@RequestBody Employees employer){
        return service.updateRow4(employer);
    }

    @RequestMapping(value = "/update-row-6", method = RequestMethod.POST)
    public String updateRow6(@RequestBody Products product){
        return service.updateRow5(product);
    }

    @RequestMapping(value = "/update-row-7", method = RequestMethod.POST)
    public String updateRow7(@RequestBody Tasks task){
        return service.updateRow7(task);
    }

    @RequestMapping(value = "/update-row-8", method = RequestMethod.POST)
    public String updateRow8(@RequestBody Testers tester){
        return service.updateRow8(tester);
    }

    /*----------------------------------all---------------------------------------*/

    @RequestMapping(value = "/all-tablename-1", method = RequestMethod.GET)
    public List<Clients> allRows1() {
        return service.getAllRows1();
    }

    @RequestMapping(value = "/all-tablename-2", method = RequestMethod.GET)
    public List<Contracts> allRows2() {
        return service.getAllRows2();
    }

    @RequestMapping(value = "/all-tablename-3", method = RequestMethod.GET)
    public List<Developers> allRows3() {
        return service.getAllRows3();
    }

    @RequestMapping(value = "/all-tablename-4", method = RequestMethod.GET)
    public List<Employees> allRows4() {
        return service.getAllRows4();
    }

    @RequestMapping(value = "/all-tablename-5", method = RequestMethod.GET)
    public List<Private> allRows5() {
        return service.getAllRows5();
    }

    @RequestMapping(value = "/all-tablename-6", method = RequestMethod.GET)
    public List<Product> allRows6() {
        return service.getAllRows6();
    }

    @RequestMapping(value = "/all-tablename-7", method = RequestMethod.GET)
    public List<Tasks> allRows7() {
        return service.getAllRows7();
    }

    @RequestMapping(value = "/all-tablename-8", method = RequestMethod.GET)
    public List<Testers> allRows8() {
        return service.getAllRows8();
    }

    /*----------------------------------delete---------------------------------------*/

    @RequestMapping(value = "/delete-row-1", method = RequestMethod.DELETE,
        params = {"id"})
    public String deleteRow1(@RequestParam("id") Integer id){
        return service.deleteRow(id);
    }

    @RequestMapping(value = "/delete-row-2", method = RequestMethod.DELETE,
        params = {"id"})
    public String deleteRow2(@RequestParam("id") Integer id){
        return service.deleteRow2(id);
    }

    @RequestMapping(value = "/delete-row-3", method = RequestMethod.DELETE,
        params = {"id"})
    public String deleteRow3(@RequestParam("id") Integer id){
        return service.deleteRow3(id);
    }

    @RequestMapping(value = "/delete-row-4", method = RequestMethod.DELETE,
        params = {"id"})
    public String deleteRow4(@RequestParam("id") Integer id){
        return service.deleteRow4(id);
    }

    @RequestMapping(value = "/delete-row-5", method = RequestMethod.DELETE,
        params = {"id"})
    public String deleteRow5(@RequestParam("id") Integer id){
        return service.deleteRow5(id);
    }

    @RequestMapping(value = "/delete-row-6", method = RequestMethod.DELETE,
        params = {"id"})
    public String deleteRow6(@RequestParam("id") Integer id){
        return service.deleteRow6(id);
    }

    @RequestMapping(value = "/delete-row-7", method = RequestMethod.DELETE,
        params = {"id"})
    public String deleteRow7(@RequestParam("id") Integer id){
        return service.deleteRow7(id);
    }

    @RequestMapping(value = "/delete-row-8", method = RequestMethod.DELETE,
        params = {"id"})
    public String deleteRow8(@RequestParam("id") Integer id){
        return service.deleteRow8(id);
    }

    /*----------------------------------filter---------------------------------------*/

}
