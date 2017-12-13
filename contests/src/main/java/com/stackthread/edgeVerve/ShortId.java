package com.stackthread.edgeVerve;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ShortId {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbrOfParticipants = sc.nextInt();
		List <Integer> participantList = new ArrayList<Integer>();
		for (int i = 0; i < nbrOfParticipants; i++) {
			participantList.add(sc.nextInt());
		}
		sc.close();
		
		System.out.println(computeShortId(participantList));
	}

	private static Integer computeShortId(List<Integer> participantList) {
		Integer shortId = 2;
		int idx = 0, modulo = 0;
		int nbrOfParticipants = participantList.size();
		Set<Integer> keySet = new HashSet<Integer>(nbrOfParticipants);
		
		while(idx < nbrOfParticipants) {
			modulo = participantList.get(idx)%shortId;
			if(keySet.contains(modulo))
			{
				keySet.removeAll(keySet);
				idx=0;
				shortId++;
			}
			else
			{
				keySet.add(modulo);
				idx++;
			}
		}
		return shortId;
	}
}
