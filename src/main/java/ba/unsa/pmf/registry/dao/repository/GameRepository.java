package ba.unsa.pmf.registry.dao.repository;

import ba.unsa.pmf.registry.api.model.Game;
import ba.unsa.pmf.registry.dao.entity.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<GameEntity,Long> {

    @Query("select g.homeScore from GameEntity g where g.homeTeamId =:homeTeamId")
    List<Game> findHomeScoresByHomeId(@Param("homeTeamId")Long homeTeamId);

    @Query("select g.awayScore from GameEntity g where g.awayTeamId =:awayTeamId")
    List<Game> findAwayScoresByAwayId(@Param("awayTeamId") Long awayTeamId);

    @Query("select g from GameEntity g where g.leagueId =:leagueId")
    List<GameEntity> findGamesByLeagueId(@Param("leagueId") Long leagueId);

    @Query("select g from GameEntity g where g.tableOfficialWriterId =:tableOfficialId or g.tableOfficialTimeId =:tableOfficialId " +
            "or g.tableOfficialShotClockId =:tableOfficialId" )
    List<GameEntity> findGamesOfTbleOffficl(@Param("tableOfficialId") Long tableOfficialId);

    @Query("select g from GameEntity g where g.official1Id =:officialId or g.official2Id =:officialId or g.official3Id =:officialId")
    List<GameEntity> findGamesOfOfficial(@Param("officialId") Long officialId);

    @Query("select g from GameEntity g where (g.homeTeamId =:teamId or g.awayTeamId =:teamId) and g.leagueId =:leagueId")
    List<GameEntity> findGamesByTeamAndLeague(@Param("teamId") Long teamId, @Param("leagueId") Long leagueId);


}
