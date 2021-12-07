package com.example.bdback.controllers;

import com.example.bdback.models.*;
import com.example.bdback.services.TableService;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
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

    /*----------------------------------sort---------------------------------------*/

    @RequestMapping(value = "/sort/group", method = RequestMethod.POST)
    public <T> List<T> groupTable(@RequestBody String data) {
        JSONObject dataJson = new JSONObject(data);
        String column = dataJson.getString("column");
        String table = dataJson.getString("table");
        String order = dataJson.getString("order");
        return service.sortGroup(column, table, order);
    }

    /*----------------------------------where---------------------------------------*/

    @RequestMapping(value = "/clients/where", method = RequestMethod.POST)
    public List<Clients> whereTable(@RequestBody Clients client){
        return service.sortWhere(client);
    }

    @RequestMapping(value = "/contracts/where", method = RequestMethod.POST)
    public List<Contracts> whereTable(@RequestBody Contracts contract){
        return service.sortWhere(contract);
    }

    @RequestMapping(value = "/developers/where", method = RequestMethod.POST)
    public List<Developers> whereTable(@RequestBody Developers developer){
        return service.sortWhere(developer);
    }

    @RequestMapping(value = "/employees/where", method = RequestMethod.POST)
    public List<Employees> whereTable(@RequestBody Employees employer){
        return service.sortWhere(employer);
    }

    @RequestMapping(value = "/private_info/where", method = RequestMethod.POST)
    public List<Private> whereTable(@RequestBody Private info){
        return service.sortWhere(info);
    }

    @RequestMapping(value = "/products/where", method = RequestMethod.POST)
    public List<Products> whereTable(@RequestBody Products product){
        return service.sortWhere(product);
    }

    @RequestMapping(value = "/tasks/where", method = RequestMethod.POST)
    public List<Tasks> whereTable(@RequestBody Tasks task){
        return service.sortWhere(task);
    }

    @RequestMapping(value = "/testers/where", method = RequestMethod.POST)
    public List<Testers> whereTable(@RequestBody Testers tester){
        return service.sortWhere(tester);
    }

    /*----------------------------------like---------------------------------------*/

    @RequestMapping(value = "/clients/like", method = RequestMethod.POST)
    public List<Clients> likeTable1(@RequestBody String data){
        JSONObject dataJson = new JSONObject(data);
        String column = dataJson.getString("column");
        String like = dataJson.getString("like");
        return service.sortLike(column, "clients", like);
    }

    @RequestMapping(value = "/contracts/like", method = RequestMethod.POST)
    public List<Contracts> likeTable2(@RequestBody String data){
        JSONObject dataJson = new JSONObject(data);
        String column = dataJson.getString("column");
        String like = dataJson.getString("like");
        return service.sortLike(column, "contracts", like);
    }

    @RequestMapping(value = "/developers/like", method = RequestMethod.POST)
    public List<Developers> likeTable3(@RequestBody String data){
        JSONObject dataJson = new JSONObject(data);
        String column = dataJson.getString("column");
        String like = dataJson.getString("like");
        return service.sortLike(column, "developers", like);
    }

    @RequestMapping(value = "/employees/like", method = RequestMethod.POST)
    public List<Employees> likeTable4(@RequestBody String data){
        JSONObject dataJson = new JSONObject(data);
        String column = dataJson.getString("column");
        String like = dataJson.getString("like");
        return service.sortLike(column, "employees", like);
    }

    @RequestMapping(value = "/private_info/like", method = RequestMethod.POST)
    public List<Private> likeTable5(@RequestBody String data){
        JSONObject dataJson = new JSONObject(data);
        String column = dataJson.getString("column");
        String like = dataJson.getString("like");
        return service.sortLike(column, "private_info", like);
    }

    @RequestMapping(value = "/products/like", method = RequestMethod.POST)
    public List<Products> likeTable6(@RequestBody String data){
        JSONObject dataJson = new JSONObject(data);
        String column = dataJson.getString("column");
        String like = dataJson.getString("like");
        return service.sortLike(column, "products", like);
    }

    @RequestMapping(value = "/tasks/like", method = RequestMethod.POST)
    public List<Tasks> likeTable7(@RequestBody String data){
        JSONObject dataJson = new JSONObject(data);
        String column = dataJson.getString("column");
        String like = dataJson.getString("like");
        return service.sortLike(column, "tasks", like);
    }

    @RequestMapping(value = "/testers/like", method = RequestMethod.POST)
    public List<Testers> likeTable8(@RequestBody String data){
        JSONObject dataJson = new JSONObject(data);
        String column = dataJson.getString("column");
        String like = dataJson.getString("like");
        return service.sortLike(column, "testers", like);
    }

}
