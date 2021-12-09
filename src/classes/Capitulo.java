package classes;

import java.util.ArrayList;
import java.util.List;

public class Capitulo {
	
	private String contexto;//HistoriaAtual
	private List<Capitulo> proximosCapitulos= new ArrayList<>();
	private String resumo;
	private int energia;
	
	
	public Capitulo(String contexto, String resumo, int energia) {
		super();
		this.contexto = contexto;
		this.resumo = resumo;
		this.energia = energia;
	}
	public boolean continuar()
	{
		if(proximosCapitulos.size() < 2 )
			return false;
		return true;
	}
	
	public String getContexto() {
		return contexto;
	}

	public void setContexto(String contexto) {
		this.contexto = contexto;
	}

	public List<Capitulo> getProximosCapitulos() {
		return proximosCapitulos;
	}

	public void setProximosCapitulos(List<Capitulo> proximosCapitulos) {
		this.proximosCapitulos = proximosCapitulos;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public void adicionarCapitulo(Capitulo capitulo)
	{      // Adicionar condição de não por mais que dois
		proximosCapitulos.add(capitulo);
	}

	@Override
	public String toString()
	{
		return resumo;
	}
	

}
