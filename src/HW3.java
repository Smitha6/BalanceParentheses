/**
 * Homework 3, Summer 2018
 *
 * Balance parentheses in a given string.
 * @author A. Smith
 *
 */

public class HW3 extends HW3_AbstractClass{

    //Testing
    public static void main(String args[]){
        HW3 hw3 = new HW3();
        String testString = "";



        //---Testing---
        testString = "(45)";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "54";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "string()";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = ")234(";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "(23) + (34";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "()";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "()24";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "21 ()";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "(123) + (123)";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "(123(23))";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "(12(2322)";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "(232";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "232)";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "(14)(450(45(5467))) + (46)(6(657))";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "asdasg(asdsfsa(fhg))";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "agh(";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "(dsf";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = ")gh";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "ert(";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "($%^$%)(gd(34))";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = ")#$][[]%%";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "#(($%[])%)";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));

        testString = "";
        System.out.println("Is " + testString + " balanced? --> " + hw3.isItBalanced(testString));



    }//--End Main---

    //To balance parentheses
    public boolean isItBalanced(String formula) {
        LinkedStack<Character> stack = new LinkedStack<>();
        char c;
        int size = 0;

        //loops through the formula string
        for (int i = 0; i < formula.length(); i++){
            c = formula.charAt(i);

            //if the string has a paren, add it to the stack
            if(c == '(' || c == ')'){
                stack.push(c);
                size++;

                //if the paren is closed, remove it and one of the opening ones
                if(stack.top() == ')'){

                    //if the first paren in the stack is a closed one, return false
                    if(size == 1)
                        return false;

                    stack.pop();
                    stack.pop();
                    size--;
                }
            }
        }//---End For Loop---

        //if everything hasn't been opened and close (removed from the stack) its not balanced
        if(!stack.isEmpty()){
            return false;
        }
        else
            return true;

    }//---End isItBalanced---

}//---End HW3---
