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

//��������� ����� �� �� ������� ������� �� ������ �������� ��������, �����
//����������. 
//����� ���� ����� �� ������� � ������� ���� �� ���������� ��������
//�������� �� ����� (�������� �������) � �� ��������� ����.

//������ ������ ������ �������, ��� �� ������ ��� ����������������, � �����
//�������� � ��������� ����������� ��������.
//���� �������� ������ �� � ����� ���� ��� ������ ������ ������� �� �����������
//�������� ��������, �� ����� � � �����.
//���������� ��������, ����� ��������� ���������, � �� ����� ���, ����� �
//������ � ������ ����, �� ������ ������ � ������ ���� �������� �������� �
//������� �������.
