/*
 * *** Fiore Cassettari 002 ***
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

    //copy the sets
    Set<Integer> union = new TreeSet<>(setA);
    Set<Integer> intersection = new TreeSet<>(setA);
    union.addAll(setB);
    intersection.retainAll(setB); //removes all items from the set not in the setB
    union.removeAll(intersection); //removes all the items still in intersection from the union treeset

    return union;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    //i'm using an iterator because it can actually remove elements from the underlying collection
    Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
    //iterate the treemap
    while (iterator.hasNext()) {
      Map.Entry<Integer, String> entry = iterator.next();
      if (entry.getKey() % 2 == 0) { // if the key is even, remove it from the treemap
        iterator.remove();
      }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    return tree1.equals(tree2); //map class has a built-in method to do exactly this
  }

} // end treeProblems class
