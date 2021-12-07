package com.example.bdback.services;

import com.example.bdback.models.*;
import com.example.bdback.repos.*;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Where;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class TableService {

    private final PrivateRepository privateRepository;
    private final ClientsRepository clientsRepository;
    private final ContractsRepository contractsRepository;
    private final DevelopersRepository developersRepository;
    private final EmployeesRepository employeesRepository;
    private final ProductsRepository productsRepository;
    private final TasksRepository tasksRepository;
    private final TestersRepository testersRepository;

    public <T> String addRow(T model){
        if (model instanceof Clients){
            Clients s = (Clients) model;
            clientsRepository.save(s);
            return "Row saved successful";
        }
        if (model instanceof Contracts){
            Contracts s = (Contracts) model;
            contractsRepository.save(s);
            return "Row saved successful";
        }
        if (model instanceof Developers){
            Developers s = (Developers) model;
            developersRepository.save(s);
            return "Row saved successful";
        }
        if (model instanceof Employees){
            Employees s = (Employees) model;
            employeesRepository.save(s);
            return "Row saved successful";
        }
        if (model instanceof Private){
            Private s = (Private) model;
            privateRepository.save(s);
            return "Row saved successful";
        }
        if (model instanceof Products){
            Products s = (Products) model;
            productsRepository.save(s);
            return "Row saved successful";
        }
        if (model instanceof Tasks){
            Tasks s = (Tasks) model;
            tasksRepository.save(s);
            return "Row saved successful";
        }
        if (model instanceof Testers){
            Testers s = (Testers) model;
            testersRepository.save(s);
            return "Row saved successful";
        }
        return null;
    }

    public String deleteRow(String table, Integer id){
        if (table.equals("clients")){
            clientsRepository.deleteById(id);
            return "Row deleted successful";
        }
        if (table.equals("private_info")){
            privateRepository.deleteById(id);
            return "Row deleted successful";
        }
        return "Error not deleted.";
    }

    public <T> String updateRow(T model){
        if (model instanceof Clients){
            Clients s = (Clients) model;
            Integer id = s.getId();
            if(id != null && id != 0){
                Clients old = clientsRepository.findById(id).orElse(null);
                if(old != null) {
                    s.update(old);
                    clientsRepository.save(s);
                    return "Row updated successful";
                }
            }
            return "No row with such id";
        }
        if (model instanceof Private){
            Private s = (Private) model;
            Integer id = s.getId();
            if(id != null && id != 0){
                Private old = privateRepository.findById(id).orElse(null);
                if(old != null) {
                    s.update(old);
                    privateRepository.save(s);
                    return "Row updated successful";
                }
            }
            return "No row with such id";
        }
        return null;
    }

    /*------------------------------------------all------------------------------------------------*/

    public List<Private> getAllPrivateRows(){
        return privateRepository.findAll();
    }

    public List<Clients> getAllClientsRows(){
        return clientsRepository.findAll();
    }

    public List<Contracts> getAllContractsRows(){
        return contractsRepository.findAll();
    }

    public List<Developers> getAllDevelopersRows(){
        return developersRepository.findAll();
    }

    public List<Employees> getAllEmployeesRows(){
        return employeesRepository.findAll();
    }

    public List<Products> getAllProductsRows(){
        return productsRepository.findAll();
    }

    public List<Tasks> getAllTasksRows(){
        return tasksRepository.findAll();
    }

    public List<Testers> getAllTestersRows(){
        return testersRepository.findAll();
    }

    /*-------------------------------------------sort-------------------------------------------------*/

    public <T> List<T> sortGroup(String column, String table, String order){
        if(table.equals("clients")){
            if (order.equals("ASC")){
                return (ArrayList<T>) clientsRepository.findAll(Sort.by(column));
            }else if (order.equals("DESC")){
                return (ArrayList<T>) clientsRepository.findAll(Sort.by(column).descending());
            }
        }
        if(table.equals("contracts")){
            if (order.equals("ASC")){
                return (ArrayList<T>) contractsRepository.findAll(Sort.by(column));
            }else if (order.equals("DESC")){
                return (ArrayList<T>) contractsRepository.findAll(Sort.by(column).descending());
            }
        }
        if(table.equals("developers")){
            if (order.equals("ASC")){
                return (ArrayList<T>) developersRepository.findAll(Sort.by(column));
            }else if (order.equals("DESC")){
                return (ArrayList<T>) developersRepository.findAll(Sort.by(column).descending());
            }
        }
        if(table.equals("employees")){
            if (order.equals("ASC")){
                return (ArrayList<T>) employeesRepository.findAll(Sort.by(column));
            }else if (order.equals("DESC")){
                return (ArrayList<T>) employeesRepository.findAll(Sort.by(column).descending());
            }
        }
        if(table.equals("private_info")){
            if (order.equals("ASC")){
                return (ArrayList<T>) privateRepository.findAll(Sort.by(column));
            }else if (order.equals("DESC")){
                return (ArrayList<T>) privateRepository.findAll(Sort.by(column).descending());
            }
        }
        if(table.equals("products")){
            if (order.equals("ASC")){
                return (ArrayList<T>) productsRepository.findAll(Sort.by(column));
            }else if (order.equals("DESC")){
                return (ArrayList<T>) productsRepository.findAll(Sort.by(column).descending());
            }
        }
        if(table.equals("tasks")){
            if (order.equals("ASC")){
                return (ArrayList<T>) tasksRepository.findAll(Sort.by(column));
            }else if (order.equals("DESC")){
                return (ArrayList<T>) tasksRepository.findAll(Sort.by(column).descending());
            }
        }
        if(table.equals("testers")){
            if (order.equals("ASC")){
                return (ArrayList<T>) testersRepository.findAll(Sort.by(column));
            }else if (order.equals("DESC")){
                return (ArrayList<T>) testersRepository.findAll(Sort.by(column).descending());
            }
        }
        return null;
    }

    public <T> List<T> sortWhere(T model){
        if(model instanceof Clients){
            Example<Clients> ex = Example.of((Clients) model);
            return (ArrayList<T>) clientsRepository.findAll(ex);
        }
        if(model instanceof Contracts){
            Example<Contracts> ex = Example.of((Contracts) model);
            return (ArrayList<T>) contractsRepository.findAll(ex);
        }
        if(model instanceof Developers){
            Example<Developers> ex = Example.of((Developers) model);
            return (ArrayList<T>) developersRepository.findAll(ex);
        }
        if(model instanceof Employees){
            Example<Employees> ex = Example.of((Employees) model);
            return (ArrayList<T>) employeesRepository.findAll(ex);
        }
        if(model instanceof Private){
            Example<Private> ex = Example.of((Private) model);
            return (ArrayList<T>) privateRepository.findAll(ex);
        }
        if(model instanceof Products){
            Example<Products> ex = Example.of((Products) model);
            return (ArrayList<T>) productsRepository.findAll(ex);
        }
        if(model instanceof Tasks){
            Example<Tasks> ex = Example.of((Tasks) model);
            return (ArrayList<T>) tasksRepository.findAll(ex);
        }
        if(model instanceof Testers){
            Example<Testers> ex = Example.of((Testers) model);
            return (ArrayList<T>) testersRepository.findAll(ex);
        }
        return null;
    }

    public <T> List<T> sortLike(String column, String table, String like){
        if(table.equals("clients")) {
            switch (column) {
                case "company": {
                    return (ArrayList<T>) clientsRepository.findByCompanyLike(like);
                }
                case "address": {
                    return (ArrayList<T>) clientsRepository.findByAddressLike(like);
                }
            }
        }
        if(table.equals("contracts")) {
            if(Objects.equals(column, "paymentState")){
                    return (ArrayList<T>) contractsRepository.findByPaymentStateLike(like);
            }
        }
        if(table.equals("developers")) {
            switch (column) {
                case "position": {
                    return (ArrayList<T>) developersRepository.findByPositionLike(like);
                }
                case "team": {
                    return (ArrayList<T>) developersRepository.findByTeamLike(like);
                }
            }
        }
        if(table.equals("employees")) {
            switch (column) {
                case "mail": {
                    return (ArrayList<T>) employeesRepository.findByMailLike(like);
                }
                case "workplace": {
                    return (ArrayList<T>) employeesRepository.findByWorkplaceLike(like);
                }
            }
        }
        if(table.equals("private_info")){
            switch (column){
                case "firstname": {
                    return (ArrayList<T>) privateRepository.findByFirstnameLike(like);
                }
                case "lastname": {
                    return (ArrayList<T>) privateRepository.findByLastnameLike(like);
                }
                case "phonenum": {
                    return (ArrayList<T>) privateRepository.findByPhonenumLike(like);
                }
                case "insurance": {
                    return (ArrayList<T>) privateRepository.findByInsuranceLike(like);
                }
                case "address": {
                    return (ArrayList<T>) privateRepository.findByAddressLike(like);
                }
            }
        }
        if(table.equals("products")) {
            switch (column) {
                case "productName": {
                    return (ArrayList<T>) productsRepository.findByProductNameLike(like);
                }
                case "version": {
                    return (ArrayList<T>) productsRepository.findByVersionLike(like);
                }
            }
        }
        if(table.equals("tasks")) {
            switch (column) {
                case "description": {
                    return (ArrayList<T>) tasksRepository.findByDescriptionLike(like);
                }
                case "team": {
                    return (ArrayList<T>) tasksRepository.findByTeamLike(like);
                }
            }
        }
        if(table.equals("testers")) {
            switch (column) {
                case "position": {
                    return (ArrayList<T>) testersRepository.findByPositionLike(like);
//                    return (ArrayList<T>) testersRepository.findByPositionLike(like);
                }
                case "team": {
                    return (ArrayList<T>) testersRepository.findByTeamLike(like);
                }
            }
        }
        return null;
    }

}
