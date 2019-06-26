
public class Monster1 {
	private String monName, monSpecies, hairColour, faceType, bodyColour;
	private String specialPower, eyeColour, weapon, armColour, legColour;
	private double monHealth, armour, damageCaused, height, speed, armCount, legCount;

	public Monster1(String monName, String monSpecies, double monHealth, double armour,
			double damageCaused, String hairColour, String faceType, String bodyColour,
			double height, double speed, String specialPower, String eyeColour,
			String weapon, double armCount, String armColour, double legCount,
			String legColour) {

		this.setMonName(monName);
		this.setMonSpecies(monSpecies);
		this.setMonHealth(monHealth);
		this.setArmour(armour);
		this.setDamageCaused(damageCaused);
		this.setHairColour(hairColour);
		this.setFaceType(faceType);
		this.setBodyColour(bodyColour);
		this.setHeight(height);
		this.setSpeed(speed);
		this.setSpecialPower(specialPower);
		this.setEyeColour(eyeColour);
		this.setWeapon(weapon);
		this.setArmCount(armCount);
		this.setArmColour(armColour);
		this.setLegCount(legCount);
		this.setLegColour(legColour);

	}

	public String getMonName() {
		return monName;
	}

	public void setMonName(String monName) {
		this.monName = monName;
	}

	public String getMonSpecies() {
		return monSpecies;
	}

	public void setMonSpecies(String monSpecies) {
		this.monSpecies = monSpecies;
	}

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

	public String getFaceType() {
		return faceType;
	}

	public void setFaceType(String faceType) {
		this.faceType = faceType;
	}

	public String getBodyColour() {
		return bodyColour;
	}

	public void setBodyColour(String bodyColour) {
		this.bodyColour = bodyColour;
	}

	public String getSpecialPower() {
		return specialPower;
	}

	public void setSpecialPower(String specialPower) {
		this.specialPower = specialPower;
	}

	public String getEyeColour() {
		return eyeColour;
	}

	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getArmColour() {
		return armColour;
	}

	public void setArmColour(String armColour) {
		this.armColour = armColour;
	}

	public String getLegColour() {
		return legColour;
	}

	public void setLegColour(String legColour) {
		this.legColour = legColour;
	}

	public double getMonHealth() {
		return monHealth;
	}

	public void setMonHealth(double monHealth) {
		this.monHealth = monHealth;
	}

	public double getArmour() {
		return armour;
	}

	public void setArmour(double armour) {
		this.armour = armour;
	}

	public double getDamageCaused() {
		return damageCaused;
	}

	public void setDamageCaused(double damageCaused) {
		this.damageCaused = damageCaused;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getArmCount() {
		return armCount;
	}

	public void setArmCount(double armCount) {
		this.armCount = armCount;
	}

	public double getLegCount() {
		return legCount;
	}

	public void setLegCount(double legCount) {
		this.legCount = legCount;
	}

}
