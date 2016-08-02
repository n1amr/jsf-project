package com.n1amr.learn.jsf.planets;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class Planetarium implements Serializable {
	private String selectedPlanet;

	public String getSelectedPlanet() {
		return selectedPlanet;
	}

	public String changePlanet() {
		return selectedPlanet;
	}
}
