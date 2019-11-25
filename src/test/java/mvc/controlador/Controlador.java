package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.frmPrincipal;
import mvc.vista.ifrmDesarrollador;
import tcs.semillero.diego.proyMercadoLibre.runners.RunnerEmergente;
import tcs.semillero.diego.proyMercadoLibre.runners.RunnerInicioSesion;

public class Controlador implements ActionListener {
	private frmPrincipal objfrmPrincipal;
	private ifrmDesarrollador objifrmDesarrollador;
	private RunnerInicioSesion objRunnerInicioSesion;
	private RunnerEmergente objRunnerEmergente;
	
	
	public Controlador() {
		objfrmPrincipal= new frmPrincipal();
		objifrmDesarrollador= new ifrmDesarrollador();
		
		objfrmPrincipal.getDskEscritorio().add(objifrmDesarrollador);
		
		
		objfrmPrincipal.getJmiDesarrollador().addActionListener(this);
		objfrmPrincipal.getJmiPruebasLogin().addActionListener(this);
		objfrmPrincipal.getJmiPruebasCheck().addActionListener(this);
		objfrmPrincipal.getJmiSalir().addActionListener(this);
		
		objfrmPrincipal.setVisible(true);
	}
	public void actionPerformed(ActionEvent objActionEvent) {
		if(objActionEvent.getSource()==objfrmPrincipal.getJmiSalir()) {
			System.exit(0);
		}else if(objActionEvent.getSource()==objfrmPrincipal.getJmiDesarrollador()) {
			objifrmDesarrollador.setVisible(true);
		}else if(objActionEvent.getSource()==objfrmPrincipal.getJmiPruebasLogin()) {
			objRunnerInicioSesion= new RunnerInicioSesion();
		}
		else if(objActionEvent.getSource()==objfrmPrincipal.getJmiPruebasCheck()) {
			objRunnerEmergente= new RunnerEmergente();
			
		}
		
	}

	
}
