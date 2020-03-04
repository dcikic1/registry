package ba.unsa.pmf.registry.rest;

import ba.unsa.pmf.registry.api.model.League;
import ba.unsa.pmf.registry.api.model.LeagueRequest;
import ba.unsa.pmf.registry.api.service.LeagueService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping(value = "/league")
@RestController
@Api(tags =  "League")
public class LeagueRest {

    LeagueService leagueService;

    @ApiOperation(value = "Get All Leagues")
    @GetMapping("all")
    public List<League> findAll(){
       return leagueService.findAll();
    }

    @ApiOperation(value = "Create League")
    @PostMapping
    public League create(@RequestBody LeagueRequest request){
        return  leagueService.create(request);
    }

    @ApiOperation(value = "Update League")
    @PutMapping("{id}")
    public League update(@PathVariable Long id, @RequestBody LeagueRequest request) {
        return  leagueService.update(id,request);
    }

    @ApiOperation(value = "Delete League")
    @DeleteMapping({"id"})
    public void delete(@PathVariable Long id){
        leagueService.delete(id);
    }
}
