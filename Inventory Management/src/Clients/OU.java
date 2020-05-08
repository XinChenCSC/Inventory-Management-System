package Clients;

import java.util.ArrayList;

public class OU extends Client{
	
	private ArrayList<Guest> presentee = new ArrayList<Guest>();
	
	private final static int Evaluation_Score_Range = 10;
	
	private int numCompliment = 0;
	
	//Constructor	
	public OU(String Name, String ID, String Email, String Position, String Interest, String Recommender, String Password) {
		super(Name, ID, Email, Position, Interest, Recommender, Password);
	}
	
	public OU() {
		super("Noah Lee", "55555", "NoahLee@gmail.com", "OU", "Baseball", "Qichen You", "66666");
	}
	
	public ArrayList<Guest> getPresentee() {return presentee;}
	
	public void setPresentee(ArrayList<Guest> presentee) {this.presentee = presentee;}
	//*****************************************************************************************

	//**************************************************************************
	
	//Return Evaluation score Range
	public static int getEvaluationScoreRange() {
		return Evaluation_Score_Range;
	}
	
	//Remove presentee if you have filled up the initial evaluation for your presentee
	public void removePresentee(Guest Name) {
		presentee.remove(Name);
	}
	
	//Add presentee if your presentee needs you to provide them an initial scores
	public void addPresentee(Guest Name) {
		presentee.add(Name);
	}
	
	public ArrayList<Guest> getPresenteeList() {
		return presentee;
	}

//--------------------------------Number of Compliments------------------------------------
	public void incNumCompliment() {
		++this.numCompliment;
	}
	
	public int getNumCompliment() {
		return numCompliment;
	}

	public void setNumCompliment(int numCompliment) {
		this.numCompliment = numCompliment;
	}
	
//******************************************************************************************
}
