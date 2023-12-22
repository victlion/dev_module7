package org.example;

import org.example.dao.InsertTable;

public class Main {
    public static void main(String[] args) {
        InsertTable insertTable = new InsertTable();

        insertTable.addWorker(1, "John", "1995-05-08", "Trainee", 1000);
        insertTable.addWorker(2, "William", "1983-02-08", "Trainee", 1010);
        insertTable.addWorker(3, "James", "1975-05-02", "Junior", 1150);
        insertTable.addWorker(4, "Christopher", "1990-05-09", "Junior", 1100);
        insertTable.addWorker(5, "Daniel", "1997-06-08", "Middle", 1400);
        insertTable.addWorker(6, "Liam", "1985-07-08", "Middle", 1560);
        insertTable.addWorker(7, "Lucas", "1995-05-09", "Middle", 2000);
        insertTable.addWorker(8, "Mark", "1984-01-02", "Middle", 2500);
        insertTable.addWorker(9, "Michael", "1970-12-12", "Senior", 3000);
        insertTable.addWorker(10, "Noah", "1980-11-08", "Senior", 4500);

        insertTable.addClient(1, "Steven");
        insertTable.addClient(2, "Alexander");
        insertTable.addClient(3, "Kenneth");
        insertTable.addClient(4, "Richard");
        insertTable.addClient(5, "Thomas");

        insertTable.addProject(1, 1, "2024-01-05");
        insertTable.addProject(2, 1, "2024-08-06");
        insertTable.addProject(3, 2, "2024-06-07");
        insertTable.addProject(4, 2, "2024-02-05");
        insertTable.addProject(5, 2, "2024-03-05");
        insertTable.addProject(6, 3, "2024-04-10");
        insertTable.addProject(7, 4, "2024-10-10");
        insertTable.addProject(8, 3, "2024-09-08");
        insertTable.addProject(9, 4, "2024-01-09");
        insertTable.addProject(10, 5, "2024-09-02");

        insertTable.addProjectWorker(1, 2);
        insertTable.addProjectWorker(2, 3);
        insertTable.addProjectWorker(3, 1);
        insertTable.addProjectWorker(4, 5);
        insertTable.addProjectWorker(5, 4);
        insertTable.addProjectWorker(6, 7);
        insertTable.addProjectWorker(7, 10);
        insertTable.addProjectWorker(8, 6);
        insertTable.addProjectWorker(9, 8);
        insertTable.addProjectWorker(10, 9);
    }
}
