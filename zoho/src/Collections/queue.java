package Collections;

import java.util.*;

public class queue {

	
	static boolean balanceBracket(String expr)
    {
        Deque<Character> stack
            = new ArrayDeque<>();
 
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();

                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        return (stack.isEmpty());
    }
    public static void main(String[] args)
    {
        String expr = "([{}])";
 
        if (balanceBracket(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
        
        
        Deque<Integer> ss = new ArrayDeque<>();
        ss.push(3);
        ss.push(2);
        ss.add(21);
        System.out.println(ss.poll());
        System.out.println(ss);
        System.out.println(ss.pop());
        System.out.println(ss);
    }
}