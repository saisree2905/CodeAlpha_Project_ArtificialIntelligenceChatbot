import java.util.*;

public class ChatBot {

    static class Intent {
        String tag;
        List<String> patterns;
        List<String> responses;

        Intent(String tag, List<String> patterns, List<String> responses) {
            this.tag = tag;
            this.patterns = patterns;
            this.responses = responses;
        }
    }

    static List<Intent> intents = new ArrayList<>();
    static Random random = new Random();

    public static void main(String[] args) {
        loadIntents();

        Scanner scanner = new Scanner(System.in);
        System.out.println("ChatBot: Hello! Type 'quit' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("quit")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            }

            String response = getResponse(input);
            System.out.println("ChatBot: " + response);
        }

        scanner.close();
    }

    // Match input to intent
    static String getResponse(String userInput) {
        for (Intent intent : intents) {
            for (String pattern : intent.patterns) {
                if (userInput.contains(pattern.toLowerCase())) {
                    return intent.responses.get(random.nextInt(intent.responses.size()));
                }
            }
        }
        return "Sorry, I didn't understand that.";
    }

    // Define chatbot intents
    static void loadIntents() {
        intents.add(new Intent("greeting",
                Arrays.asList("hello", "hi", "hey", "good morning", "good evening"),
                Arrays.asList("Hello!", "Hi there!", "Hey! How can I help you?")));

        intents.add(new Intent("goodbye",
                Arrays.asList("bye", "goodbye", "see you", "later"),
                Arrays.asList("Goodbye!", "See you soon!", "Take care!")));

        intents.add(new Intent("thanks",
                Arrays.asList("thanks", "thank you", "appreciate it"),
                Arrays.asList("You're welcome!", "No problem!", "Glad to help!")));

        intents.add(new Intent("hours",
                Arrays.asList("hours", "open", "working hours", "when are you open"),
                Arrays.asList("We're open from 9am to 5pm, Monday to Friday.")));
    }
}
