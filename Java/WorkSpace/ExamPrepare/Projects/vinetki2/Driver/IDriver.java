package vinetki2.Driver;

import java.util.ArrayList;

import vinetki2.EDuration;
import vinetki2.Vehicles.Vehicle;

public interface IDriver {
	void bueVinetkiForAll();
	void bueVinetkaForID(int index, EDuration duration);
	ArrayList<Vehicle> returnAllVehicleIztekliVinetki(int day, int month, int year);
	void addVehicle(Vehicle vehicle);
}

//Шофьорите могат да си купуват винетки за всички превозни средства, които
//управляват. 
//Освен това могат да купуват и винетка само за определено превозно
//средство по номер (примерно първото) и за определен срок.

//Когато шофьор купува винетка, той се обръща към бензиностанцията, в която
//пазарува и изпълнява съответната операция.
//Това намалява парите му и освен това той задава новата винетка на съответното
//превозно средство, за което я е купил.
//Последната операция, която извършват шофьорите, е по даден ден, месец и
//година – текуща дата, да върнат списък с всички свои превозни средства с
//изтекли винетки.
