package com.keegan.android.todov1;

public class ToDo {
    private int id;
    private String task;

    public ToDo(int newID, String newTask)
    {
        setId(newID);
        setTask(newTask);
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getTask() {return task;}

    public void setTask(String task) {this.task = task;}
}
