package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CovidStateData implements Comparable<CovidStateData>{
	
	String state;
	int active;
	int recovered;
	
	public CovidStateData() {
		
	}
	
	public CovidStateData(String state, int active, int recovered) {
		this.state = state;
		this.active = active;
		this.recovered = recovered;
	}
	
	public String toString() {
		return state+"["+active+"] ["+recovered+"]";
	}

	@Override
	public int compareTo(CovidStateData o) {
		if(recovered == o.recovered)
				return 0;
		else if(recovered > o.recovered)
			return 1;
		else
			return -1;
	}
}

class SortByRecoveredCases implements Comparator<CovidStateData>{

	@Override
	public int compare(CovidStateData o1, CovidStateData o2) {
		if(o1.recovered == o2.recovered)
			return 0;
		else if(o1.recovered > o2.recovered)
			return 1;
		else
			return -1;
	}
	
}

class SortByActiveCases implements Comparator<CovidStateData>{

	@Override
	public int compare(CovidStateData o1, CovidStateData o2) {
		if(o1.active == o2.active)
			return 0;
		else if(o1.active > o2.active)
			return 1;
		else
			return -1;
	}
	
}

class SortByStateName implements Comparator<CovidStateData>{

	@Override
	public int compare(CovidStateData o1, CovidStateData o2) {
		return o1.state.compareTo(o2.state);
	}
	
}

public class Sorting {

	public static void main(String[] args) {
		
		CovidStateData state1 = new CovidStateData("Maharashtra", 3000, 250);
		CovidStateData state2 = new CovidStateData("Punjab", 2000, 550);
		CovidStateData state3 = new CovidStateData("Haryana", 5000, 20);
		CovidStateData state4 = new CovidStateData("Karnataka", 1000, 150);
		CovidStateData state5 = new CovidStateData("HimachalPradesh", 500, 50);
		
		ArrayList<CovidStateData> covidCases = new ArrayList<CovidStateData>();
		covidCases.add(state1);
		covidCases.add(state2);
		covidCases.add(state3);
		covidCases.add(state4);
		covidCases.add(state5);
		
		// Sort the data as per recovered cases :)
		//Collections.sort(covidCases);
		
		SortByRecoveredCases recoverySorting = new SortByRecoveredCases();
		SortByActiveCases activeSorting = new SortByActiveCases();
		SortByStateName stateNameSorting = new SortByStateName();
		
		//Collections.sort(covidCases, recoverySorting);
		//Collections.sort(covidCases, activeSorting);
		Collections.sort(covidCases, stateNameSorting);
		
		for(CovidStateData state : covidCases) {
			System.out.println(state);
		}
		
	}

}
