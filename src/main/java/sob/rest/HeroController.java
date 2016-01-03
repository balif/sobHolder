package sob.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sob.dto.HeroShort;
import sob.model.HeroCharacter;
import sob.model.Skills;
import sob.services.HeroService;

@RestController
public class HeroController {
	
	@Autowired
	HeroService heroService;
	
    @RequestMapping("/heroC/{id}")
    public HeroCharacter heroByIdRest(@PathVariable(value="id") String id) {    	
        return heroService.findHeroById(id);
    }
    
    
    
    @RequestMapping("/heroes")
    public List<HeroShort> allHeroesRest() {    	
        return heroService.listAllHeroes();
    }
}