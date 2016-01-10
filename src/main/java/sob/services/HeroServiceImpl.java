package sob.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sob.dao.HeroRepository;
import sob.dto.HeroShort;
import sob.model.HeroCharacter;

	
@Service
public class HeroServiceImpl implements HeroService {
	
	@Autowired
	public HeroRepository heroRepository;

	@Override
	public	HeroCharacter saveHero(HeroCharacter hero){
		return heroRepository.save(hero);
		
	}
//		HeroCharacter example = new HeroCharacter();
//		example.setName("CowBoy");
//		example.setHeroClass(new HeroClass("Lawman"));
//		example.setSkills(new Skills(2, 4, 1, 3, 2, 3));
//		List<Keyword> keywords= Arrays.asList(new Keyword("tribal"),new Keyword("renegate"));
//		example.setKeywords(keywords);
//		heroRepository.save(example);
//		
//		System.out.println(heroRepository.findAll());
//		return example;
//	}

	@Override
	public List<HeroShort> listAllHeroes() {
		List<HeroShort> list = new LinkedList<HeroShort>();
		for(HeroCharacter hc : heroRepository.findAll()){
			HeroShort hs = new HeroShort(hc);			
			list.add(hs);
		}
		return list;
	}

	@Override
	public HeroCharacter findHeroById(String id) {
		return heroRepository.findOne(id);
	}

}
