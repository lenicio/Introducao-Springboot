package br.com.zorp.curso.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping
  public String olaMundo() {
    return "Hello World Get";
  }

  @PostMapping
  public void olaMundoPost(@RequestBody String data) {
    System.out.println(data);;
  }

  @PutMapping
  public String olaMundoPut() {
    return "Hello World Put";
  }

  @DeleteMapping
  public String olaMundoDelete() {
    return "Hello World Delete";
  }
}
