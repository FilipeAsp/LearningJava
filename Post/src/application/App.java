package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Post post = new Post(
                LocalDateTime.parse("21/06/2018 13:05:44", fmt),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        post.addComment(new Comment("Have a nice trip"));
        post.addComment(new Comment("Wow that's awesome!"));

        Post post2 = new Post(
                LocalDateTime.parse("28/07/2018 23:14:19", fmt),
                "Good night guys",
                "See you tomorrow",
                5);

        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));

        System.out.println(post);
        System.out.println(post2);

        sc.close();
    }
}
