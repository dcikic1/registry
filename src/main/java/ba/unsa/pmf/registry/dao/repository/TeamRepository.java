package ba.unsa.pmf.registry.dao.repository;

import ba.unsa.pmf.registry.api.model.Team;
import ba.unsa.pmf.registry.dao.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity,Long> {


@Query("select t from TeamEntity  t  where t.league.id =:leagueId")
     List<TeamEntity> findTeamsByLegaueId(@Param("leagueId") Long leagueId);
}