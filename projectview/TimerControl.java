package projectview;

import javax.swing.Timer;

public class TimerControl {
	private static final int TICK = 500;
	private boolean autoStepOn = false;
	private Timer timer;
	private GUIMediator gui;
	
	public TimerControl(GUIMediator gm) {
		this.gui = gm;
	}
	
	public boolean getAutoStepOn() {
		return autoStepOn;
	}
	
	public void setAutoStepOn(boolean anAutoStepOn) {
		autoStepOn = anAutoStepOn;
	}
	
	public void toggleAutoStep() {
		autoStepOn = !autoStepOn;
	}
	
	void setPeriod(int period) {
		timer.setDelay(period);
	}
	
	public void start() {
		timer = new Timer(TICK, e -> {if(autoStepOn) gui.step();});
		timer.start();
	}
}
