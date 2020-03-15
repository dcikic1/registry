package ba.unsa.pmf.registry.dao.repository;


import ba.unsa.pmf.registry.dao.entity.LeagueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends JpaRepository<LeagueEntity, Long> {


}
