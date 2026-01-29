package dev.skbconsultoria.CadastroDeFamilia;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class FamiliaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Bem vindo, essa é a mensagem inicial";
    }




}
