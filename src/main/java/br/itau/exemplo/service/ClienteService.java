package br.itau.exemplo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.itau.exemplo.clienteApi.Cliente;
import br.itau.exemplo.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRespository;

    public Cliente buscar(Integer id) {
        Optional<Cliente> cliObj = clienteRespository.findById(id);

        return cliObj.orElse(null);
    }
}
