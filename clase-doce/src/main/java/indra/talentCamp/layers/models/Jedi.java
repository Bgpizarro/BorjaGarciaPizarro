package indra.talentCamp.layers.models;

import java.awt.Color;

public class Jedi extends BusinessObject{

	private String nombre;
	private int nivelFuerza;
	private Color colorLightsaber;
	public Jedi(String nombre, int nivelFuerza, Color colorLightsaber) {
		super();
		this.nombre = nombre;
		this.nivelFuerza = nivelFuerza;
		this.colorLightsaber = colorLightsaber;
	}
	
	public Jedi(String nombre, Color colorLightsaber) {
		super();
		this.nombre = nombre;
		this.nivelFuerza = 0;
		this.colorLightsaber = colorLightsaber;
	}
	public String getNombre() {
		return nombre;
	}
	public int getNivelFuerza() {
		return nivelFuerza;
	}
	public Color getColorLightsaber() {
		return colorLightsaber;
	}
	
	public void setNivelDeFuerza(int Fuerza) {
		this.nivelFuerza=Fuerza;
	}
	
	@Override
	public String toString() {
		return "Jedi [Id=" + getId() + ", nombre=" + nombre + ", nivelDeFuerza=" + getNivelFuerza() + ", colorSable=" + getColorLightsaber().getRGB()+"]";
	}
	
}
