package intro_to_array_lists;

import java.awt.List;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> PetNames = new ArrayList<String>();
		//2. Add five Strings to your list
	PetNames.add("Wesley");
	PetNames.add("Sam");
	PetNames.add("Dylan");
	PetNames.add("Sean");
	PetNames.add("Jonathan");
		//3. Print all the Strings using a standard for-loop
	System.out.println("Here are some pet names for y'all to enjoy:");
	for(int i = 0; i < PetNames.size(); i++){
		String s = PetNames.get(i);
		System.out.println("String at element " + i + " " + s);	
		//4. Print all the Strings using a for-each loop
		for(String s1: PetNames) {
		System.out.println("There are many names you can give your pet dog, cat, fish, bird, or ferrett!!");
		System.out.println("You can buy pets from breeders and at stores such as Petco and Helen Woodward.");
		}
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}}
