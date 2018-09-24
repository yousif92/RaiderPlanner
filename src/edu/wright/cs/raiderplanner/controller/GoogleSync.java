/*
 * Copyright (C) 2018
 *
 */

package edu.wright.cs.raiderplanner.controller;

import java.io.IOException;
import java.io.InputStreamReader;

import org.omg.CORBA.portable.InputStream;

import edu.wright.cs.raiderplanner.model.Event;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;

/**
 * @author Yousif S
 *
 */
public class GoogleSync {
	
	 
	    private static final List<Object> SCOPES = Collections.singletonList(CalendarScopes.CALENDAR_READONLY);

	    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
	        // Load client secrets.
	    	
	        InputStream in = (InputStream) CalendarQuickstart.class.getResourceAsStream("file path");
	        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load("File", new InputStreamReader(in));

	        // Build flow and trigger user authorization request.
	        GoogleFlow flow;
	    }

	   
	       
	       

	        Object now;
			private Object service;
			// List the next 10 events from the primary calendar.
	        Events events = ((Object) service).events().list("primary")
	                .setMaxResults(10)
	                .setTimeMin(now)
	                .setOrderBy("startTime")
	                .setSingleEvents(true)
	                .execute();
	        List<Event> items = events.getItems();
	        if (items.isEmpty()) {
	            System.out.println("No upcoming events found.");
	        } else {
	            System.out.println("Upcoming events");
	            for (Event event : items) {
	                DateTime start = ((Object) event.getStart()).getDateTime();
	                if (start == null) {
	                    start = ((Object) event.getStart()).setDate();
	                }
	                System.out.printf("%s (%s)\n", event.getSummary(), start);
	            }
	        
	    }
}
}


