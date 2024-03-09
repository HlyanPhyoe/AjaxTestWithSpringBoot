package com.ajax.test.Repository;

import com.ajax.test.Model.Township;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TownshipRepository extends JpaRepository<Township,Integer> {
    List<Township> findTownshipByCity_Id(int cityId);
}
