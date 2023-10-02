# Assignment: A notebook application

Design and implement a JavaFX application using the MVC (Model-View-Controller) pattern, utilizing SceneBuilder and FXML. The goal is to create a simple note-taking application with the following features:

1. The application should have a graphical user interface (GUI) created in SceneBuilder, consisting of the following elements:

- A `TextArea` where users can write their notes.
- A `TextField` where users can enter the title of the note.
- A `Button` labeled **Add** that, when clicked, saves the note.
- A container element, such as a `VBox` or `GridPane`, to arrange the elements.

2. When the user clicks the **Add** button, the application should save the note with its title and content. The saved notes should be displayed in a textual format, such as a separate section below the input elements.

3. Implement the Model, which represents the data and logic of the application. The Model should include the following classes:
   - `Note`: Represents a single note and has properties for the title and content of the note, along with appropriate getters and setters.
   - `Notebook`: Represents a collection of notes. The `Notebook` class should have a list structure to store the Note objects, as well as methods for adding and retrieving notes.

4. Implement the `Controller`, which serves as an intermediary between the `View` (GUI) and the `Model`. The `Controller` should have methods for handling user interactions and managing the notes. For example, when the user clicks the **Add** button, the `Controller` should create a new `Note` instance, populate it with the entered title and content, and add it to the `Notebook`.

5. Create an FXML file using SceneBuilder to define the layout of the GUI. Set the appropriate event handlers for the user interactions, such as button clicks, in the FXML file.

6. Create a main Java class to launch the application. In the main method, load the FXML file, instantiate the View, and set it as the application's primary stage.

For this assignment, you get points for the following:

1. The user interface is generated in SceneBuilder and the layout is defined in an FXML file. The user interface contains the required elements. (1 point)
2. The application reads the FXML file successfully and displays the user interface. (1 point)
3. The application has the Model classes `Note` and `Notebook` with the relevan properties and methods (1 point)
4. The application has the Controller class `NoteController` with the required methods. (1 point)
5. When the user writes a note and clicks the **Add** button, the note is saved and successfully displayed in a textual format. (2 points)

Optional advanced tasks for extra points:

6. Learn about the `ListView` element in JavaFX. Use the `ListView` element to display the notes. (+1 point)
7. Provided that you use the `ListView` element, implement a feature where the user can select a note from the list and edit or delete it. (+1 point)