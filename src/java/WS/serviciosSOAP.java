/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package WS;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author chris
 */

@WebService(serviceName = "serviciosSOAP")
public class serviciosSOAP {

    Usuario u;
    ArrayList<Usuario> misUsuarios = new ArrayList<>();

    /**
     * Web service operation
     * @param usuario
     * @param clave
     * @param repclave
     * @param saldoinical
     */
    
    @WebMethod(operationName = "registro")
    public void registro(@WebParam(name = "usuario") String usuario, @WebParam(name = "clave") String clave, @WebParam(name = "repclave") String repclave, @WebParam(name = "saldoinical") float saldoinical) {
        u = new Usuario(usuario, clave, repclave, saldoinical);
        misUsuarios.add(u);
    }

    /**
     * Web service operation
     * @param usuario
     * @param clave
     * @return 
     */
    
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "usuario") String usuario, @WebParam(name = "clave") String clave) {
        boolean validado = false;
        for (Usuario miUsuario : misUsuarios) {
            if (usuario.equals(miUsuario.getNombreUsuario()) && clave.equals(miUsuario.getClave())) {
                validado = true;
            }
        }
        return validado;
    }

    /**
     * Web service operation
     * @param usuario
     * @return 
     */
    
    @WebMethod(operationName = "saldo")
    public float saldo(@WebParam(name = "usuario") String usuario) {
        //TODO write your implementation code here:
        float ultSaldo = 0;
        for (Usuario miUsuario : misUsuarios) {
            if (usuario.equals(miUsuario.getNombreUsuario())) {
                ultSaldo = miUsuario.getSaldoinicial();
            }
        }
        return ultSaldo;
    }

    /**
     * Web service operation
     * @param saldo
     * @param usuario
     */
    
    @WebMethod(operationName = "depositar")
    public void depositar(@WebParam(name = "saldo") float saldo, @WebParam(name = "usuario") String usuario) {
        //TODO write your implementation code here:
        for (Usuario miUsuario : misUsuarios) {
            if (usuario.equals(miUsuario.getNombreUsuario())) {
                float ultSaldo = miUsuario.getSaldoinicial();
                miUsuario.setSaldoinicial(ultSaldo + saldo);
            }
        }
    }

    /**
     * Web service operation
     * @param valor
     * @param usuario
     */
    
    @WebMethod(operationName = "retirar")
    public void retirar(@WebParam(name = "valor") float valor, @WebParam(name = "usuario") String usuario) {
        //TODO write your implementation code here:
        for (Usuario miUsuario : misUsuarios) {
            if (usuario.equals(miUsuario.getNombreUsuario())) {
                float ultSaldo = miUsuario.getSaldoinicial();
                miUsuario.setSaldoinicial(ultSaldo - valor);
            }
        }

    }

}
