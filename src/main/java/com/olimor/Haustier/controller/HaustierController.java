package com.olimor.Haustier.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.olimor.Haustier.dto.HaustierDto;
import com.olimor.Haustier.modelo.Haustier;
import com.olimor.Haustier.repository.HaustierRepository;

@RestController // Trasformaçao a nossa classe em um controchmadoller bean  🫘
@RequestMapping( value = "/haustier") // Mapeamento a url, navegador chama pelo valor
public class HaustierController {
    
    @Autowired // Injecao de dependencia do repositorio, Spring faz isso automaticamente
    private HaustierRepository haustierRepository; // Repositorio que faz a comunicaçao com o banco de dados

    @GetMapping(value = "/imprimi")// mapeamento do metodo imprimir. Usando verbo get -> pegar buscar
    public void imprimir(){ // nao volta nada 
        System.out.println("chamou a funçao funcional altamente funcional do funcionario final");
    }

    @GetMapping(value = "/ola")
    public String ola (){ // retorno de String no navegador 
        return """
            <pre>
    ▀██▀─▄███▄─▀██─██▀██▀▀█  
    ─██─███─███─██─██─██▄█ 
    ─██─▀██▄██▀─▀█▄█▀─██▀█ 
    ▄██▄▄█▀▀▀─────▀──▄██▄▄█
            </pre>
        """; // devolve para quem chamou
    }
    
@GetMapping(value = "/animacao")
public String animacao() {
    return """
    <pre id="asciiBlink" style="font-family: monospace; white-space: pre; font-size: 14px;"></pre>

    <script>
      const frames = [
`─────────▄▄───────────────────▄▄──
────────▀█───────────────────▀█─
────────▄█───────────────────▄█─
──█████████▀───────────█████████▀─
───▄██████▄─────────────▄██████▄──
─▄██▀────▀██▄─────────▄██▀────▀██▄
─██────────██─────────██────────██
─██───██───██─────────██───██───██
─██────────██─────────██────────██
──██▄────▄██───────────██▄────▄██─
───▀██████▀─────────────▀██████▀──
───────────────────────────────
───────────────────────────────
───────────────────────────────
───────────█████████████──────────
───────────────────────────────
───────────────────────────────`,

`─────────▄▄───────────────────▄▄──
────────▀█───────────────────▀█─
────────▄█───────────────────▄█─
──█████████▀───────────█████████▀─
───▄██████▄─────────────▄██████▄──
─▄█████████▄──────────▄█████████▄
─██────────██─────────██────────██
─██───██───██─────────██───██───██
─██────────██─────────██────────██
──██▄────▄██───────────██▄────▄██─
───▀██████▀─────────────▀██████▀──
───────────────────────────────
───────────────────────────────
───────────────────────────────
───────────█████████████──────────
───────────────────────────────
───────────────────────────────`,

`─────────▄▄───────────────────▄▄──
────────▀█───────────────────▀█─
────────▄█───────────────────▄█─
──█████████▀───────────█████████▀─
───▄██████▄─────────────▄██████▄──
─▄█████████▄──────────▄█████████▄
─████████████─────────████████████
─██───██───██─────────██───██───██
─██────────██─────────██────────██
──██▄────▄██───────────██▄────▄██─
───▀██████▀─────────────▀██████▀──
───────────────────────────────
───────────────────────────────
───────────────────────────────
───────────█████████████──────────
───────────────────────────────
───────────────────────────────`,

`─────────▄▄───────────────────▄▄──
────────▀█───────────────────▀█─
────────▄█───────────────────▄█─
──█████████▀───────────█████████▀─
───▄██████▄─────────────▄██████▄──
─▄█████████▄──────────▄█████████▄
─████████████─────────████████████
─████████████─────────████████████
─██────────██─────────██────────██
──██▄────▄██───────────██▄────▄██─
───▀██████▀─────────────▀██████▀──
───────────────────────────────
───────────────────────────────
───────────────────────────────
───────────█████████████──────────
───────────────────────────────
───────────────────────────────`,

`─────────▄▄───────────────────▄▄──
────────▀█───────────────────▀█─
────────▄█───────────────────▄█─
──█████████▀───────────█████████▀─
───▄██████▄─────────────▄██████▄──
─▄█████████▄──────────▄█████████▄
─████████████─────────████████████
─████████████─────────████████████
─████████████─────────████████████
──██▄────▄██───────────██▄────▄██─
───▀██████▀─────────────▀██████▀──
───────────────────────────────
───────────────────────────────
───────────────────────────────
───────────█████████████──────────
───────────────────────────────
───────────────────────────────`,

`─────────▄▄───────────────────▄▄──
────────▀█───────────────────▀█─
────────▄█───────────────────▄█─
──█████████▀───────────█████████▀─
───▄██████▄─────────────▄██████▄──
─▄█████████▄──────────▄█████████▄
─████████████─────────████████████
─████████████─────────████████████
─████████████─────────████████████
──██████████───────────██████████─
───▀██████▀─────────────▀██████▀──
───────────────────────────────
───────────────────────────────
───────────────────────────────
───────────█████████████──────────
───────────────────────────────
───────────────────────────────`
      ];

      let current = 0;
      const el = document.getElementById('asciiBlink');
      function nextFrame() {
        el.textContent = frames[current];
        current = (current + 1) % frames.length;
      }
      nextFrame();
      setInterval(nextFrame, 500);
    </script>
    """;

}
    @GetMapping(value = "/lista")
    public List<Haustier> findAll() {
        return haustierRepository.findAll();
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<?> insert(@RequestBody HaustierDto haustierDto){
        Haustier haustier = haustierDto.NovoHuastier();
        System.out.println(haustier.toString());
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                                        .path("/id")
                                        .buildAndExpand(haustier.getId())
                                        .toUri();
        haustierRepository.save(haustier);
        return ResponseEntity.created(uri).body(haustier); 

    
}
}
