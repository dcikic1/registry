package ba.unsa.pmf.registry.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeamRequest implements Serializable {
    private Long id;

    private  String name;

    private String displayName;

    private String shortName;

    private Long teamTypeId;

    private Long leagueId;
}
