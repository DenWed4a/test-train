package com.training.tr.bean;

import java.util.List;

public class TrainTable {
	
	private List<Train> list;
	
	
	public TrainTable(List<Train> list) {
		this.list = list;
	}
	
	public List<Train> getList() {
		return list;
	}

	public void setList(List<Train> list) {
		this.list = list;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainTable other = (TrainTable) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TrainTable [list=" + list + "]";
	}

}
