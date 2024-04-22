package ua.kpi.its.lab.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.kpi.its.lab.rest.entity.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {
}
