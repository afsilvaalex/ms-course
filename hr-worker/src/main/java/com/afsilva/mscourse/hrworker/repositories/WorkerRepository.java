package com.afsilva.mscourse.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afsilva.mscourse.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
