package com.training.tr.main;

import java.util.ArrayList;
import java.util.List;

import com.training.tr.bean.Train;
import com.training.tr.bean.TrainTable;
import com.training.tr.logic.TrainTableLogic;
import com.training.tr.util.Time;
import com.training.tr.view.TrainView;

public class Main {
	
	private static List<Train> list;
	
	static {
		list = new ArrayList<>();
		list.add(new Train("Minsk", 1499, new Time(14,55)));
		list.add(new Train("Moscow", 1033, new Time(13,55)));
		list.add(new Train("Molodechno", 2033, new Time(14,00)));
		list.add(new Train("Berezha", 1032, new Time(17,55)));
		list.add(new Train("Minsk", 1035, new Time(11,55)));
		list.add(new Train("Minsk", 1035, new Time(11,54)));
	}

	public static void main(String[] args) {
		
		TrainTable tb = new TrainTable(list);
		TrainTableLogic tbl = new TrainTableLogic(tb);
		TrainView view = new TrainView();
		
		tb = tbl.sortTrainByNumber(tb);
		view.printTrain(tb);
		System.out.println();
		tbl.sortTrainByDestinationTime(tb);
		view.printTrain(tb);
		
		
		
		view.printTrain(tbl);
	} 
	

}
