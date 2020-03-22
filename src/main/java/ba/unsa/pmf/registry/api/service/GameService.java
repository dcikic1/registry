package ba.unsa.pmf.registry.api.service;

import ba.unsa.pmf.registry.api.model.Game;
import ba.unsa.pmf.registry.api.model.OfficialRequest;

import java.util.List;

public interface GameService {
    Game insert(Game game);

    Game updateOfficials(Long id, OfficialRequest officialRequest);

    Game updateTableOffcs(Long id, OfficialRequest officialRequest);

    void delete(Long id);

    Game updateOfficial1(Long id, Long officialId);

    Game updateOfficial2(Long id, Long officialId);

    Game updateOfficial3(Long id, Long officialId);

    Game updateTableOffcWriter(Long id, Long officialId);

    Game updateTableOffcTime(Long id, Long officialId);

    Game updateTableOffcShtClock(Long id, Long officialId);

    Game updateHomeTeamScore(Long id, Long score);

    Game updateHomeAwayScore(Long id, Long score);

    List<Long> getHomeTeamScrs(Long homeTeamId);

    List<Long> getAwayTeamScrs(Long awayTeamId);

    List<Game> getGamesInLeague(Long leagueId);

    List<Game> getGamesOfTbleOfficl(Long tableOfficialId);

    List<Game> getGamesOfOfficial(Long officialId);
}
