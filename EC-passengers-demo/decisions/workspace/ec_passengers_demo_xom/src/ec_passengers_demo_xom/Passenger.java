package ec_passengers_demo_xom;

import java.util.Date;

public class Passenger {
	PassengerStatus status;
	Date presentationForCheckInTime;

	public PassengerStatus getStatus() {
		return status;
	}

	public void setStatus(PassengerStatus status) {
		this.status = status;
	}

	public Date getPresentationForCheckInTime() {
		return presentationForCheckInTime;
	}

	public void setPresentationForCheckInTime(Date presentationForCheckInTime) {
		this.presentationForCheckInTime = presentationForCheckInTime;
	}

}
