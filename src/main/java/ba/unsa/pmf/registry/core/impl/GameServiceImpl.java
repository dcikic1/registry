package ba.unsa.pmf.registry.core.impl;

import ba.unsa.pmf.registry.api.model.Game;
import ba.unsa.pmf.registry.api.model.OfficialRequest;
import ba.unsa.pmf.registry.api.model.WinLossDiff;
import ba.unsa.pmf.registry.api.service.GameService;
import ba.unsa.pmf.registry.core.mapper.GameMapper;
import ba.unsa.pmf.registry.dao.entity.GameEntity;
import ba.unsa.pmf.registry.dao.repository.GameRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GameServiceImpl implements GameService {

    GameMapper gameMapper;
    GameRepository gameRepository;


    @Override
    public Game insert(Game game) {

        GameEntity newGame = gameMapper.dtoToEntity(game);

        newGame.setAwayScore(game.getAwayScore());
        newGame.setHomeScore(game.getHomeScore());
        newGame.setHomeTeamId(game.getHomeTeamId());
        newGame.setAwayTeamId(game.getAwayTeamId());
        newGame.setLeagueId(game.getLeagueId());
        newGame.setOfficial1Id(game.getOfficial1Id());
        newGame.setOfficial2Id(game.getOfficial2Id());
        newGame.setOfficial3Id(game.getOfficial3Id());
        newGame.setTableOfficialShotClockId(game.getTableOfficialShotClockId());
        newGame.setTableOfficialTimeId(game.getTableOfficialTimeId());
        newGame.setTableOfficialWriterId(game.getTableOfficialWriterId());
        newGame.setTableOfficialWriterAssistantId(game.getTableOfficialWriterAssistantId());

        newGame.setCreatedBy("Dino");
        newGame.setModified(LocalDateTime.now());
        //newGame.setCreated(LoacalDateTime.now());

        newGame = gameRepository.save(newGame);
        return gameMapper.entityToDto(newGame);
    }

    @Override
    public Game updateOfficials(Long id, OfficialRequest officialRequest) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        gameEntity.setModfiedBy("Savez");

        gameEntity.setOfficial1Id(officialRequest.getOfficial1Id());
        gameEntity.setOfficial2Id(officialRequest.getOfficial2Id());
        gameEntity.setOfficial3Id(officialRequest.getOfficial3Id());

        gameEntity= gameRepository.save(gameEntity);
        return gameMapper.entityToDto(gameEntity);
    }

    @Override
    public Game updateTableOffcs(Long id, OfficialRequest officialRequest) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        gameEntity.setModfiedBy("Savez");

        gameEntity.setTableOfficialWriterId(officialRequest.getOfficial1Id());
        gameEntity.setTableOfficialTimeId(officialRequest.getOfficial2Id());
        gameEntity.setTableOfficialShotClockId(officialRequest.getOfficial3Id());

        gameEntity= gameRepository.save(gameEntity);
        return gameMapper.entityToDto(gameEntity);
    }

    @Override
    public void delete(Long id) {gameRepository.deleteById(id);}

    @Override
    public Game updateOfficial1(Long id, Long officialId) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        gameEntity.setModfiedBy("Savez");

        gameEntity.setOfficial1Id(officialId);

        gameEntity= gameRepository.save(gameEntity);

        return gameMapper.entityToDto(gameEntity);
    }

    @Override
    public Game updateOfficial2(Long id, Long officialId) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        gameEntity.setModfiedBy("Savez");

        gameEntity.setOfficial2Id(officialId);

        gameEntity= gameRepository.save(gameEntity);

        return gameMapper.entityToDto(gameEntity);
    }

    @Override
    public Game updateOfficial3(Long id, Long officialId) {

        GameEntity gameEntity = gameRepository.findById(id).get();
        gameEntity.setModfiedBy("Savez");

        gameEntity.setOfficial3Id(officialId);

        gameEntity= gameRepository.save(gameEntity);

        return gameMapper.entityToDto(gameEntity);
    }

    @Override
    public Game updateTableOfficialWriter(Long id, Long officialId) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        gameEntity.setModfiedBy("Savez");

        gameEntity.setTableOfficialWriterId(officialId);

        gameEntity= gameRepository.save(gameEntity);

        return gameMapper.entityToDto(gameEntity);
    }

    @Override
    public Game updateTableOfficialTime(Long id, Long officialId) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        gameEntity.setModfiedBy("Savez");

        gameEntity.setTableOfficialTimeId(officialId);

        gameEntity= gameRepository.save(gameEntity);

        return gameMapper.entityToDto(gameEntity);
    }

    @Override
    public Game updateTableOfficialShotClock(Long id, Long officialId) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        gameEntity.setModfiedBy("Savez");

        gameEntity.setTableOfficialShotClockId(officialId);

        gameEntity= gameRepository.save(gameEntity);

        return gameMapper.entityToDto(gameEntity);
    }

    @Override
    public Game updateHomeTeamScore(Long id, Long score) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        gameEntity.setModfiedBy("Savez");

        gameEntity.setHomeScore(score);

        gameEntity= gameRepository.save(gameEntity);

        return gameMapper.entityToDto(gameEntity);
    }

    @Override
    public Game updateAwayTeamScore(Long id, Long score) {
        GameEntity gameEntity = gameRepository.findById(id).get();
        gameEntity.setModfiedBy("Savez");

        gameEntity.setAwayScore(score);

        gameEntity= gameRepository.save(gameEntity);

        return gameMapper.entityToDto(gameEntity);
    }

    @Override
    public List<Long> getHomeTeamScores(Long homeTeamId) {
        List<Long> homeScores= gameRepository.findHomeScoresByHomeId(homeTeamId);
        return homeScores;
    }

    @Override
    public List<Long> getAwayTeamScores(Long awayTeamId) {
        List<Long> awayScores= gameRepository.findAwayScoresByAwayId(awayTeamId);
        return awayScores;
    }

    @Override
    public List<Game> getGamesInLeague(Long leagueId) {
        List<GameEntity>gameEntities= gameRepository.findGamesByLeagueId(leagueId);
        return gameMapper.entitiesToDtos(gameEntities);
    }

    @Override
    public List<Game> getGamesOfTableOfficial(Long tableOfficialId) {
        List<GameEntity>gameEntities= gameRepository.findGamesOfTbleOffficl(tableOfficialId);
        return gameMapper.entitiesToDtos(gameEntities);
    }

    @Override
    public List<Game> getGamesOfOfficial(Long officialId) {
        List<GameEntity>gameEntities = gameRepository.findGamesOfOfficial(officialId);
        return gameMapper.entitiesToDtos(gameEntities);
    }

    @SuppressWarnings("Duplicates")
    @Override
    public WinLossDiff getWinLossDiff(Long teamId, Long leagueId) {

        WinLossDiff winLossDiff= new WinLossDiff();
        List<GameEntity>gameEntities=gameRepository.findGamesByTeamAndLeague(teamId,leagueId);

        int win=0;
        int loss=0;
        Long scored= Long.valueOf(0);
        Long recieved= Long.valueOf(0);
        for(int i=0;i<gameEntities.size();i++){

            Long tempHomeScore= gameEntities.get(i).getHomeScore();
            Long tempAwayScore= gameEntities.get(i).getAwayScore();
            Long tempHomeId= gameEntities.get(i).getHomeTeamId();
            Long tempAwayId= gameEntities.get(i).getAwayTeamId();

            if(tempHomeId ==teamId && tempHomeScore>tempAwayScore)
            {
                    win++;
                    scored += gameEntities.get(i).getHomeScore();
                    recieved += gameEntities.get(i).getAwayScore();

            }
             if (tempHomeId ==teamId && tempHomeScore<tempAwayScore)
            {
                loss++;
                scored += gameEntities.get(i).getHomeScore();
                recieved += gameEntities.get(i).getAwayScore();
            }

            if(tempAwayId ==teamId && tempAwayScore>tempHomeScore)
            {
                    win++;
                    scored=scored+gameEntities.get(i).getAwayScore();
                    recieved += gameEntities.get(i).getHomeScore();

            }
            if(tempAwayId ==teamId && tempAwayScore<tempHomeScore)
            {
                loss++;
                scored=scored+gameEntities.get(i).getAwayScore();
                recieved += gameEntities.get(i).getHomeScore();
            }

        }
        winLossDiff.setVictories((long) win);
        winLossDiff.setLoses((long) loss);
        winLossDiff.setScoredPoints(scored);
        winLossDiff.setRecievedPoints(recieved);

        return winLossDiff;
    }

    @Override
    public List<Game> findAllGames() {
        List<GameEntity>gameEntities= gameRepository.findAll();
        return gameMapper.entitiesToDtos(gameEntities);
    }

}
