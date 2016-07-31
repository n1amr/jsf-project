package com.n1amr.learn.jsf;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity(name = "form")
@ManagedBean
@SessionScoped
public class FormBean implements Serializable {
	private String message = "message from bean";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private Collection<SelectItem> items = new ArrayList<SelectItem>();

	public Collection<SelectItem> getItems() {
		return items;
	}

	public void setItems(Collection<SelectItem> items) {
		this.items = items;
	}

	@PostConstruct
	public void init() {
		items.add(new SelectItem("one"));
		items.add(new SelectItem("two"));
	}
}
