package ba.unsa.pmf.registry.rest;

import ba.unsa.pmf.registry.api.model.LeagueStatus;
import ba.unsa.pmf.registry.api.model.LovIdDisplayName;
import ba.unsa.pmf.registry.api.service.LeagueStatusService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping(value = "/leagueStatus")
@RestController
@Api(tags =  "LeagueStatus")
public class LeagueStatusRest {

    LeagueStatusService leagueStatusService;

    @ApiOperation(value = "Create LeagueStatus")
    @PostMapping
    LeagueStatus create(@RequestBody LeagueStatus leagueStatus) {return leagueStatusService.create(leagueStatus);}

    @GetMapping
    List<LovIdDisplayName> getLov() {return leagueStatusService.getLov();}

}
