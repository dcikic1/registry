package ba.unsa.pmf.registry.rest;

import ba.unsa.pmf.registry.api.model.AgeType;
import ba.unsa.pmf.registry.api.model.LovIdDisplayName;
import ba.unsa.pmf.registry.api.service.AgeTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping(value = "/age-type")
@RestController
@Api(tags =  "Age Type")
public class AgeTypeRest {

    AgeTypeService ageTypeService;

    @ApiOperation(value = "Get All AgeTypes")
    @GetMapping("all")
    public List<AgeType>findAll(){return ageTypeService.findAll();}

    @ApiOperation(value = "Create AgeType")
    @PostMapping
    public AgeType create(@RequestBody AgeType ageType) {return ageTypeService.create(ageType);}

    @GetMapping
    public List<LovIdDisplayName>getLov() {return ageTypeService.getLov();}
}
