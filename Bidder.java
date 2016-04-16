package com.pesit.assignment2;

 class Bidder extends Observer{
		
		private int bidderId,amount;

		public Bidder(Player p,int bidderId,int amount){
			this.player=p;
			this.bidderId=bidderId;
			this.amount=amount;
		}
		@Override
		public void updateBidding() {
			int a[]=player.getBidderAndPrice();
			if(a[0]==bidderId)
				amount-=10;
			System.out.println(bidderId + " : ["+a[0]+", "+a[1]+"]");
			
		}

		@Override
		public void updateFinalDeal() {
			int a[] = player.getBidderAndPrice();
			if( a[0] == this.bidderId)
				this.amount -= a[1];
			System.out.println(bidderId + " : ["+this.amount+", "+a[0]+"]");
			
			
		}

	}


