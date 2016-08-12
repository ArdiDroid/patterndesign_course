package com.pattern.design.structural.proxy;

public class ProxyImage implements Image{

	   private RealImage realImage;
	   private String fileName;

	   public ProxyImage(String fileName){
	      this.fileName = fileName;
	   }

	   @Override
	   public void display() {
	      if(realImage == null){
	         realImage = new RealImage(fileName);
	      }
	      //print start
	      realImage.display();
	      //print end
	   }
	}
