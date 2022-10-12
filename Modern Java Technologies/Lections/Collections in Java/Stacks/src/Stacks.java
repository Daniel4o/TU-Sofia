import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Stack<String> games = new Stack<String>();
        games.push("Fifa");
        games.push("Minecraft");
        games.push("Wow");
        games.push("GTA");

        System.out.println("Removes the last added game: " + games.pop());
        System.out.println( games);
        System.out.println("Peeks through the last game without removing: " +games.peek());
        System.out.println("Removes the last second added game: " + games.pop());
        System.out.println("\n" +games);
        System.out.println(games.peek());
    }
}
