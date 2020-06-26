package io.codelearn.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/")
public class SecurityController {
 @GetMapping("status")
 public String status(){
     return "weelcome";
 }
}
