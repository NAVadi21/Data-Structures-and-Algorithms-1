/*
 * A set up where there are 3 towers and discs of different sizes are to be transported from tower 1 to tower 3
 * Rules are Simple, solution isnt
 * Rule 1: Only one disc moves at a time,
 * Rule 2: Only the top most disc in a tower can be moved 
 * Rule 3: No larger disc can be placed on top of a smaller disc
 */
public class TowerOfHanoi {
    // Method to solve the Tower of Hanoi problem
    public static void solveTowerOfHanoi(int n, char source, char auxiliary, char destination) {
        // Base case: If there is only one disk, move it from source to destination
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary tower using the destination tower
        solveTowerOfHanoi(n - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary tower to destination using the source tower
        solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numDisks = 3;
        char sourceTower = 'A';
        char auxiliaryTower = 'B';
        char destinationTower = 'C';

        System.out.println("Tower of Hanoi solution:");
        solveTowerOfHanoi(numDisks, sourceTower, auxiliaryTower, destinationTower);
    }
}
