package com.n1amr.learn.jsf.test;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@ManagedBean
@SessionScoped
public class TestFormBean implements Serializable {

	private Object selection;
	private Collection<SelectItem> selectItems;

	public TestFormBean() {
	}

	@PostConstruct
	public void init() {
		selectItems = new ArrayList<SelectItem>();
		selectItems.add(new SelectItem(1, "one"));
		selectItems.add(new SelectItem(2, "two"));
		selectItems.add(new SelectItem(3, "three"));
		selectItems.add(new SelectItem(4, "four"));
	}

	public String submitAction() {

		return null;
	}

	public void setSelection(Object selection) {
		this.selection = selection;
	}

	public Object getSelection() {
		return selection;
	}

	public Collection<SelectItem> getSelectItems() {
		return selectItems;
	}

	public void setSelectItems(Collection<SelectItem> selectItems) {
		this.selectItems = selectItems;
	}
}
