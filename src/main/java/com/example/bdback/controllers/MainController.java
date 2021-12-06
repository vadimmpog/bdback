package com.example.bdback.controllers;

import com.example.bdback.models.*;
import com.example.bdback.services.TableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/main")
public class MainController {

    private final TableService service;

    /*-----------------------------------add-------------------------------------*/

    @RequestMapping(value = "/clients/create", method = RequestMethod.POST)
    public String addRow(@RequestBody Clients client){
        return service.addRow(client);
    }

    @RequestMapping(value = "/contracts/create", method = RequestMethod.POST)
    public String addRow(@RequestBody Contracts contract){
        return service.addRow(contract);
    }

    @RequestMapping(value = "/developers/create", method = RequestMethod.POST)
    public String addRow(@RequestBody Developers developer){
        return service.addRow(developer);
    }

    @RequestMapping(value = "/employees/create", method = RequestMethod.POST)
    public String addRow(@RequestBody Employees employer){
        return service.addRow(employer);
    }

    @RequestMapping(value = "/private_info/create", method = RequestMethod.POST)
    public String addRow(@RequestBody Private info){
        return service.addRow(info);
    }

    @RequestMapping(value = "/products/create", method = RequestMethod.POST)
    public String addRow(@RequestBody Products product){
        return service.addRow(product);
    }

    @RequestMapping(value = "/tasks/create", method = RequestMethod.POST)
    public String addRow(@RequestBody Tasks task){
        return service.addRow(task);
    }

    @RequestMapping(value = "/testers/create", method = RequestMethod.POST)
    public String addRow(@RequestBody Testers tester){
        return service.addRow(tester);
    }

    /*---------------------------------update------------------------------------*/

    @RequestMapping(value = "/clients/update", method = RequestMethod.POST)
    public String updateRow(@RequestBody Clients client){
        return service.updateRow(client);
    }

    @RequestMapping(value = "/contracts/update", method = RequestMethod.POST)
    public String updateRow(@RequestBody Contracts contract){
        return service.updateRow(contract);
    }

    @RequestMapping(value = "/developers/update", method = RequestMethod.POST)
    public String updateRow(@RequestBody Developers developer){
        return service.updateRow(developer);
    }

    @RequestMapping(value = "/employees/update", method = RequestMethod.POST)
    public String updateRow(@RequestBody Employees employer){
        return service.updateRow(employer);
    }

    @RequestMapping(value = "/private_info/update", method = RequestMethod.POST)
    public String updateRow(@RequestBody Private info){
        return service.updateRow(info);
    }

    @RequestMapping(value = "/products/update", method = RequestMethod.POST)
    public String updateRow(@RequestBody Products product){
        return service.updateRow(product);
    }

    @RequestMapping(value = "/tasks/update", method = RequestMethod.POST)
    public String updateRow(@RequestBody Tasks task){
        return service.updateRow(task);
    }

    @RequestMapping(value = "/testers/update", method = RequestMethod.POST)
    public String updateRow(@RequestBody Testers tester){
        return service.updateRow(tester);
    }

    /*----------------------------------all---------------------------------------*/

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public List<Clients> allRows1() {
        return service.getAllClientsRows();
    }

    @RequestMapping(value = "/contracts", method = RequestMethod.GET)
    public List<Contracts> allRows2() {
        return service.getAllContractsRows();
    }

    @RequestMapping(value = "/developers", method = RequestMethod.GET)
    public List<Developers> allRows3() {
        return service.getAllDevelopersRows();
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employees> allRows4() {
        return service.getAllEmployeesRows();
    }

    @RequestMapping(value = "/private_info", method = RequestMethod.GET)
    public List<Private> allRows5() {
        return service.getAllPrivateRows();
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Products> allRows6() {
        return service.getAllProductsRows();
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public List<Tasks> allRows7() {
        return service.getAllTasksRows();
    }

    @RequestMapping(value = "/testers", method = RequestMethod.GET)
    public List<Testers> allRows8() {
        return service.getAllTestersRows();
    }

    /*----------------------------------delete---------------------------------------*/

    @RequestMapping(value = "/clients/delete", method = RequestMethod.DELETE, params = {"id"})
    public String deleteRow1(@RequestParam("id") Integer id){
        return service.deleteRow("clients", id);
    }

    @RequestMapping(value = "/contracts/delete", method = RequestMethod.DELETE, params = {"id"})
    public String deleteRow2(@RequestParam("id") Integer id){
        return service.deleteRow("contracts", id);
    }

    @RequestMapping(value = "/developers/delete", method = RequestMethod.DELETE, params = {"id"})
    public String deleteRow3(@RequestParam("id") Integer id){
        return service.deleteRow("developers", id);
    }

    @RequestMapping(value = "/employees/delete", method = RequestMethod.DELETE, params = {"id"})
    public String deleteRow4(@RequestParam("id") Integer id){
        return service.deleteRow("employees", id);
    }

    @RequestMapping(value = "/private_info/delete", method = RequestMethod.DELETE, params = {"id"})
    public String deleteRow5(@RequestParam("id") Integer id){
        return service.deleteRow("private_info", id);
    }

    @RequestMapping(value = "/products/delete", method = RequestMethod.DELETE, params = {"id"})
    public String deleteRow6(@RequestParam("id") Integer id){
        return service.deleteRow("products", id);
    }

    @RequestMapping(value = "/tasks/delete", method = RequestMethod.DELETE, params = {"id"})
    public String deleteRow7(@RequestParam("id") Integer id){
        return service.deleteRow("tasks", id);
    }

    @RequestMapping(value = "/testers/delete", method = RequestMethod.DELETE, params = {"id"})
    public String deleteRow8(@RequestParam("id") Integer id){
        return service.deleteRow("testers", id);
    }

//    @RequestMapping(value = "/delete-row", method = RequestMethod.POST,
//        params = {"id", "tablename"})
//    public String deleteRow1(@RequestParam("id") Integer id, @RequestParam("tablename") String tablename){
//        return service.deleteRow(tablename);
//    }

    /*----------------------------------filter---------------------------------------*/

    @RequestMapping(value = "/sort-group", method = RequestMethod.POST,
            params = {"row"})
    public <T> List<Object> groupTable(@RequestParam("column") String column, @RequestBody() String table, @RequestBody() String order){
        return service.sortGroup(column, table, order);
    }

    @RequestMapping(value = "/sort-where", method = RequestMethod.POST,
            params = {"row"})
    public <T> List<T> whereTable(@RequestParam("column") String column, @RequestBody() String table, @RequestBody String where){
        return service.sortWhere(table, where);
    }

    @RequestMapping(value = "/sort-like", method = RequestMethod.POST,
            params = {"row"})
    public <T> List<T> likeTable(@RequestParam("column") String column, @RequestBody() String table, @RequestBody String like){
        return service.sortLike(table, like, column);
    }

}
