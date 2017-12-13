package com.stackthread.altizon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ShareTheFare {

	public static void main(String[] args) throws Exception {
		
		Map<String,FareHolder> fareHolderMap = new LinkedHashMap<String,FareHolder>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
        int nbrOfTestCases = Integer.parseInt(line);
        
        String lineStr;
        String lineStrArr[];
        String sharer;
		String payer;
		String friend;
		int tranBill = 0;
		int nbrOfSharers = 0, share = 0;
		int totalTransacations;
		int totalFriends;
        
		for (int i = 0; i < nbrOfTestCases; i++) {
		
			lineStr = br.readLine();
			lineStrArr = lineStr.split(" ");
			totalFriends = Integer.parseInt(lineStrArr[0]);
			totalTransacations = Integer.parseInt(lineStrArr[1]);
			
			for (int j = 0; j < totalFriends; j++) {
				friend = br.readLine();
				fareHolderMap.put(friend, new FareHolder(friend,0,0,0));
			}

			for (int j = 0; j < totalTransacations; j++) {
				payer = br.readLine();
				tranBill = Integer.parseInt(br.readLine());
				nbrOfSharers = Integer.parseInt(br.readLine());
				
				share = tranBill/(nbrOfSharers+1);
				
				fareHolderMap.get(payer).addPaid(tranBill);
				fareHolderMap.get(payer).addexpense(tranBill-share);
								
				for (int j2 = 0; j2 < nbrOfSharers; j2++) {
					sharer = br.readLine();
					fareHolderMap.get(sharer).addDue(share);
				}
			}
		}
		for (Iterator<String> iterator = fareHolderMap.keySet().iterator(); iterator.hasNext();) {
			System.out.println(fareHolderMap.get(iterator.next()));
		}
		
		br.close();
	}
}

class FareHolder {

	private Integer paid;
	private String name;
	private Integer due;
	private Integer expense;
	public FareHolder(String name, Integer paid, Integer due,Integer expense){
		this.name = name;
		this.paid = paid;
		this.due = due;
		this.expense = expense;
	};

	public void addPaid(Integer paid)
	{
		this.paid += paid;
	}

	public void addDue(Integer due)
	{
		this.due += due;
	}
	
	public void addexpense(Integer expense)
	{
		this.expense += expense;
	}
	
	
	public String toString1() {
		return "("+paid +","+ due+","+expense+")" ;
	}
	
	public String toString() {
		int amt = paid-expense-due;
		if (amt<0)
			return (name + " owes " + Math.abs(amt));
		else if (amt>0)
			return (name + " is owed " + Math.abs(amt));
		else
			return (name + " neither owes nor is owed");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paid == null) ? 0 : paid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		FareHolder other = (FareHolder) obj;

		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		return true;
	}
}
