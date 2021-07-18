package com.upgrad.sarang.DSA.Queue;
import java.util.*;
public class ToDoListUsingQueue {
    public static void main(String[] args) {
        MyQueue<String> todolist = new MyQueue<String>();

        makeToDoList(todolist);
        doAllTasks(todolist);

    }

    public static void makeToDoList(MyQueue<String> todolist) {
        todolist.add("task 1");
        todolist.add("task 2");
        todolist.add("task 3");
        todolist.add("task 4");
    }

    public static void doAllTasks(MyQueue<String> todolist) {
        while (todolist.size() != 0) {
            System.out.println(todolist.remove());
        }
    }
}

class MyQueue<T> {

    private LinkedList<T> list = new LinkedList<T>();

    public void add(T el) {
        this.list.add(el);
    }

    public T remove() {
        return this.list.remove();
    }

    public int size() {
        return this.list.size();
    }
}
