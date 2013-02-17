package environment;

public class Consequence {
	private boolean reinforcement; // true for positive reinforcement, false for positive punishment

	public boolean isReinforcement() {
		return reinforcement;
	}
	public boolean isPunishment() {
		return !reinforcement;
	}

	public void setReinforcement() {
		this.reinforcement = true;
	}
	
	public void setPunishment() {
		this.reinforcement = false;
	}
}
