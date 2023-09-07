package com.example.demo.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.entities.TravelPackage;
@RepositoryRestResource
public interface TravelPackageRepository extends JpaRepository<TravelPackage, Integer> {

}
