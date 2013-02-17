package environment;

public class Stimulus {
	private String type; // light, speaker; needed for identification
	private boolean stimulating; //whether the stimulant is stimulating
	
	public Stimulus(String type) {
		this.type = type;
		this.setStimulating(false);
	}

	public boolean isStimulating() {
		return stimulating;
	}

	public void setStimulating(boolean stimulating) {
		this.stimulating = stimulating;
	}

	public String getType() {
		return type;
	}
}
