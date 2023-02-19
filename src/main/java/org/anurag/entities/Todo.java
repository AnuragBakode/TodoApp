package org.anurag.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int todoId;
	private String todotitle;
	private String todoContent;
	private Date todoDate;
	public Todo(String todotitle, String todoContent, Date todoDate) {
		super();
		this.todotitle = todotitle;
		this.todoContent = todoContent;
		this.todoDate = todoDate;
	}
	public String getTodotitle() {
		return todotitle;
	}
	public void setTodotitle(String todotitle) {
		this.todotitle = todotitle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public Date getTodoDate() {
		return todoDate;
	}
	public void setTodoDate(Date todoDate) {
		this.todoDate = todoDate;
	}
	@Override
	public String toString() {
		return "Todo [todotitle=" + todotitle + ", todoContent=" + todoContent + ", todoDate=" + todoDate + "]";
	}
	public Todo() {
	}
	
	
}

