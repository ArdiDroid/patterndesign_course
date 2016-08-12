package com.pattern.design.structural.proxy;

public class RealImage implements Image {

	   private String fileName;

	   public RealImage(String fileName){
	      this.fileName = fileName;
	      loadFromDisk(fileName);
	   }

	   @Override
	   public void display() {
		   //print start
	      System.out.println("Displaying " + fileName);
		   //print end
	   }

	   private void loadFromDisk(String fileName){
	      System.out.println("Loading " + fileName);
	   }
	}