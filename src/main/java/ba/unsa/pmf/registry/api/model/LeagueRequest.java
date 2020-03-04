package ba.unsa.pmf.registry.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class LeagueRequest implements Serializable {

    private Long statusId;

    private Long leagueTypeId;

    private String season;

    private  String name;

    private String displayName;

    private String shortName;

}
