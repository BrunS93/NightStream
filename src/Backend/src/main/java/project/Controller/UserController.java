package project.Controller;

import org.springframework.web.bind.annotation.*;
import project.Models.Dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;

@RestController
@AllArgsConstructor
@RequestMapping("/user")

public class UserController {


    @GetMapping("/get")
    public ResponseEntity<String>Getting(){

        return ResponseEntity.ok().body("gettting");
    }

    @PostMapping("/register")
    public ResponseEntity<String>create(@RequestBody UserDto userDto){

    return ResponseEntity.ok().body("CREADO");
    }
}
