package org.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_DictionariesAndMaps {
    /**
     * Problem Statement -
     * [Dictionaries and Map](https://www.hackerrank.com/challenges/30-dictionaries-and-maps)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());
        int c = 0;
        Map<String, String> phones = new HashMap<>();
        String[] phone;
        while (c < n) {
            phone = scan.nextLine().trim().split(" ");
            phones.put(phone[0], phone[1]);
            c++;
        }
        String query;
        while (scan.hasNext()) {
            query = scan.nextLine().trim();
            String test = phones.get(query);
            if (phones.get(query) == null || phones.get(query).isEmpty())
                System.out.println("Not found");
            else
                System.out.println(query + "=" + phones.get(query));

        }
        scan.close();
    }
}
