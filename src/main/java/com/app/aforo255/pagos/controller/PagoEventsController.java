package com.app.aforo255.pagos.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.aforo255.pagos.domain.Transaction_p;
import com.app.aforo255.pagos.producer.PagoEventProducer;
import com.app.aforo255.pagos.service.ITransaction_pService;
import com.fasterxml.jackson.core.JsonProcessingException;

import org.slf4j.*;

@RestController
public class PagoEventsController {
	
	private Logger log = LoggerFactory.getLogger(PagoEventsController.class);
	@Autowired
	PagoEventProducer pagoEventProducer;
	
	@Autowired
	private ITransaction_pService transaction_pService;
	
	@PostMapping("/v1/pagoEvent")
	public ResponseEntity<Transaction_p> postLibraryEvent(@RequestBody Transaction_p transaction_pEvent) throws JsonProcessingException{
		
		log.info("antes enviar tranSQL ");
		Transaction_p tranSQL = transaction_pService.save(transaction_pEvent);
		log.info("despues enviar tranSQL ");
		log.info("antes sendPAgoEvent_Approach3 ");		
		pagoEventProducer.sendPagoEvent_Approach3(tranSQL);
		log.info("despues sendPAgoEvent_Approach3 ");			
		return ResponseEntity.status(HttpStatus.CREATED).body(tranSQL);
		
	}

}
