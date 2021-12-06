package com.example.shopback.controllers;

import com.example.shopback.models.*;
import com.example.shopback.models.oldmodels.Product;
import com.example.shopback.services.TableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/main")
public class MainController {

    private final TableService service;

    /*-----------------------------------add-------------------------------------*/

    @RequestMapping(value = "/add-row-1", method = RequestMethod.POST)
    public String addRow(@RequestBody Private info){
        return service.addRow(info);
    }

    @RequestMapping(value = "/add-row-2", method = RequestMethod.POST)
    public String addRow(@RequestBody Clients client){
        return service.addRow(client);
    }

    @RequestMapping(value = "/add-row-3", method = RequestMethod.POST)
    public String addRow(@RequestBody Contracts contract){
        return service.addRow(contract);
    }

    @RequestMapping(value = "/add-row-4", method = RequestMethod.POST)
    public String addRow(@RequestBody Developers developer){
        return service.addRow(developer);
    }

    @RequestMapping(value = "/add-row-5", method = RequestMethod.POST)
    public String addRow(@RequestBody Employees employer){
        return service.addRow(employer);
    }

    @RequestMapping(value = "/add-row-6", method = RequestMethod.POST)
    public String addRow(@RequestBody Products product){
        return service.addRow(product);
    }

    @RequestMapping(value = "/add-row-7", method = RequestMethod.POST)
    public String addRow(@RequestBody Tasks task){
        return service.addRow(task);
    }

    @RequestMapping(value = "/add-row-8", method = RequestMethod.POST)
    public String addRow(@RequestBody Testers tester){
        return service.addRow(tester);
    }

    /*---------------------------------update------------------------------------*/

    @RequestMapping(value = "/update-row-1", method = RequestMethod.POST)
    public String updateRow(@RequestBody Private info){
        return service.updateRow(info);
    }

    @RequestMapping(value = "/update-row-2", method = RequestMethod.POST)
    public String updateRow(@RequestBody Clients client){
        return service.updateRow(client);
    }

    @RequestMapping(value = "/update-row-3", method = RequestMethod.POST)
    public String updateRow(@RequestBody Contracts contract){
        return service.updateRow(contract);
    }

    @RequestMapping(value = "/update-row-4", method = RequestMethod.POST)
    public String updateRow(@RequestBody Developers developer){
        return service.updateRow(developer);
    }

    @RequestMapping(value = "/update-row-5", method = RequestMethod.POST)
    public String updateRow(@RequestBody Employees employer){
        return service.updateRow(employer);
    }

    @RequestMapping(value = "/update-row-6", method = RequestMethod.POST)
    public String updateRow(@RequestBody Products product){
        return service.updateRow(product);
    }

    @RequestMapping(value = "/update-row-7", method = RequestMethod.POST)
    public String updateRow(@RequestBody Tasks task){
        return service.updateRow(task);
    }

    @RequestMapping(value = "/update-row-8", method = RequestMethod.POST)
    public String updateRow(@RequestBody Testers tester){
        return service.updateRow(tester);
    }

    /*----------------------------------all---------------------------------------*/

    @RequestMapping(value = "/all-private", method = RequestMethod.GET)
    public List<Private> allRows1() {
        return service.getAllPrivateRows();
    }

    @RequestMapping(value = "/all-clients", method = RequestMethod.GET)
    public List<Clients> allRows2() {
        return service.getAllClientsRows();
    }

    @RequestMapping(value = "/all-contracts", method = RequestMethod.GET)
    public List<Contracts> allRows3() {
        return service.getAllContractsRows();
    }

    @RequestMapping(value = "/all-developers", method = RequestMethod.GET)
    public List<Developers> allRows4() {
        return service.getAllDevelopersRows();
    }

    @RequestMapping(value = "/all-employees", method = RequestMethod.GET)
    public List<Employees> allRows5() {
        return service.getAllEmployeesRows();
    }

    @RequestMapping(value = "/all-products", method = RequestMethod.GET)
    public List<Products> allRows6() {
        return service.getAllProductsRows();
    }

    @RequestMapping(value = "/all-tasks", method = RequestMethod.GET)
    public List<Tasks> allRows7() {
        return service.getAllTasksRows();
    }

    @RequestMapping(value = "/all-testers", method = RequestMethod.GET)
    public List<Testers> allRows8() {
        return service.getAllTestersRows();
    }

    /*----------------------------------delete---------------------------------------*/

    @RequestMapping(value = "/delete-row", method = RequestMethod.POST,
        params = {"id", "tablename"})
    public String deleteRow1(@RequestParam("id") Integer id, @RequestParam("tablename") String tablename){
        return service.deleteRow(id, tablename);
    }

    /*----------------------------------filter---------------------------------------*/

    @RequestMapping(value = "/sort-group", method = RequestMethod.POST,
            params = {"row"})
    public <T> List<T> groupTable(@RequestParam("row") String row, @RequestBody() T model){
        return service.sortGroup(row, model);
    }

    @RequestMapping(value = "/sort-where", method = RequestMethod.POST,
            params = {"row"})
    public <T> List<T> whereTable(@RequestParam("row") String row, @RequestBody() T model){
        return service.sortWhere(row, model);
    }

    @RequestMapping(value = "/sort-like", method = RequestMethod.POST,
            params = {"row"})
    public <T> List<T> likeTable(@RequestParam("row") String row, @RequestBody() T model){
        return service.sortLike(row, model);
    }

}
