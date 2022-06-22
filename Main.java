package lalitGl.lab.driver;

import java.util.Arrays;
import java.util.Scanner;

import lalitGl.lab.service.MergeSort;
import lalitGl.lab.service.NotesCount;

public class Main {

	public static void main(String[] args) {

		MergeSort mergeSortImplementation = new MergeSort();
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes, amount);
	}
}
