package br.ce.wcaquino.entidades;

import java.util.Objects;

public class Prova {

	private float nota;

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prova other = (Prova) obj;
		return Float.floatToIntBits(nota) == Float.floatToIntBits(other.nota);
	}

	public Prova(float nota) {
		super();
		this.nota = nota;
	}
	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
}