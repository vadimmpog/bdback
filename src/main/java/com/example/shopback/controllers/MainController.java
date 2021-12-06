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

    @RequestMapping(value = "/all", method = RequestMethod.GET,
    params = {"tablename"})
    public List<Private> allRows1(@RequestParam("tablename") String tablename) {
        return service.getAllRows(tablename);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET,
    params = {"tablename"})
    public List<Clients> allRows2(@RequestParam("tablename") String tablename) {
        return service.getAllRows(tablename);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET,
    params = {"tablename"})
    public List<Contracts> allRows3(@RequestParam("tablename") String tablename) {
        return service.getAllRows(tablename);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET,
    params = {"tablename"})
    public List<Developers> allRows4(@RequestParam("tablename") String tablename) {
        return service.getAllRows(tablename);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET,
    params = {"tablename"})
    public List<Employees> allRows5(@RequestParam("tablename") String tablename) {
        return service.getAllRows(tablename);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET,
    params = {"tablename"})
    public List<Products> allRows6(@RequestParam("tablename") String tablename) {
        return service.getAllRows(tablename);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET,
    params = {"tablename"})
    public List<Tasks> allRows7(@RequestParam("tablename") String tablename) {
        return service.getAllRows(tablename);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET,
    params = {"tablename"})
    public List<Testers> allRows8(@RequestParam("tablename") String tablename) {
        return service.getAllRows(tablename);
    }

    /*----------------------------------delete---------------------------------------*/

    @RequestMapping(value = "/delete-row", method = RequestMethod.DELETE,
        params = {"id", "tablename"})
    public String deleteRow1(@RequestParam("id") Integer id, @RequestParam("tablename") String tablename){
        return service.deleteRow(id, tablename);
    }

    /*----------------------------------filter---------------------------------------*/

    @RequestMapping(value = "/sort-table", method = RequestMethod.GET,
            params = {"row", "tablename"})
    public String deleteRow1(@RequestParam("row") String row, @RequestParam("tablename") String tablename){
        return service.sortTable(row, tablename);
    }

}
