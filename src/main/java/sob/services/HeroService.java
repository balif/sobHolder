package sob.services;

import java.util.List;

import sob.dto.HeroShort;
import sob.model.HeroCharacter;

public interface HeroService {
	HeroCharacter findHeroByName(String name);
	
	HeroCharacter findHeroById(String id);
	
	List<HeroShort> listAllHeroes();
	
	
}
