package com.example.ToDoApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ToDo {
    private String ID;
    private String toDoName;
    private Boolean status;
}
