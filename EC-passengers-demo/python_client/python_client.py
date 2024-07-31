import requests

from pydantic_generated_model import EventType, Fare, Flight, Passenger, Status, Ticket
from pydantic_generated_model import Request


def call_decision_service():
    # Define the URL and endpoint
    url = "http://localhost:9060/DecisionService/rest/ec_passengers_deployment/check_if_in_scope_of_application"

    # Create the request payload
    payload = {
        # "__DecisionID__": "unique_decision_id_12345",
        "eventType": "Delay",
        "flight": {
            "departsFromMemberState": False,
            "landsInMemberState": True,
            "operatingAirCarrierIsCommunityCarrier": False,
            "stipulatedCheckInTime": "2024-08-01T12:00:00Z",
            "publishedDepartureTime": "2024-08-01T14:00:00Z"
        },
        "passenger": {
            "status": "HasAConfirmedReservation",
            "presentationForCheckInTime": "2024-08-01T11:00:00Z"
        },
        "ticket": {
            "fare": "Other"
        }
    }

    # Define the headers
    headers = {
        "Content-Type": "application/json"
    }

    # Make the POST request
    response = requests.post(url, json=payload, headers=headers)

    print(response)

    # Check the response status and print the response
    if response.status_code == 200:
        print("Response:", response.json())
    else:
        print("Error:", response.status_code, response.text)


# Example usage
if __name__ == "__main__":
    call_decision_service()
    flight = Flight(
        departsFromMemberState=False,
        landsInMemberState=True,
        operatingAirCarrierIsCommunityCarrier=False,
        stipulatedCheckInTime="2024-08-01T12:00:00Z",
        publishedDepartureTime="2024-08-01T14:00:00Z"
    )
    print(flight.model_dump_json(indent=4))

    eventType = EventType.Delay
    flight = Flight(
        departsFromMemberState=False,
        landsInMemberState=True,
        operatingAirCarrierIsCommunityCarrier=False,
        stipulatedCheckInTime="2024-08-01T12:00:00Z",
        publishedDepartureTime="2024-08-01T14:00:00Z")
    passenger = Passenger(
        status=Status.HasAConfirmedReservation,
        presentationForCheckInTime="2024-08-01T11:00:00Z")
    ticket = Ticket(fare=Fare.Other)
    request = Request(
        __DecisionID__="unique_decision_id_12345",
        eventType=eventType,
        flight=flight,
        passenger=passenger,
        ticket=ticket)

    print(request.model_dump_json(indent=4))
