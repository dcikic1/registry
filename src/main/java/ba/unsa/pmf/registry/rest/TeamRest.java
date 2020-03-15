package ba.unsa.pmf.registry.rest;

import ba.unsa.pmf.registry.api.model.Team;
import ba.unsa.pmf.registry.api.model.TeamRequest;
import ba.unsa.pmf.registry.api.service.TeamService;
import io.swagger.annotations.ApiOperation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RestController
@RequestMapping(value = "/team")
public class TeamRest {
    TeamService teamService;

    @PostMapping
    public Team create(@RequestBody TeamRequest request) {return teamService.create(request); }

    @ApiOperation(value = "Delete Team")
    @DeleteMapping({"id"})
    public void delete(@PathVariable Long id) {teamService.delete(id);}

    @ApiOperation(value = "Get All Teams")
    @GetMapping("all")
    public List<Team>findAll(){return teamService.findAll();}

    @ApiOperation(value = "Update Team")
    @PutMapping("{id}")
    public Team update(@PathVariable Long id,@RequestBody TeamRequest request) {return teamService.update(id,request);}


    @ApiOperation(value = "Get all teams from league")
    @GetMapping("teams/{id}")
    public List<Team>findTeamsInLeague(@PathVariable Long id) {return teamService.findTeamsInLeague(id);}

}
