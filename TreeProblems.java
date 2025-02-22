/*
 * *** Keiron Coolen COMP 272 Section 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

     
    /*
      Two temporary sets, tempSetA & tempSetB are created for set A and set B
      From tempSetA, all elements of set B is removed    
      From tempSetB, all elements of set A is removed     
      The elements from tempSetA and tempSetB are combined
      tempSetA is returned 
    */
    Set<Integer> tempSetA = new TreeSet<>(setA);
    Set<Integer> tempSetB = new TreeSet<>(setB);
    tempSetA.removeAll(setB);
    tempSetB.removeAll(setA);
    tempSetA.addAll(tempSetB);
    return tempSetA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.
    /*
      Nothing is returned if the tree is empty
      A list is created to store the even keys
      The even keys are added to the list after looping through the treeMap
      The even key is then removed from the treeMap after looping through the list 
    */
    if (treeMap.isEmpty()) {
      return;
    }
    List<Integer> evenKeys = new ArrayList<>();
    for (Integer index: treeMap.keySet()) {
      if (index % 2 == 0) {
        evenKeys.add(index);
      }
    }
    for (Integer key: evenKeys) {
      treeMap.remove(key);
    }
    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE
    // Simple check if tree1 is equal to tree2
    return tree1.equals(tree2);

  }

} // end treeProblems class
