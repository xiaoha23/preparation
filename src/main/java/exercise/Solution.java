package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
//
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(br.readLine());
        List<String> inputs = new ArrayList<>();
//        scan.nextLine();
        for (int i = 0; i < a; i++) {

            inputs.add(br.readLine());
        }
        List<String> converts =
            inputs.stream().map(
                input -> {
                    String[] names = input.split(" ");
                    String first = names[0];
                    String middle = names[1];
                    String last = names[2];
                    Integer age = Integer.valueOf(names[3]);
                    return last + " " + first + " " + middle + " " + age;
                }
        ).collect(Collectors.toList());

        Collections.sort(converts, new SortIgnoreCase());

        converts.stream().forEach(
                input -> {
                        String[] names = input.split(" ");
                        String first = names[1];
                        String middle = names[2];
                        String last = names[0];
                        Integer age = Integer.valueOf(names[3]);
                        System.out.println(first + " " + middle  + " " + last + " " + age);
                }
        );
    }
}

class SortIgnoreCase implements Comparator<Object> {
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s1.toLowerCase().compareTo(s2.toLowerCase());
    }
}