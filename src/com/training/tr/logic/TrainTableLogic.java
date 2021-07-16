package com.training.tr.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.tr.bean.Train;
import com.training.tr.bean.TrainTable;

public class TrainTableLogic {
	private TrainTable tb;
	
	public TrainTableLogic(TrainTable tb) {
		this.tb = tb;
	}

	public TrainTable sortTrainByNumber(TrainTable tb) {
		List<Train> result = tb.getList();

		Comparator<Train> c = new Comparator<Train>() {

			@Override
			public int compare(Train o1, Train o2) {

				return o1.getNumberTrain() - o2.getNumberTrain();
			}
		};
		Collections.sort(result, c);
		return new TrainTable(result);

	}

	public TrainTable sortTrainByDestinationTime(TrainTable tb) {
		List<Train> result = tb.getList();

		Comparator<Train> c = new Comparator<Train>() {
			@Override
			public int compare(Train o1, Train o2) {
				return o1.getDestination().compareTo(o2.getDestination());
			}
		};

		Comparator<Train> c1 = new Comparator<Train>() {

			@Override
			public int compare(Train o1, Train o2) {
				if (o1.getTime().getHour() > o2.getTime().getHour()) {
					return 1;
				} else if (o1.getTime().getHour() < o2.getTime().getHour()) {
					return -1;
				} else if (o1.getTime().getMinutes() > o2.getTime().getMinutes()) {
					return 1;
				} else if (o1.getTime().getMinutes() < o2.getTime().getMinutes()) {
					return -1;
				} else
					return 0;
			}

		};

		Collections.sort(result, c.thenComparing(c1));
		return new TrainTable(result);
	}
	
	public Train getTrainByNumber(int number) {
		Train result = null;
		for(int i = 0 ; i < tb.getList().size(); i++) {
			if(tb.getList().get(i).getNumberTrain()==number) {
				result = tb.getList().get(i);
			}
		}return result;
	}

}
