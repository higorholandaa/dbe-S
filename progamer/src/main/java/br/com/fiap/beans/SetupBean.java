package br.com.fiap.beans;

import javax.faces.bean.ManagedBean;

import br.com.fiap.dao.SetupDAO;
import br.com.fiap.model.Setup;

@ManagedBean
public class SetupBean {
	
	private Setup setup = new Setup();

	public void save() {
		new SetupDAO().save(this.setup);
		System.out.println("salvando setup..." + this.setup);
	}
	
	public void executar() {
		System.out.println("acionando o bean");
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}
	
	


}
