package com.tech.online;

import java.util.Scanner;

public class OnlineExaminationSystem {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        // Sample Questions, Options, and Answers
        String[] questions = {"What is 2 + 2?", "What is the capital of France?", "Who is the president of the USA?"};
        String[][] options = {{"4", "3", "5", "2"}, {"London", "Paris", "Berlin", "Rome"}, {"Donald Trump", "Joe Biden", "Barack Obama", "George Washington"}};
        char[] answers = {'A', 'B', 'B'};
        int timeLimit = 10; // Time limit for the exam in minutes

        Exam exam = new Exam(questions, options, answers, timeLimit);

        System.out.println("-----Welcome to Online Examination System-----");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User("admin", "admin123"); // Sample user credentials

        if (user.authenticate(username, password)) {
            System.out.println("Authentication Successful. You can now proceed.");
            exam.conductExam();
        } else {
            System.out.println("Invalid username or password. Exiting...");
        }
    }

		

	}


