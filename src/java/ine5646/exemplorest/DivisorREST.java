/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646.exemplorest;

import com.google.gson.Gson;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Adriano Lima
 */
@Path("divisores/{numero}")
public class DivisorREST {

    @GET
    @Produces("application/json")
    public String divisores(@PathParam("numero") int numero) {

        List<Integer> listaDivisores = null;

        for (int i = 1; i <= numero; i++) {
            
            if (numero % i == 0) {
                listaDivisores.add(i);
            }
        }
        
        return new Gson().toJson(listaDivisores);
    }
}
