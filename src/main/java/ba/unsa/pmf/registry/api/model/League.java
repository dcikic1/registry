package ba.unsa.pmf.registry.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class League implements Serializable {

    private Long id;

    private  String name;

    private String displayName;

    private String shortName;

    private LocalDateTime created;

    private String createdBy;

    private LocalDateTime modified;

    private String modfiedBy;
}
