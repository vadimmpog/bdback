package com.example.shopback.services;

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

    
}