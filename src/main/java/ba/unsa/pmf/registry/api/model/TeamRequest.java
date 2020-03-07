package ba.unsa.pmf.registry.api.model;

import lombok.Data;

@Data
public class TeamRequest {
    private Long id;

    private  String name;

    private String displayName;

    private String shortName;

    private Long teamTypeId;

    private Long leagueId;
}
