package com.hackerEarth.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class XsquareAndCoinCollection {
  
	private Integer nbrOfTestCases;
	private Integer nbrOfStacks;
	private Integer thresholdStackHight;
	private Integer []stack;
	private List<Integer> maxNbrOfCoins;
 
	public static void main(String[] args) throws Exception
	{
		XsquareAndCoinCollection xsquare = new XsquareAndCoinCollection();
 
		xsquare.inputNumberOfTestCases(xsquare);
 
		xsquare.setMaxNbrOfCoins(new ArrayList<Integer>());
		for (int i = 0; i <xsquare.getNbrOfTestCases() ; i++) 
		{
			xsquare.inputStackHightAndThreshold(xsquare);
			xsquare.inputStack(xsquare);
			xsquare.calculateMaxNbrOfCoins(xsquare);
		}
 
		xsquare.displayMaxCoins(xsquare);
 
	}
 
	private void displayMaxCoins(XsquareAndCoinCollection xsquare)
	{
		List <Integer> maxList;
		maxList = xsquare.getMaxNbrOfCoins();
		for(Integer nbr:maxList )
		{
			System.out.println(nbr);
		}
	}
 
	private void calculateMaxNbrOfCoins(XsquareAndCoinCollection xsquare)
	{
		Integer []stack;
		Integer maxNbsOfCoins=0;
		Integer nbrOfStacks;
		Integer threshold;
		Integer inc=0;
		List<Integer> maxList  = null;
		try
		{
			maxList = xsquare.getMaxNbrOfCoins();
			stack = xsquare.getStack();
			threshold = xsquare.getThresholdStackHight();
			nbrOfStacks = xsquare.getNbrOfStacks();
			for(int i= 0; i<nbrOfStacks; i++)
			{
				if(stack[i]<=threshold)
				{	
					inc+=stack[i];
				}
				else
				{
					if(maxNbsOfCoins<inc)
						maxNbsOfCoins= inc;
					inc=0;
				}
			}
			maxList.add(maxNbsOfCoins);			
		}
		catch(Exception e)
		{
			System.out.println("expections"+e);
		}
		
	}
 
	private void inputStack(XsquareAndCoinCollection xsquare)
	{
		String []stackStr;
		Integer []stack;
		BufferedReader br;
		String line;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
			
			stackStr = line.split(" ");
			stack = new Integer[xsquare.getNbrOfStacks()];
			for(int i=0; i<xsquare.getNbrOfStacks(); i++)
			{
				stack [i] = Integer.parseInt(stackStr [i]); 
			}
			xsquare.setStack(stack);
		} 
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
 
 
	}
 
	private void inputStackHightAndThreshold(XsquareAndCoinCollection xsquare) 
	{
		BufferedReader br;
		String line;
		String []inputArr ;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
			inputArr = line.split("\\s+");
			xsquare.setNbrOfStacks( Integer.parseInt(inputArr[0]));
			xsquare.setThresholdStackHight(Integer.parseInt(inputArr[1]));
 
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
 
	}
 
	private void inputNumberOfTestCases(XsquareAndCoinCollection xsquare)  
	{
		Integer nbrOfTestCases = 0;
		BufferedReader br;
		String line;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
			nbrOfTestCases = Integer.parseInt(line);
		} 
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		xsquare.setNbrOfTestCases(nbrOfTestCases);
	}
	
	//setters and getters
	public Integer getNbrOfTestCases() {
		return nbrOfTestCases;
	}
 
	public void setNbrOfTestCases(Integer nbrOfTestCases) {
		this.nbrOfTestCases = nbrOfTestCases;
	}
 
	public Integer getNbrOfStacks() {
		return nbrOfStacks;
	}
 
	public void setNbrOfStacks(Integer nbrOfStacks) {
		this.nbrOfStacks = nbrOfStacks;
	}
 
	public Integer getThresholdStackHight() {
		return thresholdStackHight;
	}
 
	public void setThresholdStackHight(Integer thresholdStackHight) {
		this.thresholdStackHight = thresholdStackHight;
	}
 
 
 
 
 
	public Integer [] getStack() {
		return stack;
	}
 
 
 
 
 
	public void setStack(Integer [] stack) {
		this.stack = stack;
	}
 
 
 
 
 
	public List<Integer>  getMaxNbrOfCoins() {
		return maxNbrOfCoins;
	}
 
 
 
 
 
	public void setMaxNbrOfCoins(List<Integer>  maxNbrOfCoins) {
		this.maxNbrOfCoins = maxNbrOfCoins;
	}
}
