package com.example.expensetracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;

@Service
public class ExpenseService {

    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo){
        this.repo = repo;
    }

    public List<Expense> getAllExpenses(){
        return repo.findAll();
    }

    public Expense createExpense(Expense expense){
        return repo.save(expense);
    }

    public void deleteExpense(Long id){
        repo.deleteById(id);
    }

    public Expense updateExpense(Long id, Expense updatedExpense) {
        Expense expense = repo.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));

        expense.setDescription(updatedExpense.getDescription());
        expense.setAmount(updatedExpense.getAmount());
        expense.setCategory(updatedExpense.getCategory());
        expense.setDate(updatedExpense.getDate());

        return repo.save(expense);
    }
}