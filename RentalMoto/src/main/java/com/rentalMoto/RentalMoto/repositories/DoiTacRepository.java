package com.rentalMoto.RentalMoto.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rentalMoto.RentalMoto.models.DoiTac;

@Repository
public interface DoiTacRepository extends JpaRepository<DoiTac, Integer>{
	@Query(value = "SELECT * FROM doi_tac WHERE ten LIKE %?1%", nativeQuery = true)
	List<DoiTac> findByName(String name);
}
