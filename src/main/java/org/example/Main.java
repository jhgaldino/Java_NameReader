package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        try {
            List<String> names = Files.readAllLines(Paths.get("src/main/resources/names.txt"));
            NomeSorter sorter = new NomeSorter();
            List<String> sortedNames = sorter.sortNames(names);
            sortedNames.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}