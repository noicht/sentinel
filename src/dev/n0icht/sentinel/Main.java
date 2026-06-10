package dev.n0icht.sentinel;
import  java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        String command = "start";
        String msg = switch (command) {
            case "start" -> "puto";
            case "stop" -> "de mierda";

            default -> "no se que quisiste decir pero chupala";
        };
        System.out.println(msg);


        List<String> papa = List.of("la", "concha", "de", "tu madre");

        for (String name : papa) {
            System.out.println(name);
        }
    }
}