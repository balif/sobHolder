package sob.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class HeroCharacter {
	@Id
	String id;
	String name;
	HeroClass heroClass;
	Skills skills;
	Integer initiative;
	Integer maxHealth;
	Integer defense;
	Integer willpower;
	Integer maxSanity;
	Integer toHitRange;
	Integer toHitMelee;
	Integer combat;
	Integer maxGrit;
	List<Keyword> keywords;
	List<Item> items;
	List<Ability> abilities;
	
	public HeroCharacter() {
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
	public HeroClass getHeroClass() {
		return heroClass;
	}
	public void setHeroClass(HeroClass heroClass) {
		this.heroClass = heroClass;
	}
	public Skills getSkills() {
		return skills;
	}
	public void setSkills(Skills skills) {
		this.skills = skills;
	}
	public Integer getInitiative() {
		return initiative;
	}
	public void setInitiative(Integer initiative) {
		this.initiative = initiative;
	}
	public Integer getMaxHealth() {
		return maxHealth;
	}
	public void setMaxHealth(Integer maxHealth) {
		this.maxHealth = maxHealth;
	}
	public Integer getDefense() {
		return defense;
	}
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	public Integer getWillpower() {
		return willpower;
	}
	public void setWillpower(Integer willpower) {
		this.willpower = willpower;
	}
	public Integer getMaxSanity() {
		return maxSanity;
	}
	public void setMaxSanity(Integer maxSanity) {
		this.maxSanity = maxSanity;
	}
	public Integer getToHitRange() {
		return toHitRange;
	}
	public void setToHitRange(Integer toHitRange) {
		this.toHitRange = toHitRange;
	}
	public Integer getToHitMelee() {
		return toHitMelee;
	}
	public void setToHitMelee(Integer toHitMelee) {
		this.toHitMelee = toHitMelee;
	}
	public Integer getCombat() {
		return combat;
	}
	public void setCombat(Integer combat) {
		this.combat = combat;
	}
	public Integer getMaxGrit() {
		return maxGrit;
	}
	public void setMaxGrit(Integer maxGrit) {
		this.maxGrit = maxGrit;
	}
	public List<Keyword> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<Keyword> keywords) {
		this.keywords = keywords;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Ability> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}

	
	
}
