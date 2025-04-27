# CodeAlpha_Project_ArtificialIntelligenceChatbot

NAME:M.SAISREE

STUDENTID:CA/AP1/3057

COMPANY:CODEALPHA

DOMAIN:JAVA PROGRAMMING

DURATION:APRIL TO MAY 2025

**OVERVIEW OF THE PROJECT**

 **Simple Java ChatBot**
 
This project is a console-based ChatBot built in Java.
It uses a basic pattern-matching approach to understand user inputs and respond appropriately based on predefined intents.

**Features**

->Recognizes simple greetings, goodbyes, thanks, and inquiries about working hours.

->Randomly selects a response from a list to make conversations feel more natural.

->Easy-to-extend — you can add more patterns and responses easily.

->Simple and beginner-friendly Java project.

 **Technologies Used**
 
->Java SE (Standard Edition)

->ArrayList, Arrays, and Hashing (Random)

->Scanner for console-based input/output

->Object-Oriented Programming (Classes and Objects)

**Project Structure**

->ChatBot.java

->Main class that handles user interaction.

->Loads predefined intents (categories of user input).

->Matches user input to patterns and selects appropriate responses.

->Ends conversation gracefully when the user types "quit".



**Example Conversation**

ChatBot: Hello! Type 'quit' to exit.

You: hi

ChatBot: Hey! How can I help you?

You: what are your working hours

ChatBot: We're open from 9am to 5pm, Monday to Friday.

You: thank you

ChatBot: You're welcome!

You: bye

ChatBot: Goodbye!

**How It Works**

->Intents are predefined categories like "greeting", "goodbye", "thanks", and "hours".

->Each intent has:

->A list of patterns (words or phrases the user might say)

->A list of possible responses

->The bot checks if the user's input contains any pattern and replies with a random response from the matching intent.

**Future Enhancements**

->Improve matching to handle exact phrases and partial matches more intelligently.

->Add support for more complex conversations (context management).

->Integrate Natural Language Processing (NLP) for smarter replies.

->Create a GUI version using Java Swing or JavaFX.

**OVERVIEW OF THE CODE**

The Simple Java ChatBot is a console-based application that interacts with the user by matching input phrases against predefined intents and providing appropriate randomized responses.


**Main Components:**

1. **Intent Class**

->Represents a conversational intent (e.g., greeting, goodbye).

->Contains:

*tag: Name of the intent (like "greeting", "goodbye").

*patterns: List of possible user inputs related to that intent.

*responses: List of possible bot responses.

2. **intents List**

->A list of all available intents.

->Each intent includes patterns to recognize and corresponding responses.

3.**loadIntents() Method**

->Initializes the chatbot by creating and loading several intents into the intents list.

->Example intents:

*greeting: "hello", "hi", "good morning"

*goodbye: "bye", "goodbye"

*thanks: "thanks", "thank you"

*hours: "hours", "open", "working hours"

4. **getResponse(String userInput) Method**
 
->Takes user input and checks if it matches any of the defined patterns in the intents.

->If a match is found:

->Returns a random response from the matched intent's responses.

->If no match is found:

*Returns a default message like: "Sorry, I didn't understand that."

5. **main() Method**
 
->Starts the chatbot.

->Continuously reads user input using a Scanner.

->Displays chatbot responses.

->Ends the conversation when the user types "quit".

**Key Concepts Demonstrated**

->Object-Oriented Programming (OOP): Creation of the Intent class to model chatbot behaviors.

->String Matching: Simple matching of user inputs with intent patterns.

->Randomized Responses: Adding variety to replies using Java’s Random class.

->User Input Handling: Using Scanner for reading user input from the console.

->List and Array Operations: Managing multiple patterns and responses efficiently.
![Screenshot 2025-04-28 012141](https://github.com/user-attachments/assets/0cdc9f47-26f8-4f55-bf42-b9f35a65406b)


