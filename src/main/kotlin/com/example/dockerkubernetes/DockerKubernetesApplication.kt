package com.example.dockerkubernetes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerKubernetesApplication

fun main(args: Array<String>) {
	runApplication<DockerKubernetesApplication>(*args)
}
