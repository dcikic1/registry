package ba.unsa.pmf.registry.api.service;

import ba.unsa.pmf.registry.api.model.Game;
import ba.unsa.pmf.registry.api.model.OfficialRequest;
import ba.unsa.pmf.registry.api.model.WinLossDiff;

import java.util.List;

/**
 * Provides methods for operations on game entity {@Link ba.unsa.pmf.registry.dao.entity.GameEntity}
 *
 * @author Dino Čikić
 *
 */

public interface GameService {
    /**
     * Persist game in database
     *
     * @param game containing required information about game
     * @return Game persisted in database
     * */

    Game insert(Game game);

    /**
     * Updates game in database
     * @param id containing officials modification
     * @param  id games's id
     * @return Game updated game
     */

    Game updateOfficials(Long id, OfficialRequest officialRequest);

    /**
     * Updates game in database
     * @param id containing table officials modification
     * @param  id games's id
     * @return Game updated game
     */

    Game updateTableOffcs(Long id, OfficialRequest officialRequest);

    /**
     * Deletes game from database
     * @param id
     */

    void delete(Long id);

    /**
     * Updates game in database
     * @param officialId containing  official1's modification
     * @param  id games's id
     * @return Game updated game
     */

    Game updateOfficial1(Long id, Long officialId);

    /**
     * Updates game in database
     * @param officialId containing  official2's modification
     * @param  id games's id
     * @return Game updated game
     */

    Game updateOfficial2(Long id, Long officialId);

    /**
     * Updates game in database
     * @param officialId containing  official3's modification
     * @param  id games's id
     * @return Game updated game
     */

    Game updateOfficial3(Long id, Long officialId);

    /**
     * Updates game in database
     * @param officialId containing table official writer's  modification
     * @param  id games's id
     * @return Game updated game
     */

    Game updateTableOffcWriter(Long id, Long officialId);

    /**
     * Updates game in database
     * @param officialId containing table official time's modification
     * @param  id games's id
     * @return Game updated game
     */

    Game updateTableOffcTime(Long id, Long officialId);

    /**
     * Updates game in database
     * @param officialId containing table official shot clock's  modification
     * @param  id games's id
     * @return Game updated game
     */

    Game updateTableOffcShtClock(Long id, Long officialId);

    /**
     * Updates game in database
     * @param score containing home team score  modification
     * @param  id games's id
     * @return Game updated game
     */

    Game updateHomeTeamScore(Long id, Long score);

    /**
     * Updates game in database
     * @param score containing away team score  modification
     * @param  id games's id
     * @return Game updated game
     */

    Game updateAwayTeamScore(Long id, Long score);

    /**
     * Retrieves all home team scores persisted in database
     *
     * @return {@Link List of scores}
     */

    List<Long> getHomeTeamScrs(Long homeTeamId);

    /**
     * Retrieves all away team scores persisted in database
     *
     * @return {@Link List of scores}
     */

    List<Long> getAwayTeamScrs(Long awayTeamId);

    /**
     * Retrieves all games in league persisted in database
     * @param leagueId league's id
     * @return {@Link List of games}
     */

    List<Game> getGamesInLeague(Long leagueId);

    /**
     * Retrieves all games of table official persisted in database
     * @param tableOfficialId table official's id
     * @return {@Link List of games}
     */

    List<Game> getGamesOfTbleOfficl(Long tableOfficialId);

    /**
     * Retrieves all games of  official persisted in database
     * @param officialId  official's id
     * @return {@Link List of games}
     */

    List<Game> getGamesOfOfficial(Long officialId);


    WinLossDiff getWinLossDiff(Long teamId, Long leagueId);

    /**
     * Retrieves all leagues persisted in database
     *
     * @return {@Link List of games}
     */
    List<Game> findAllGames();
}
