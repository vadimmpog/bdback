package com.example.shopback.services;

import com.example.shopback.models.*;
import com.example.shopback.repos.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

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
        if (model instanceof Private){
            Private s = (Private) model;
            privateRepository.save(s);
            return "Row saved successful";
        }
        return null;
    }

    public <T> String deleteRow(Integer id, T model){
        if (model instanceof Private){
            Private s = (Private) model;
            privateRepository.deleteById(s.getId());
            return "Row deleted successful";
        }
        return null;
    }

    public <T> String updateRow(T model){
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

    /*-------------------------------------------?sort?-------------------------------------------------*/

    public <T> List<T> sortGroup(String row, T model){
        return null;
    }
    public <T> List<T> sortWhere(String row, T model){
        return null;
    }
    public <T> List<T> sortLike(String row, T model){

        return null;
    }

}
