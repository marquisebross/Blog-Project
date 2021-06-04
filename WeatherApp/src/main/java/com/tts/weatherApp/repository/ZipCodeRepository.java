package com.tts.weatherApp.repository;

import com.tts.weatherApp.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZipCodeRepository  extends CrudRepository<Request, Long> {


    List<Request> findAllByOrderByIdDesc();
}
