package src.lab6_1;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Program1 {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        HashMap<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put('{', '}');
        parenthesis.put('(', ')');
        parenthesis.put('[', ']');
        System.out.println("Введите строку из скобок");
        String str = console.nextLine();
        Stack<Character> stack = new Stack<>();
        try {
            for (char c : str.toCharArray()) {
                if (c == '[' || c == '(' || c == '{') {
                    stack.push(c);
                } else if (c == ']' || c == ')' || c == '}') {
                    if (parenthesis.get(stack.peek()) == c) {
                        stack.pop();
                    } else {
                        throw new Exception("Неверный порядок скобок");
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("Скобки расставлены правильно");
            }
            else {
                System.out.println("Открывающих скобок больше");
            }
        } catch (EmptyStackException e) {
            System.out.println("Закрывающая скобка без открывающей");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
