package sob.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeroClass {
	String name;
	
	
	

	public HeroClass(@JsonProperty("name") String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName( String name) {
		this.name = name;
	}
	
	
	
	
}
