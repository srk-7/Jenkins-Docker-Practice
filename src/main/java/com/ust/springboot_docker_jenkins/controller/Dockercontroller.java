package com.ust.springboot_docker_jenkins.controller;

import com.ust.springboot_docker_jenkins.model.DockerModel;
import com.ust.springboot_docker_jenkins.service.DockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class Dockercontroller {

    @Autowired
    public DockerService service;

    @PostMapping("/add")
    public DockerModel addData(@RequestBody DockerModel model){
        return service.addDockerData(model);
    }

    @GetMapping("/get")
    public List<DockerModel> getData(){
        return service.getDockerData();
    }

}
