package br.itau.exemplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.itau.exemplo.clienteApi.Cliente;
import br.itau.exemplo.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteRespource {

    @Autowired
    private ClienteService clienteService;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> listar(@PathVariable Integer id) {
        
        Cliente objCli = clienteService.buscar(id);

        return ResponseEntity.ok().body(objCli);
    }
}
