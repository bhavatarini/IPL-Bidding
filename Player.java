package com.pesit.assignment2;

	import java.util.ArrayList;

	public class Player{

		private String playerName="";
		private int biddingprice,bidderId;
	    private ArrayList<Observer> observers;
		int Bidders,bidderCount=0;
		
		public Player(String playerName){
			
			this.playerName=playerName;
			   observers = new ArrayList<Observer>();
			
		}
		public void attach(Observer o){
			  observers.add(o);
			  bidderCount++;
			
		}
		public int[] getBidderAndPrice(){
			int a[]= new int[2];
			a[0]=bidderId;
			a[1]=biddingprice;
			return a;
			
		}
	    public void setBidderAndPrice(int bidderId, int biddingPrice){
	    	this.bidderId=bidderId;
	        biddingprice=biddingPrice;
	    	notifyBidding();
	    	
	    }
	    
	    public void completeDeal(int bidderId, int biddingPrice){
	    	this.bidderId=bidderId;
	    	biddingprice=biddingPrice;
	    	notifyDeal();
	    	
	    }
	    private void notifyBidding(){
	        for(int i=0;i<bidderCount;i++){
	            observers.get(i).updateBidding();
	        }
	    }
	    private void notifyDeal(){
	    	  for(int i=0;i<bidderCount;i++){
	              observers.get(i).updateFinalDeal();
	          }
	    	
	    }
	}

