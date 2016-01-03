package sob.dto;

import sob.model.HeroCharacter;

public class HeroShort {

	String id;
	String name;
	String heroClassName;
	
	public HeroShort(){
		
	}
	
	public HeroShort(HeroCharacter hc){
		id=hc.getId();
		name=hc.getName();
		heroClassName=hc.getHeroClass().getName();
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeroClassName() {
		return heroClassName;
	}
	public void setHeroClassName(String heroClassName) {
		this.heroClassName = heroClassName;
	}
}
