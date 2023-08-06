package com.sahibinden.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.sahibinden.entity.Place;

@Repository
	public interface PlaceRepository extends PagingAndSortingRepository<Place, Integer>, JpaRepository<Place, Integer> {

	//List<Place> search(String keyword);

}
