import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> c = new Stack<>(); // Corrected to Character
        char[] ch = s.toCharArray(); // Convert string to character array

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '[' || ch[i] == '{') { 
                // Push opening brackets to the stack
                c.push(ch[i]);
            } else {
                // If stack is empty and we encounter a closing bracket
                if (c.isEmpty()) return false;

                // Check for matching pairs
                if (ch[i] == ')' && c.peek() != '(') return false;
                if (ch[i] == ']' && c.peek() != '[') return false;
                if (ch[i] == '}' && c.peek() != '{') return false;

                // If match is found, pop the opening bracket
                c.pop();
            }
        }
        
        // Return true if stack is empty (all brackets matched)
        return c.isEmpty();
    }
}
