public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 60;   // 0011 1100 in binary
        int b = 13;   // 0000 1101 in binary
        
        // Bitwise AND
        int andResult = a & b; // 0000 1100 (12 in decimal)
        System.out.println("a & b = " + andResult);

        // Bitwise OR
        int orResult = a | b; // 0011 1101 (61 in decimal)
        System.out.println("a | b = " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // 0011 0001 (49 in decimal)
        System.out.println("a ^ b = " + xorResult);

        // Bitwise Complement
        int complementResult = ~a; // 1100 0011 (-61 in decimal, due to sign bit)
        System.out.println("~a = " + complementResult);

        // Left Shift
        int leftShiftResult = a << 2; // 1111 0000 (240 in decimal)
        System.out.println("a << 2 = " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 2; // 0000 1111 (15 in decimal)
        System.out.println("a >> 2 = " + rightShiftResult);

        // Unsigned Right Shift
        int unsignedRightShiftResult = a >>> 2; // 0000 1111 (15 in decimal)
        System.out.println("a >>> 2 = " + unsignedRightShiftResult);
    }
}

