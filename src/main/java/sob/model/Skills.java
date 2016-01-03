package sob.model;

import org.springframework.data.annotation.Id;

public class Skills {

	Integer Agility;
	Integer Cunning;
	Integer Spirit;
	Integer Strength;
	Integer Lore;
	Integer Luck;
	
	public Skills(){
		super();
	}
	public Skills(Integer agility, Integer cunning, Integer spirit, Integer strength, Integer lore, Integer luck) {
		super();
		Agility = agility;
		Cunning = cunning;
		Spirit = spirit;
		Strength = strength;
		Lore = lore;
		Luck = luck;
	}

	public Integer getAgility() {
		return Agility;
	}

	public void setAgility(Integer agility) {
		Agility = agility;
	}

	public Integer getCunning() {
		return Cunning;
	}

	public void setCunning(Integer cunning) {
		Cunning = cunning;
	}

	public Integer getSpirit() {
		return Spirit;
	}

	public void setSpirit(Integer spirit) {
		Spirit = spirit;
	}

	public Integer getStrength() {
		return Strength;
	}

	public void setStrength(Integer strength) {
		Strength = strength;
	}

	public Integer getLore() {
		return Lore;
	}

	public void setLore(Integer lore) {
		Lore = lore;
	}

	public Integer getLuck() {
		return Luck;
	}

	public void setLuck(Integer luck) {
		Luck = luck;
	}

	
}
