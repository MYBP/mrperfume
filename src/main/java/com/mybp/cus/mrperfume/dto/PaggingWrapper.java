package com.mybp.cus.mrperfume.dto;
import java.util.ArrayList;
import java.util.List;

public class PaggingWrapper<T> {

	/**
	 * Result value from search
	 */
	List<T> values=new ArrayList<T>();
	
	int currentPage;
	
	int allPage;

	public List<T> getValues() {
		return values;
	}

	public void setValues(List<T> values) {
		this.values = values;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getAllPage() {
		return allPage;
	}

	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}
	
}
