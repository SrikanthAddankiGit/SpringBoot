package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Hotel {
	
	@Value("${hotel.id}")
	private int hotelId;
	
	@Value("${hotel.name")
	private String hotelName;
	
	@Value("${hotel.address")
	private String hotelAddres;
	
	@Value("$hotel.phone")
	private Long hotelPhoneNumber;

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddres=" + hotelAddres
				+ ", hotelPhoneNumber=" + hotelPhoneNumber + "]";
	}
	
	
}
