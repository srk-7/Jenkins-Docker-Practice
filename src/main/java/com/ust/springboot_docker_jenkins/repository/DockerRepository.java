package com.ust.springboot_docker_jenkins.repository;

import com.ust.springboot_docker_jenkins.model.DockerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DockerRepository extends JpaRepository<DockerModel,Integer> {
}
