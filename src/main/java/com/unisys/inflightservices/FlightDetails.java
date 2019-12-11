package com.unisys.inflightservices;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.kie.api.definition.type.Label;



public class FlightDetails
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @Label("Aircraft Type")
  private String aircraftType;
  @Label("Cabin")
  private String cabin;
  @Label("Origin")
  private String origin;
  @Label("Destination")
  private String destination;
  @Label("Flight Number")
  private String flightNumber;
  @Label("InFlightServiceList")
  private List<Service> inFlightServiceList = new ArrayList();
  
  @Label("AncillaryServiceList")
  private List<Service> ancillaryServiceList = new ArrayList();
  
  @Label("Passenger")
  private Passenger passenger;
  
  @Label("SegmentKey")
  private String segmentKey;
  
  @Label("Pos")
  private String pos;
  
  @Label("Difference(days)")
  private int difference;
  
  @Label("Penalty")
  private int penalty;

  
  public FlightDetails() {}

  
  public String getAircraftType() { return this.aircraftType; }


  
  public void setAircraftType(String aircraftType) { this.aircraftType = aircraftType; }


  
  public String getCabin() { return this.cabin; }


  
  public void setCabin(String cabin) { this.cabin = cabin; }


  
  public String getOrigin() { return this.origin; }


  
  public void setOrigin(String origin) { this.origin = origin; }


  
  public String getDestination() { return this.destination; }


  
  public void setDestination(String destination) { this.destination = destination; }


  
  public String getFlightNumber() { return this.flightNumber; }


  
  public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }


  
  public List<Service> getInFlightServiceList() { return this.inFlightServiceList; }



  
  public void setInFlightServiceList(List<Service> inFlightServiceList) { this.inFlightServiceList = inFlightServiceList; }


  
  public List<Service> getAncillaryServiceList() { return this.ancillaryServiceList; }



  
  public void setAncillaryServiceList(List<Service> ancillaryServiceList) { this.ancillaryServiceList = ancillaryServiceList; }



  
  public void addInFlightService(Service pService) { this.inFlightServiceList.add(pService); }



  
  public void addAncillaryService(Service pService) { this.ancillaryServiceList.add(pService); }


  
  public Passenger getPassenger() { return this.passenger; }


  
  public void setPassenger(Passenger passenger) { this.passenger = passenger; }


  
  public String getSegmentKey() { return this.segmentKey; }


  
  public void setSegmentKey(String segmentKey) { this.segmentKey = segmentKey; }


  
  public String getPos() { return this.pos; }


  
  public void setPos(String pos) { this.pos = pos; }


  
  public int getDifference() { return this.difference; }


  
  public void setDifference(int difference) { this.difference = difference; }


  
  public int getPenalty() { return this.penalty; }


  
  public void setPenalty(int penalty) { this.penalty = penalty; }











  
  public FlightDetails(String aircraftType, String cabin, String origin, String destination, String flightNumber, List<Service> inFlightServiceList, List<Service> ancillaryServiceList, Passenger passenger, String segmentKey, String pos, int difference, int penalty) {
    this.aircraftType = aircraftType;
    this.cabin = cabin;
    this.origin = origin;
    this.destination = destination;
    this.flightNumber = flightNumber;
    this.inFlightServiceList = inFlightServiceList;
    this.ancillaryServiceList = ancillaryServiceList;
    this.passenger = passenger;
    this.segmentKey = segmentKey;
    this.pos = pos;
    this.difference = difference;
    this.penalty = penalty;
  }
}
