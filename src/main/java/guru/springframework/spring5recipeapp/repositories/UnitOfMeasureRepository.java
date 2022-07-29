package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {


    Optional<UnitOfMeasure> findDescription(String description);
}
