package com.yashraj.point;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CoordinatesLiesInsidePolygonOrNotApplication {

	public static void main(String[] args) 
	{
		 // Here we are passing arguments 
	    GeoPoint Coordinates = new GeoPoint(Double.parseDouble(args[0]),Double.parseDouble(args[1]));

		GeoPolygon Zone = new GeoPolygon
				( 
				// Define a Zone Polygon (Here you can define as many point as you want)
	            new GeoPoint(36.100858, -115.180674),
	            new GeoPoint(36.130937, -115.180372),
	            new GeoPoint(36.158196, -115.160268),
	            new GeoPoint(36.159290, -115.117329),
	            new GeoPoint(-36.135945, -115.090386),
	            new GeoPoint(36.122193, -115.083764),
	            new GeoPoint(36.100715, -115.081946)
	            );
		
	   if(Zone.isPointInside(Coordinates))
	   {
		   System.out.println("Inside Zone ");
	   }

	   else
	   {
		   System.out.println("Out of Zone");
	   }
		
	}

}
