package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Fynn";
        } else if (query.contains("plus")) {
            String[] numbers = query.split("(what is )|( plus)");
            if(numbers.length > 1) {
                return "" + (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
            } else return "";
        } else if (query.contains("largest")) {
            String[] numbers = query.split(":|,");
            if(numbers.length > 2){
                return "" + (Math.max(Integer.parseInt(numbers[1]), Integer.parseInt(numbers[2])));
            } else {
                return "";
            }
        } else { // TODO extend the programm here
            return "";
        }
    }
}
