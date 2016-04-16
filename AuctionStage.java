package com.pesit.assignment2;

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.util.*;

	public class AuctionStage {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub

			File reader=new File("C:\\Users\\Bhavana\\Desktop\\year2\\4th sem\\Design Patterns\\input.txt");
			
			
				BufferedReader in = new BufferedReader( new FileReader(reader));
				String string=in.readLine();
				while(string!=null)
				{
					Player p=new Player(string);
					System.out.println("Bidding starts for player "+string);
					int a = Integer.parseInt(in.readLine());
					String s="";
					for(int i=0;i<a;i++){
						s=in.readLine();
						String split[]=s.split(",");
						Bidder b = new Bidder(p,Integer.parseInt(split[0]),Integer.parseInt(split[1]));
						p.attach(b);
						
					}
					int c=Integer.parseInt(in.readLine());
					for (int i = 0; i<c ; i++)
					{
						s = in.readLine();
						String split[] = s.split(",");
						if( i == c-1)
						{
						System.out.println("Bid Winner");
						p.completeDeal(Integer.parseInt(split[0]),Integer.parseInt(split[1]));
						}
						else
						p.setBidderAndPrice(Integer.parseInt(split[0]),Integer.parseInt(split[1]));
						System.out.println();
					}
					string = in.readLine();
				}
			
			
		}

	}
