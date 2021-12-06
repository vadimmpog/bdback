package com.example.bdback.services;

import com.example.bdback.models.*;
import com.example.bdback.repos.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
        if (table.equals("private_info")){
            privateRepository.deleteById(id);
            return "Row deleted successful";
        }
        if (table.equals("clients")){
            clientsRepository.deleteById(id);
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
