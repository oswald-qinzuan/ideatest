class Solution {
    public String add(String a, String b) {
        // 使用BigInteger代替int来处理可能的大数值
        java.math.BigInteger numA = new java.math.BigInteger(a, 2);
        java.math.BigInteger numB = new java.math.BigInteger(b, 2);
        java.math.BigInteger sum = numA.add(numB);
        return sum.toString(2);
    }

    public String addBinary(String a, String b) {
        // 使用BigInteger代替Integer来处理大数值，避免整数溢出
        java.math.BigInteger numA = new java.math.BigInteger(a, 2);
        java.math.BigInteger numB = new java.math.BigInteger(b, 2);
        java.math.BigInteger sum = numA.add(numB);
        return sum.toString(2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.add("11", "1")); // Output: "100"

        // 测试大数值
        String longBinaryA = "1111111111111111111111111111111";
        String longBinaryB = "1";
        System.out.println(solution.add(longBinaryA, longBinaryB));

        // 测试addBinary方法
        System.out.println(solution.addBinary("11", "1")); // Output: "100"
        System.out.println(solution.addBinary(longBinaryA, longBinaryB));
    }
}

发v哦你就非得