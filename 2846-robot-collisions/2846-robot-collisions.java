import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        List<int[]> robots = new ArrayList<>();
        
        // Combine position, health, and direction into a single list
        for (int i = 0; i < n; i++) {
            robots.add(new int[]{positions[i], healths[i], directions.charAt(i), i});
        }
        
        // Sort robots by their positions
        robots.sort((a, b) -> Integer.compare(a[0], b[0]));
        
        // Use a stack to keep track of surviving robots
        Deque<int[]> stack = new ArrayDeque<>();
        
        for (int[] robot : robots) {
            int pos = robot[0];
            int health = robot[1];
            char dir = (char) robot[2];
            
            if (dir == 'R') {
                stack.push(robot);
            } else {
                while (!stack.isEmpty() && stack.peek()[2] == 'R') {
                    int[] top = stack.peek();
                    if (top[1] > health) {
                        top[1] -= 1;
                        health = 0;
                        break;
                    } else if (top[1] < health) {
                        health -= 1;
                        stack.pop();
                    } else {
                        health = 0;
                        stack.pop();
                        break;
                    }
                }
                if (health > 0) {
                    robot[1] = health;
                    stack.push(robot);
                }
            }
        }
        
        // Create an array to store the health of surviving robots
        int[] finalHealths = new int[n];
        Arrays.fill(finalHealths, -1);  // Initialize all to -1
        
        for (int[] robot : stack) {
            finalHealths[robot[3]] = robot[1];
        }
        
        // Collect the health of surviving robots in the original order
        List<Integer> res = new ArrayList<>();
        for (int health : finalHealths) {
            if (health != -1) {
                res.add(health);
            }
        }
        
        return res;
    }
}
