package edu.cvtc.web.model;

import java.io.Serializable;

public class Rides implements Serializable {

	private static final long serialVersionUID = -2220777883091033066L;
	
	private String userName;
	private String driverOrPassanger;
	private String startingAddressLn1;
	private String startingAddressLn2;
	private String startingCity;
	private String startingState;
	private String startingDate;
	private String startingTime;
	private String endingAddressLn1;
	private String endingAddressLn2;
	private String endingCity;
	private String endingState;
	private String returnDate;
	private String returnTime;
	private int numberOfPassangers;
	private String allowSmoking;
	private int gas;
	

	public Rides(String userName, String driverOrPassanger, String startingAddressLn1, String startingAddressLn2, String startingCity,
			String startingState, String startingDate, String startingTime, String endingAddressLn1, String endingAddressLn2, String endingCity, 
			String endingState, String returnDate, String returnTime, int numberOfPassangers, String allowSmoking, int gas) {
		
		super();
		this.userName = userName;
		this.driverOrPassanger = driverOrPassanger;
		this.startingAddressLn1 = startingAddressLn1;
		this.startingAddressLn2 = startingAddressLn2;
		this.startingCity = startingCity;
		this.startingState = startingState;
		this.startingDate = startingDate;
		this.startingTime = startingTime;
		this.endingAddressLn1 = endingAddressLn1;
		this.endingAddressLn2 = endingAddressLn2;
		this.endingCity = endingCity;
		this.endingState = endingState;
		this.returnDate = returnDate;
		this.returnTime = returnTime;
		this.numberOfPassangers = numberOfPassangers;
		this.allowSmoking = allowSmoking;
		this.gas = gas;		
	}


	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDriverOrPassanger() {
		return driverOrPassanger;
	}

	public void setDriverOrPassanger(String driverOrPassanger) {
		this.driverOrPassanger = driverOrPassanger;
	}

	public String getStartingAddressLn1() {
		return startingAddressLn1;
	}

	public void setStartingAddressLn1(String startingAddressLn1) {
		this.startingAddressLn1 = startingAddressLn1;
	}

	public String getStartingAddressLn2() {
		return startingAddressLn2;
	}

	public void setStartingAddressLn2(String startingAddressLn2) {
		this.startingAddressLn2 = startingAddressLn2;
	}
	
	public String getStartingCity() {
		return startingCity;
	}

	public void setStartingCity(String startingCity) {
		this.startingCity = startingCity;
	}
	public String getStartingState() {
		return startingState;
	}

	public void setStartingState(String startingState) {
		this.startingState = startingState;
	}
	
	public String getStartingDate(){
		return startingDate;
	}

	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}
	
	public String getStartingTime() {
		return startingTime;
	}
	
	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}
	
	public String getEndingAddressLn1() {
		return endingAddressLn1;
	}

	public void setEndingAddressLn1(String endingAddressLn1) {
		this.endingAddressLn1 = endingAddressLn1;
	}
	
	public String getEndingAddressLn2() {
		return endingAddressLn2;
	}
	
	public void setEndingAddressLn2(String endingAddressLn2) {
		this.endingAddressLn2 = endingAddressLn2;
	}
	
	public String getEndingCity() {
		return endingCity;
	}
	
	public void setEndingCity(String endingCity) {
		this.endingCity = endingCity;
	}
	
	public String getEndingState() {
		return endingState;
	}
	
	public void setEndingState(String endingState) {
		this.endingState = endingState;
	}
	
	public String getReturnDate(){
		return returnDate;
	}
	
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	public String getReturnTime() {
		return returnTime;
	}
	
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
	
	public int getNumberOfPassangers(){
		return numberOfPassangers;
	}
	
	public void setNumberOfPassangers(int numberOfPassangers) {
		this.numberOfPassangers = numberOfPassangers;
	}
	
	public String getAllowSmoking()   {
		return allowSmoking;
	}
	
	public void setAllowSmoking(String allowSmoking) {
		this.allowSmoking = allowSmoking;
	}
	
	public int getGas() {
		return gas;
	}
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	@Override
	public String toString() {
		return "userName=" + userName + ", driverOrPassanger=" + driverOrPassanger + ", startingAddressLn1=" + startingAddressLn1 + ", startingAddressLn2=" + startingAddressLn2 + ", startingCity=" + startingCity + ", startingState=" + startingState + ", startingDate=" + startingDate + ", startingTime=" + startingTime + ", endingAddressLn1=" + endingAddressLn1 + ", endingAddressLn2=" + endingAddressLn2 + ", endingCity=" + endingCity + ", endingState=" + endingState + ", returnDate=" + returnDate + ", returnTime=" + returnTime + ", numberOfPassangers=" + numberOfPassangers + ", allowSmoking=" + allowSmoking + ", gas=" + gas;
	}

}