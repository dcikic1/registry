package ba.unsa.pmf.registry.rest;


import ba.unsa.pmf.registry.api.model.Game;
import ba.unsa.pmf.registry.api.model.OfficialRequest;
import ba.unsa.pmf.registry.api.service.GameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping(value = "/game")
@RestController
@Api(tags =  "Game")
public class GameRest {

    GameService gameService;

    @ApiOperation(value = "Insert Game")
    @PostMapping
    public Game insert(@RequestBody Game game) {return gameService.insert(game);}

    @ApiOperation(value = "Update officials")
    @PutMapping("officials/{id}/update")
    public Game updateOfficals(@PathVariable Long id, @RequestBody OfficialRequest officialRequest) {
        return gameService.updateOfficials(id,officialRequest);}

    @ApiOperation(value = "Update table officials")
    @PutMapping("table-officials/{id}/update")
    public Game updateTableOffcs(@PathVariable Long id, @RequestBody OfficialRequest officialRequest){
        return gameService.updateTableOffcs(id,officialRequest);
    }

    @ApiOperation(value = "Delete game")
    @DeleteMapping({"id"})
    public void delete(@PathVariable Long id) {gameService.delete(id);}

    @ApiOperation(value = "Update official1")
    @PutMapping("update-official1/{id}")
    public Game updateOffical1(@PathVariable Long id, @PathVariable Long officialId ) {
        return gameService.updateOfficial1(id,officialId);}


    @ApiOperation(value = "Update official2")
    @PutMapping("update-official2/{id}")
    public Game updateOffical2(@PathVariable Long id, @PathVariable Long officialId ) {
        return gameService.updateOfficial2(id,officialId);}

    @ApiOperation(value = "Update official3")
    @PutMapping("update-official3/{id}")
    public Game updateOffical3(@PathVariable Long id, @PathVariable Long officialId ) {
        return gameService.updateOfficial3(id,officialId);}

    @ApiOperation(value = "Update table official writer")
    @PutMapping("table-official-writer/{id}/update")
    public Game updateTableOffcWriter(@PathVariable Long id, @PathVariable Long officialId ) {
        return gameService.updateTableOffcWriter(id,officialId);}

    @ApiOperation(value = "Update table official time")
    @PutMapping("table-official-time/{id}/update")
    public Game updateTableOffcTime(@PathVariable Long id, @PathVariable Long officialId ) {
        return gameService.updateTableOffcTime(id,officialId);}

    @ApiOperation(value = "Update table official shot clock")
    @PutMapping("table-official-shotClock/{id}/update")
    public Game updateTableOffcShtClock(@PathVariable Long id, @PathVariable Long officialId ) {
        return gameService.updateTableOffcShtClock(id,officialId);}

    @ApiOperation(value = "Update home team score")
    @PutMapping("home-team-score/{id}/update")
    public Game updateHomeTeamScore(@PathVariable Long id, @PathVariable Long score ) {
        return gameService.updateHomeTeamScore(id,score);}


    @ApiOperation(value = "Update away team score")
    @PutMapping("away-team-score/{id}/update")
    public Game updateAwayTeamScore(@PathVariable Long id, @PathVariable Long score ) {
        return gameService.updateHomeAwayScore(id,score);}

    @ApiOperation(value = "Get all scores of home team")
    @GetMapping("home-team/{homeTeamId}/scores")
    public List<Long>getHomeTeamScrs(@PathVariable Long homeTeamId) {return gameService.getHomeTeamScrs(homeTeamId);}

    @ApiOperation(value = "Get all scores of away team")
    @GetMapping("away-team/{awayTeamId}/scores")
    public List<Long>getAwayTeamScrs(@PathVariable Long awayTeamId) {return gameService.getAwayTeamScrs(awayTeamId);}

    @ApiOperation(value = "Get all games in league")
    @GetMapping("games-in-league/{leagueId}")
    public List<Game>getGamesInLeague(@PathVariable Long leagueId) {return gameService.getGamesInLeague(leagueId);}

    @ApiOperation(value="Get all games where table official was")
    @GetMapping("games-of-table-official /{tableOfficialId}")
    public List<Game>getGamesOfTbleOfficl(@PathVariable Long tableOfficialId) {
        return gameService.getGamesOfTbleOfficl(tableOfficialId);
    }

    @ApiOperation(value="Get all games where official was")
    @GetMapping("games-of-official/{officialId}")
    public List<Game>getGamesOfOfficial(@PathVariable Long officialId) {return gameService.getGamesOfOfficial(officialId);}
}