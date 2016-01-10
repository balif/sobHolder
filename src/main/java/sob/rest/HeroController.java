package sob.rest;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sob.dto.HeroShort;
import sob.model.HeroCharacter;
import sob.services.HeroService;

@RestController
public class HeroController {
	
	@Autowired
	HeroService heroService;
	
    @RequestMapping(method=RequestMethod.GET, value="/heroC/{id}")
    public HeroCharacter heroByIdRest(@PathVariable(value="id") String id) {    	
        return heroService.findHeroById(id);
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/heroC")
    public HeroCharacter heroByIdRest2(@RequestParam(value="id") String id) {    	
        return heroService.findHeroById(id);
    }
    
     @RequestMapping(method=RequestMethod.POST, value="/heroC")
    public HeroCharacter heroSaveRest(@RequestBody HeroCharacter  hero) {    	
        return heroService.saveHero(hero);
    }
    
    @RequestMapping("/heroes")
    public List<HeroShort> allHeroesRest() {    	
        return heroService.listAllHeroes();
    }
    
    
}