package application.demo.mcsclient.service;

import application.demo.mcsclient.domain.Client;
import application.demo.mcsclient.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    @Transactional
    public Client save(Client client){
        return clientRepository.save(client);
    }

    public Optional<Client> getByCpf(String cpf){
        return clientRepository.findByCpf(cpf);
    }
}
