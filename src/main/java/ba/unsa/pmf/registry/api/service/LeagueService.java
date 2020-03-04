package ba.unsa.pmf.registry.api.service;

import ba.unsa.pmf.registry.api.model.League;
import ba.unsa.pmf.registry.api.model.LeagueRequest;

import java.util.List;

/**
 * Provides methods for operations on league entity {@Link ba.unsa.pmf.registry.dao.entity.LeagueEntity}
 *
 * @author Muaz Kasumović
 *
 */
public interface LeagueService {

    /**
     * Retrieves all leagues persisted in database
     *
     * @return {@Link List of leagues}
     */
    List<League> findAll();

    /**
     * Persist league in database
     *
     * @param request containing required information about league
     * @return League persisted in database
     * */
    League create(LeagueRequest request);

    /**
     * Updates league in database
     * @param request containing league modification
     * @param  id league's id
     * @return League updated league
     */
    League update(Long id,LeagueRequest request);

    /**
     * Deletes league from database
     * @param id
     */
    void delete(Long id);
}
