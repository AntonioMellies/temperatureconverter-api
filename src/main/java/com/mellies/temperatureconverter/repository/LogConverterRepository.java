package com.mellies.temperatureconverter.repository;

import com.mellies.temperatureconverter.model.LogConverter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogConverterRepository extends CrudRepository<LogConverter,Long> {
}
