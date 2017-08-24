import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		BPNN bpnn = new BPNN(2, 2, 1);
	
		List<List<Double>> data = new ArrayList<List<Double>>();
		List<Double> input0 = new ArrayList<Double>();
		input0.add(0.0); input0.add(0.0); input0.add(0.0);
		List<Double> input1 = new ArrayList<>();
		input1.add(0.0); input1.add(1.0); input1.add(1.0);
		List<Double> input2 = new ArrayList<>();
		input2.add(1.0); input2.add(0.0); input2.add(1.0);
		List<Double> input3 = new ArrayList<>();
		input3.add(1.0); input3.add(1.0); input3.add(0.0);
		data.add(input0);data.add(input1);data.add(input2);data.add(input3);
        //input y=the data
		
        System.out.println("Please input the learning rate: ");//ask the user to input rhe learning rate
        Scanner scanner=new Scanner(System.in);
        double eta=scanner.nextDouble();
        System.out.println("Please input the target error: ");// ask the user to input the target error
        double err = scanner.nextDouble();
        bpnn.setTrainData(data);
		bpnn.printWeights(true);//initialize and print the initial weights
		bpnn.train(eta, err);//begin the train
		System.out.println("First batch error: " + bpnn.getFirstBatchError());
		bpnn.printWeights(false);//print the weights of the neurons
		System.out.println("Final error: " + bpnn.getError());//print the final error
		System.out.println("Total number of batches: " + bpnn.getTotalBatches());//print total batches
		
	}

}