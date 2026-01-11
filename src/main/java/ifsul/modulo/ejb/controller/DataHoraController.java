package ifsul.modulo.ejb.controller;

import java.io.Serializable;

import ifsul.modulo.ejb.bean.DataHoraBean;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("dataHora")
@RequestScoped
public class DataHoraController implements Serializable {
    private static final long serialVersionUID = 1L;

    @EJB
    private DataHoraBean dataHoraBean;

    public DataHoraController() {
	System.out.println("Criou a instancia do DataHoraController");
    }

    public String getDataHoraServidor() {
	if (dataHoraBean != null) {
	    return dataHoraBean.getDataHoraServidor();
	}

	return "Não foi possível retornar a data";
    }

}
