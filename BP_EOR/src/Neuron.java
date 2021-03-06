
public class Neuron {
	private int type;	
	private double value;
	
	public static final int TYPE_INPUT = 0;
	public static final int TYPE_HIDDEN = 1;
	public static final int TYPE_OUTPUT = 2;
	
	public Neuron(int type) {
		this.type = type;
	}
	
	public void input(double in) {
		if(type == TYPE_INPUT) {
			value = in;
		}
	}
	
	public double getValue() {
		return value;
	}
	
	public void updateValue(double in) {
		if(type == TYPE_INPUT) {
			value = in;
		} else {
			value = actFunction(in);
		}
	}
	private double actFunction(double x) {
		return 1 / (1 + Math.exp(-x));
	}
}
