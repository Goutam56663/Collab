class CompareOverload {
    void compare(int a, int b) {
        System.out.println("Greater integer: " + (a > b ? a : b));
    }

    void compare(char c1, char c2) {
        System.out.println("Character with larger numeric value: " + (c1 > c2 ? c1 : c2));
    }

    void compare(String s1, String s2) {
        System.out.println("Longer string: " + (s1.length() > s2.length() ? s1 : s2));
    }

    public static void main() {
        CompareOverload ob = new CompareOverload();
        ob.compare(10, 25);
        ob.compare('A', 'Z');
        ob.compare("Java", "BlueJ");
    }
}