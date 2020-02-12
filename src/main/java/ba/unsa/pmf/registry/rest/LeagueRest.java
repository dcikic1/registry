package ba.unsa.pmf.registry.rest;

import ba.unsa.pmf.registry.api.service.LeagueService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RestController("/league")
public class LeagueRest {

    LeagueService leagueService;
}
