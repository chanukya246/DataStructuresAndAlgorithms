package com.sports.play;

import java.lang.Math;

public class AdventOfCode1 {

    private static int horizontalDist = 0, verticalDist = 0, facing = 1;

    public static void main(String[] args) {
        String[] dirs = "R2,R2".split(",");
        shortestPath(dirs);
    }

    public static void shortestPath(String[] dirs) {

        for (String direction : dirs) {
            int distance = Integer.parseInt(direction.trim().substring(1));
            char turning = direction.trim().charAt(0);
            switch (facing) {
                case 1:
                    horizontalDist += turning == 'L' ? -distance : distance;
                    break;
                case 2:
                    verticalDist += turning == 'L' ? -distance : distance;
                    break;
                case 3:
                    horizontalDist += turning == 'L' ? distance : -distance;
                    break;
                case 4:
                    verticalDist += turning == 'L' ? distance : -distance;
                    break;
            }
            facing += turning == 'L' ? 1 : -1;
            facing = facing == 5 ? 1 : facing == 0 ? 4 : facing;
        }
        int totalDistance = Math.abs(horizontalDist) + Math.abs(verticalDist);
        System.out.println("Easter Bunny is " +  totalDistance + " blocks away.");
    }

}