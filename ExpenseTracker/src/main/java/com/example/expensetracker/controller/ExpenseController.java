package com.example.expensetracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service){
        this.service = service;
    }

    @GetMapping
    public List<Expense> getExpenses(){
        return service.getAllExpenses();
    }

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense){
        return service.createExpense(expense);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id){
        service.deleteExpense(id);
    }

    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id, @RequestBody Expense expense){
        return service.updateExpense(id, expense);
    }
}