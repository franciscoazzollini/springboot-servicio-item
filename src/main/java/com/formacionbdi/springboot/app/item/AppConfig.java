package com.formacionbdi.springboot.app.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    
    //Registro para inyectar un cliente  para acceder a recursos q estan en otros microservicios
    
    @Bean("clienteRest")
    public RestTemplate regustrarRestTemplate(){
        return new RestTemplate();
    }
}
