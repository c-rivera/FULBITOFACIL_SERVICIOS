/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package upc.iluminados.webservice;

import javax.jws.WebService;
import upc.iluminados.modelo.AlquilerCancha;
import upc.iluminados.modelo.Bean;
import upc.iluminados.modelo.Usuario;

/**
 *
 * @author Cesar
 */

@WebService(endpointInterface = "upc.iluminados.webservice.ServiciosRegistrarDuenio")
public class ServiciosRegistrarDuenioImpl implements ServiciosRegistrarDuenio{

	@Override
	public Bean registrar(Usuario vo) {
		// TODO Auto-generated method stub
		Bean resultado = new Bean();
		resultado.setStatus("OK");
		return resultado;
	}

	

}
