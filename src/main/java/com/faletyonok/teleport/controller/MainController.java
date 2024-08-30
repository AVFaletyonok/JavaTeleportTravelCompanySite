package com.faletyonok.teleport.controller;

import com.faletyonok.teleport.DTO.ClientDTO;
import com.faletyonok.teleport.entity.ClientProfile;
import com.faletyonok.teleport.repository.ClientRepo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Alexander Victorovich Faletyonok
 * @version 1.0
 * <p>
 *     Test web application "Java Teleport Travel Company"
 * </p>
 * https://github.com/AVFaletyonok/JavaTeleportTravelCompanySite
 */
@Tag(name = "main_methods")
@Slf4j // for logging
@RestController
@RequiredArgsConstructor
public class MainController {
//    @Autowired
    private final ClientRepo clientRepo;

    @GetMapping("/index")
    public ModelAndView mainPage() {
        return new ModelAndView("index");
    }

    @GetMapping("/api/hello")
    public String helloMethod() {
        return "Hello, people!";
    }

    @Operation(
            summary = "Add new client to the base.",
            description = "Get DTO of a client, gather it by builder" +
                    " and save it to the base."
    )
    @PostMapping("/api/addclient")
    public void addClient(@RequestBody ClientDTO clientDTO) {
        log.info("New row : " + clientRepo.save(ClientProfile.builder()
                                .name(clientDTO.getName())
                                .phone(clientDTO.getPhone())
                                .email(clientDTO.getEmail())
                                .build()));
    }

    @PutMapping("/api/addclient")
    public String changeClient(@RequestBody ClientProfile client) {
        if (!clientRepo.existsById(client.getId())) {
            return "No such client.";
        }
        log.info("Changed row : " + clientRepo.save(client));
        return client.toString();
    }

    @SneakyThrows
    @GetMapping("/api/all")
    public List<ClientProfile> getAll() {
        return clientRepo.findAll();
    }

    @GetMapping("/api")
    public ClientProfile getClient(@RequestParam long id) {
        return clientRepo.findById(id).orElseThrow();
    }

    @DeleteMapping("/api")
    public void deleteClient(@RequestParam long id) {
        clientRepo.deleteById(id);
    }
}
