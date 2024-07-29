package com.ust.springboot_docker_jenkins.service;

import com.ust.springboot_docker_jenkins.model.DockerModel;
import com.ust.springboot_docker_jenkins.repository.DockerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DockerService {

    @Autowired(required=true)
    public DockerRepository repo;

    public List<DockerModel> getDockerData() {
        return repo.findAll();
    }

    public DockerModel addDockerData(DockerModel model) {
        return repo.save(model);
    }
}
