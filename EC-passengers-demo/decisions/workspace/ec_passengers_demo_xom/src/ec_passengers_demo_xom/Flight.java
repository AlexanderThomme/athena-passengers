package ec_passengers_demo_xom;

import java.util.Date;

public class Flight {
	boolean departsFromMemberState;
	boolean landsInMemberState;
	boolean operatingAirCarrierIsCommunityCarrier;
	Date stipulatedCheckInTime;
	Date publishedDepartureTime;

	public boolean isDepartsFromMemberState() {
		return departsFromMemberState;
	}

	public void setDepartsFromMemberState(boolean departsFromMemberState) {
		this.departsFromMemberState = departsFromMemberState;
	}

	public boolean isLandsInMemberState() {
		return landsInMemberState;
	}

	public void setLandsInMemberState(boolean landsInMemberState) {
		this.landsInMemberState = landsInMemberState;
	}

	public boolean isOperatingAirCarrierIsCommunityCarrier() {
		return operatingAirCarrierIsCommunityCarrier;
	}

	public void setOperatingAirCarrierIsCommunityCarrier(boolean operatingAirCarrierIsCommunityCarrier) {
		this.operatingAirCarrierIsCommunityCarrier = operatingAirCarrierIsCommunityCarrier;
	}

	public Date getStipulatedCheckInTime() {
		return stipulatedCheckInTime;
	}

	public void setStipulatedCheckInTime(Date stipulatedCheckInTime) {
		this.stipulatedCheckInTime = stipulatedCheckInTime;
	}

	public Date getPublishedDepartureTime() {
		return publishedDepartureTime;
	}

	public void setPublishedDepartureTime(Date publishedDepartureTime) {
		this.publishedDepartureTime = publishedDepartureTime;
	}

}
