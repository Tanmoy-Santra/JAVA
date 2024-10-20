public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";

        // Using length()
        System.out.println("Length: " + str.length()); // 15

        // Using trim()
        System.out.println("Trimmed: '" + str.trim() + "'"); // "Hello, World!"

        // Using toLowerCase() and toUpperCase()
        System.out.println("Lowercase: " + str.toLowerCase()); // " hello, world! "
        System.out.println("Uppercase: " + str.toUpperCase()); // " HELLO, WORLD! "

        // Using substring()
        System.out.println("Substring: " + str.substring(7, 12)); // "World"

        // Using indexOf()
        System.out.println("Index of 'o': " + str.indexOf('o')); // 8

        // Using replace()
        System.out.println("Replace 'o' with '0': " + str.replace('o', '0')); // " Hell0, W0rld! "

        // Using split()
        String[] parts = str.split(", ");
        System.out.println("Split: " + String.join(" | ", parts)); // " Hello | World! "

        // Using startsWith() and endsWith()
        System.out.println("Starts with '  He': " + str.startsWith("  He")); // true
        System.out.println("Ends with '!  ': " + str.endsWith("!  ")); // true

        // Using contains()
        System.out.println("Contains 'World': " + str.contains("World")); // true

        // Using concat()
        System.out.println("Concatenated: " + str.concat(" How are you?")); // " Hello, World! How are you?"
    }
}
