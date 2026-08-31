package org.example;

public class App {

  
  public static void main(String[] args) {
    randomWalk walk = new randomWalk();

    int M = 1, N = 1000000; //M = number of trials, N = number of steps
    /* for the sake of timing, M is set to 1, and trials will be kept track of mannually */

    for (; M > 0; --M) { //for each value of M
        System.out.println("\nTrail(M): " + M + "       Number of steps (N): "+ N + "     Final position: " + walk.steps(N));
        }
    }
}
