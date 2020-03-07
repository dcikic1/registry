package ba.unsa.pmf.registry.rest;

import ba.unsa.pmf.registry.api.model.Team;
import ba.unsa.pmf.registry.api.model.TeamRequest;
import ba.unsa.pmf.registry.api.service.TeamService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RestController
@RequestMapping(value = "/team")
public class TeamRest {
    TeamService teamService;

    @PostMapping
    public Team create(@RequestBody TeamRequest request) {return teamService.create(request); }
}
