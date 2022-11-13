package com.keegan.android.todov1;

import android.content.Context;

import androidx.appcompat.widget.AppCompatButton;

public class ToDoButton extends AppCompatButton {
    private ToDo todo;

    public ToDoButton(Context context, ToDo newToDo)
    {
        super(context);
        todo = newToDo;
    }
}
