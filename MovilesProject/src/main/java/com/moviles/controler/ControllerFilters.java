package com.moviles.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/filters")
public class ControllerFilters {

    @GetMapping("find")
    public void get() {

    }

    @DeleteMapping("delete")
    public void delete() {

    }

    @PostMapping("create")
    public void post() {

    }

    @PutMapping("update")
    public void put() {

    }
}
