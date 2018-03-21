package clients;
import process.GeneralManufacturingProcess;
import process.SmartphoneManufacturingProcess;

public class DeviceFactory {
	public static void main(String args[]){
		GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("iphone manufacture");
		manufacturer.launchProcess();
	}
}
