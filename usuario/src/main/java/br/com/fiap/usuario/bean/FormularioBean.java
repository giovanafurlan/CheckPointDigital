package br.com.fiap.usuario.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.fiap.usuario.dao.FormularioDao;
import br.com.fiap.usuario.model.Formulario;

@Named
@RequestScoped
public class FormularioBean {
	
	private Formulario formulario = new Formulario();
	private List<Formulario> list;
			
	public FormularioBean(){
		this.list = list();
	}
	
	public void save() {
		System.out.println(formulario);
		new FormularioDao().create(formulario);
	}
	
	public List<Formulario> list() {
		FormularioDao dao = new FormularioDao();
		List<Formulario> list = dao.listAll();
		return list;
	}

	public List<Formulario> getList() {
		return list;
	}

	public void setList(List<Formulario> list) {
		this.list = list;
	}

	public Formulario getFormulario() {
		return formulario;
	}

	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
	}
	
}
