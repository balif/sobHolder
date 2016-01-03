package sob.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import sob.model.HeroCharacter;

public interface HeroRepository extends MongoRepository<HeroCharacter,String>{
	
	public List<HeroCharacter> findByName(String name);
}
