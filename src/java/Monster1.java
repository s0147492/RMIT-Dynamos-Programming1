import java.util.Random;

public class Monster1 {

	private MonsterPersonalAttributes personalAttributes;
	private MonsterPhysicalAttributes physicalAttributes;
	private MonsterBattleStats battleStats;

	public Monster1(Random random) {
		this.personalAttributes = new MonsterPersonalAttributes(random);
		this.physicalAttributes = new MonsterPhysicalAttributes(random);
		this.battleStats = new MonsterBattleStats(random);
	}

	public void rename(String newName) {
		personalAttributes.setMonName(newName);
	}

	public MonsterPersonalAttributes getPersonalAttributes() {
		return personalAttributes;
	}

	public MonsterPhysicalAttributes getPhysicalAttributes() {
		return physicalAttributes;
	}

	public MonsterBattleStats getBattleStats() {
		return battleStats;
	}
}
