# Assignment: Virtual dictionary

Your task is to create a JavaFX application that functions as a virtual dictionary.
The dictionary allows users to search for words and view their meanings.

Steps to complete the assignment:

1. Create three classes: `Dictionary` (Model), `DictionaryController` (Controller), and `DictionaryView` (View).

2. The `Dictionary` class (Model) should be responsible for managing the dictionary data. It should include at least the following methods:
   - A method to add a word and its meaning to the dictionary.
   - A method to search for a word in the dictionary and retrieve its meaning.

3. The `DictionaryController` class (Controller) is responsible for the dictionary's functionality. It should interact with the `Dictionary` class to perform the search operation.

4. The `DictionaryView` class (View) is responsible for creating and displaying the user interface. Use a suitable layout (e.g., `FlowPane`) to display the components in the interface.

5. Create a JavaFX application with a user interface for the dictionary. The user interface should include the following components:
   - A text field where users can enter a word.
   - A button to trigger the search for a word.
   - A text area or label to display the word's meaning.

6. Use the methods from the `DictionaryController` class to interact with the dictionary in the user interface. For example, when the search button is pressed, the controller should search for the word in the dictionary.

7. Handle cases where the user enters an empty word or when the word is not found in the dictionary. Provide appropriate feedback to the user in the user interface.

8. Test your application by entering various words and verifying that the correct meanings are displayed. Also, test for cases where the word is not found in the dictionary and ensure appropriate feedback is given.

Hints:

- Use a `HashMap<String, String>` to store the dictionary's words and meanings efficiently.
- Handle empty word inputs and word not found cases gracefully in the user interface.
- Design an intuitive and user-friendly interface that allows users to interact with the dictionary effectively.
In this stage, you can temporarily hardcode a set of method calls to add words and their meanings in the controller's constructor to populate the dictionary with some content. This is a temporary solution, and later on, you can modify the implementation to load words from a file or a database.
- You can raise an exception if the word is not found in the dictionary and handle it in the controller's method that searches for the word. This way, the controller can return a message to the view that the word was not found, and the view can display the message to the user.
- Design your controller in such a way that JavaFX components are never passed to it. That is, do not pass a `TextField` but a `String` to the controller. This way, the controller is not dependent on JavaFX and can be reused in other applications.

You get points for this assignment in the following way:
1. The `Dictionary` class has the necessary properties and methods: 1 point
2. The `DictionaryView` class contains all the necessary components and is rendered correctly: 1 point
3. The `DictionaryController` class contains all the necessary methods: 1 point
4. The application reacts to the user pressing the search button: 1 point
5. The meaning of a word is displayed correctly when the user has searched for a word that is found in the dictionary: 1 point
6. The user is informed when the word is empty or not found in the dictionary: 1 point