package com.training.tr.view;

import java.util.Scanner;

import com.training.tr.bean.Train;
import com.training.tr.bean.TrainTable;
import com.training.tr.logic.TrainTableLogic;

public class TrainView {
	
	public void printTrain(TrainTableLogic tl) {
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextInt()) {
			sc.nextLine();		
		}int number  = sc.nextInt();
		System.out.println(tl.getTrainByNumber(number));
		
	}
	
	public void printTrain(TrainTable tb) {
		for(Train element : tb.getList()) {
			System.out.println(element);
		}
	}
	

}
