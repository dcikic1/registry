package ba.unsa.pmf.registry.api.model;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Team implements Serializable {

    private Long id;

    private  String name;

    private String displayName;

    private String shortName;

    private Long teamTypeId;

    private Long leagueId;

    private LocalDateTime created;

    private String createdBy;

    private LocalDateTime modified;

    private String modfiedBy;
}
