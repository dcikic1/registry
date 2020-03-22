package ba.unsa.pmf.registry.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class OfficialRequest implements Serializable {

    Long official1Id;
    Long official2Id;
    Long official3Id;
}
