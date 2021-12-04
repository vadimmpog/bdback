package com.example.shopback.services;

import com.example.shopback.models.Private;
import com.example.shopback.repos.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TableService {

    private final ClientsRepository clientsRepository;
    private final ContractsRepository contractsRepository;
    private final DevelopersRepository developersRepository;
    private final EmployeesRepository employeesRepository;
    private final PrivateRepository privateRepository;
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

    public <T> String deleteRow(T model){
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
                Private old = privateRepository.findById(id).get();
                s.update(old);
                privateRepository.save(s);
                return "Row updated successful";
            }
            return "No row with such id";
        }
        return null;
    }
}
