package application.demo.mcsclient.dto;

import application.demo.mcsclient.domain.Client;
import lombok.Data;

@Data
public class ClientRequest {

    private String cpf;
    private String nome;
    private Integer idade;

    public Client toModel(){
        return new Client(cpf, nome, idade);

    }
}
