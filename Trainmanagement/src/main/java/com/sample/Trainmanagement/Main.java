package com.sample.Trainmanagement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the source");
		String source=sc.next();
		System.out.println("enter the destination");
		String destination=sc.next();
		System.out.println("enter the coach type");
		String coachType=sc.next();
		sc.close();
		if(coachType.equalsIgnoreCase("AC1")||coachType.equalsIgnoreCase("AC3")||coachType.equalsIgnoreCase("sleeper")||
			coachType.equalsIgnoreCase("Seater")) {
			TrainManagement tms=new TrainManagement();
			ArrayList<Train> trainlist = tms.viewTrain(coachType, source, destination);
			if(trainlist.isEmpty()) {
				System.out.println("no trains found");
				return;
			}
			for(Train train:trainlist) {
				System.out.println(train.getTrainNumber()+ " "+train.getTrainName());
			}
			return;
		}
		System.out.println("Invalid Coach Type");
	}

}
