/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tackt
 */
public class model {
    
    String TextF ;
    int type ;
    
    
    public model(String TextF, int type) {
        this.TextF = TextF;
        this.type = type;
    }
    
    public void setTextF(String TextF) {
        this.TextF = TextF;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public String typecheck(){
    
    if(type==1){
        String patternS1 = "^SELECT ([0-9]+);$";
        String patternS2 = "^SELECT ([0-9]+) \\+ ([0-9]+);$";

        Matcher matcher1 = Pattern.compile(patternS1).matcher(TextF);
        Matcher matcher2 = Pattern.compile(patternS2).matcher(TextF);

        if (matcher1.matches()) {
            int number = Integer.parseInt(matcher1.group(1));
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;

            System.out.println( "Query: " + TextF + "\n" +
                   "Result: " + number + "\n" +
                   "Query Execution Time: " + elapsedTime + " ms");
        } else if (matcher2.matches()) {
            int number1 = Integer.parseInt(matcher2.group(1));
            int number2 = Integer.parseInt(matcher2.group(2));
            int sum = number1 + number2;
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;

            System.out.println("Query: " + TextF + "\n" +
                   "Result: " + sum + "\n" +
                   "Query Execution Time: " + elapsedTime + " ms");
        } else {
            System.out.println("Wrong Syntax!");
        }
    } else {
        String patternP1 = "^print ([0-9]+);$";
        String patternP2 = "^print ([0-9]+) \\+ ([0-9]+);$";
        
        Matcher matcherP1 = Pattern.compile(patternP1).matcher(TextF);
        Matcher matcherP2 = Pattern.compile(patternP2).matcher(TextF);
        if (matcherP1.matches()) {
            int number = Integer.parseInt(matcherP1.group(1));
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;

            System.out.println("Query: " + TextF + "\n" +
                   "Result: " + number + "\n" +
                   "Query Execution Time: " + elapsedTime + " ms");
        } else if (matcherP2.matches()) {
            int number1 = Integer.parseInt(matcherP2.group(1));
            int number2 = Integer.parseInt(matcherP2.group(2));
            int sum = number1 + number2;
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;

            System.out.println("Query: " + TextF + "\n" +
                   "Result: " + sum + "\n" +
                   "Query Execution Time: " + elapsedTime + " ms");
        } else {
            System.out.println("Wrong Syntax!");
        }
    }
        return null;
   }
}
    
    

    
    

