package labTest_1514;

public class Car {
	public String carName;
	public int carNum;
	public int engCapacity;
	
	Car(String carName, int carNum, int engCapacity){
		this.carName = carName;
		this.carNum = carNum;
		this.engCapacity = engCapacity;
	}
	
	int getEngineCapacity(){
		return engCapacity;
	}
	
	int getCarNum(){
		return carNum;
	}
}
