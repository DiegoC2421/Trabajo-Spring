package pe.edu.upc.trabajo.models.entities;

import java.io.Serializable;
import java.util.Objects;

public class ShipmentStatusesId implements Serializable{
private static final long serialVersionUID = 1L;
	
	private Status status;
	private Shipment shipment;
	
	
	public ShipmentStatusesId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShipmentStatusesId(Status status, Shipment shipment) {
		super();
		this.status = status;
		this.shipment = shipment;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(shipment, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null || this.getClass() != obj.getClass())
			return false;
		
		ShipmentStatusesId shipmentStatusesId = (ShipmentStatusesId)obj;
		
		if(this.shipment != shipmentStatusesId.shipment)
			return false;
		if(this.status != shipmentStatusesId.status)
			return false;
		return true;
	}
}
