public class BitOperations {
    // Method to print the binary representation of a decimal number
    public static void printBinary(int number) {
        System.out.println("Binary representation: " + Integer.toBinaryString(number));
    }

    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        // Bitwise AND (&)
        int bitwiseAnd = a & b;
        System.out.println("Bitwise AND: " + bitwiseAnd); // Output: 1 (Binary: 0001)
        printBinary(bitwiseAnd);

        // Bitwise OR (|)
        int bitwiseOr = a | b;
        System.out.println("Bitwise OR: " + bitwiseOr); // Output: 7 (Binary: 0111)
        printBinary(bitwiseOr);

        // Bitwise XOR (^)
        int bitwiseXor = a ^ b;
        System.out.println("Bitwise XOR: " + bitwiseXor); // Output: 6 (Binary: 0110)
        printBinary(bitwiseXor);

        // Bitwise NOT (~)
        int bitwiseNotA = ~a;
        System.out.println("Bitwise NOT (a): " + bitwiseNotA); // Output: -6 (Binary: 11111111111111111111111111111010)
        printBinary(bitwiseNotA);

        int bitwiseNotB = ~b;
        System.out.println("Bitwise NOT (b): " + bitwiseNotB); // Output: -4 (Binary: 11111111111111111111111111111100)
        printBinary(bitwiseNotB);

        // Left shift (<<)
        int leftShift = a << 2;
        System.out.println("Left Shift: " + leftShift); // Output: 20 (Binary: 10100)
        printBinary(leftShift);

        // Right shift (>>)
        int rightShift = a >> 1;
        System.out.println("Right Shift: " + rightShift); // Output: 2 (Binary: 0010)
        printBinary(rightShift);

        // Unsigned right shift (>>>)
        int unsignedRightShift = a >>> 1;
        System.out.println("Unsigned Right Shift: " + unsignedRightShift); // Output: 2 (Binary: 0010)
        printBinary(unsignedRightShift);
    }
}

// demonstration & implementaion of the bit operations in java
