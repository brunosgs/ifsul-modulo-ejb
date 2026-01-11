package ifsul.modulo.ejb.bean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateless;

@Stateless
public class DataHoraBean implements Serializable {
    private static final long serialVersionUID = 1L;

    public DataHoraBean() {
	System.out.println("Usuou o construtor do bean data hora");
    }

    public String getDataHoraServidor() {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:nnn");

	return dtf.format(LocalDateTime.now());
    }

    @PostConstruct
    public void iniciar() {
	System.out.println("Usou o método iniciar do bean data hora");
    }

    @PreDestroy
    public void destrui() {
	System.out.println("Usou o método destruir do bean data hora");
    }

}
