package com.gildra.players.controller;

import com.gildra.players.dto.ExampleDto;
import com.gildra.players.service.IPlayersExample;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/test")
public class TestController {

    @Autowired
    private IPlayersExample playersExample;

    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint(){
        return ResponseEntity.ok("Testing");
    }

    @GetMapping("/testGetter")
    public ResponseEntity<ExampleDto> testPostEndpoint(@RequestParam Long id) {
        return ResponseEntity.ok(playersExample.findExampleById(id));
    }
}
