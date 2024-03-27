package com.tech.online;

import java.util.Scanner;

public class Exam 
{
	private String[] questions;
    private String[][] options;
    private char[] answers;
    private int timeLimit;

    public Exam(String[] questions, String[][] options, char[] answers, int timeLimit) {
        this.questions = questions;
        this.options = options;
        this.answers = answers;
        this.timeLimit = timeLimit;
    }

    public void conductExam() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to the Online Examination:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((char) ('A' + j) + ") " + options[i][j]);
            }
            System.out.print("Your answer (A/B/C/D): ");
            char answer = Character.toUpperCase(scanner.next().charAt(0));
            if (answer == answers[i]) {
                score++;
            }
        }
        System.out.println("Your Score: " + score + " out of " + questions.length);
    }
}



