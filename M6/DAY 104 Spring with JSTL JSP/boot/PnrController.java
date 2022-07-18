package com.cdac.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Passenger;
import com.cdac.entity.Passenger.Gender;
import com.cdac.entity.Passenger.Status;
import com.cdac.entity.Pnr;

//Assume this API has been developed by IRCTC
@RestController
public class PnrController {

	/*
	 * public Pnr getPnrDetails(HttpServletRequest request) {
		int pnrNo = Integer.parseInt(request.getParameter("pnrNo"));
	 */
	
	//http://localhost:8080/pnr-status.irctc?pnrNo=1234567890
	@RequestMapping("/pnr-status.irctc")
	public Pnr getPnrDetails(@RequestParam("pnrNo") int pnrNo) {
		//for the time being we will hard code some data and send it
		//as of now we are not writing any service and dao
		Pnr pnr = new Pnr();
		pnr.setPnrNo(pnrNo);
		pnr.setTrainNo(1111);
		pnr.setTravelDate(LocalDate.of(2022, 7, 20));
		
		List<Passenger> list = new ArrayList<>();

		Passenger p1 = new Passenger();
		p1.setName("Ram");
		p1.setGender(Gender.MALE);
		p1.setStatus(Status.CONFIRMED);
		list.add(p1);

		Passenger p2 = new Passenger();
		p2.setName("Shyam");
		p2.setGender(Gender.MALE);
		p2.setStatus(Status.RAC);
		list.add(p2);
		
		pnr.setPassengers(list);
		
		return pnr;
	}
}
