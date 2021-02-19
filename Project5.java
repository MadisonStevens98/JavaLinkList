/*
Madison Stevens
CompSci 182/182L
11-16-17
 */
//this .java is what builds the list, and tree, calls the tree.java to insert the data,
//calls the methods, and shows the user their output
package project5;

import java.util.Scanner;

public class Project5 {

    public static void main(String[] args) {
        Tree theTree = new Tree();
        Tree copytree = new Tree();
        int[] data = {50, 30, 60, 10, 80, 55, 40};
        for (int i = 0; i < data.length; i++) {
            theTree.insert(data[i]);
        }
        System.out.println("Here is what the max method output: " + theTree.max().iData);
        System.out.println("Here is what the count method found: " + theTree.count(theTree.root));
        System.out.println("Here is what the height method found: " + theTree.height(theTree.root));
        System.out.println("Here is what the sum method found: " + theTree.sum(theTree.root));
        System.out.println("Here is what the average method found: " + theTree.average(theTree.root));
        System.out.println("If you would like to check the find method, please type a value for the method to find. If null, the value is not in the tree. Please note this method returns a node: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.println(theTree.find(i));
    }
}
