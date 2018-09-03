package com.example.Admin;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.Admin.conv.SmestajDTOToSmestaj;
import com.example.Admin.dto.LoginDTO;
import com.example.Admin.dto.SmestajDTO;
import com.example.Admin.model.Smestaj;
import com.example.AgentApp.TipSmestaja;

import sema.wsdl.SmestajRequest;
import sema.wsdl.SmestajResponse;
import sema.wsdl.LoginRequest;
import sema.wsdl.LoginResponse;
import sema.wsdl.UserXML;
import sema.wsdl.TipSmestajXML;
import sema.wsdl.ImageXML;
import sema.wsdl.SmestajXML;


public class WSclient extends WebServiceGatewaySupport  {
	private static final String URI = "https://localhost:9100/ws";
	
	private SmestajDTOToSmestaj smestajDtoToSmestaj;
	public LoginResponse loginWS(LoginDTO agent) {
		LoginRequest request = new LoginRequest();
		UserXML user = new UserXML();
		user.setEmail(agent.getEmail());
		user.setPassword(agent.getPassword());
		request.setUser(user);
		LoginResponse response = (LoginResponse) getWebServiceTemplate().marshalSendAndReceive(URI ,
				request, new SoapActionCallback(URI + "/loginRequest"));
		return response;
		
	}
	
	public SmestajResponse smestajWS(SmestajDTO smestaj) throws IOException  {
		SmestajRequest request = new SmestajRequest();
		Smestaj uneti = smestajDtoToSmestaj.convert(smestaj);
		TipSmestaja tipSmestaja = tipSmestajaService.findByNaziv(smestaj.getTip());
		//xmlConverter = new XMLConverter();
		//TipSmestajXML tipXML = xmlConverter.convertTipSmestajaToTipSmestajaXML(tipSmestaja);
		SmestajXML smestajXML = new SmestajXML();
		//smestajXML.setTipSmestaja(tipXML);
		for(int i=0; i< smestaj.getImg().size(); i++){
			ImageXML slika = new ImageXML();
			slika.setUrl(smestaj.getImg().get(i));
			smestajXML.getSlike().add(slika);
		}
		smestajXML.setLokacija(smestaj.getLokacija());
		smestajXML.setNaziv(smestaj.getNaziv());
		smestajXML.setOpis(smestaj.getOpis());
		smestajXML.setKategorija(smestaj.getKategorija());
		
		request.setAccommodation(smestajXML);
		
		SmestajResponse response = (SmestajResponse) getWebServiceTemplate().marshalSendAndReceive(URI ,
				request, new SoapActionCallback(URI + "/smestajRequest"));
		return response;
	}
	
}
