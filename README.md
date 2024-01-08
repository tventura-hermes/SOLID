## Project Information

Research on SOLID Principles in Programming

SRP (Single Responsibility Principle): In this project, classes have been created to fulfill a single function, meaning they only have to respond to one responsibility. An example of this can be seen in the multiple classes created in this code, making it easier to modify the code without affecting other classes.

OCP (Open/Closed Principle): The code can be extended without the need to modify existing classes. An example of this is in the login method, where an interface called 'authentication' is utilized. From this interface, the current login methods are created—either through a token or through a password. If another login method is desired, a new class implementing the 'authentication' interface can be added without modifying existing code.

LSP (Liskov Substitution Principle): The implementation of this principle is found in the classes 'superUser' and 'commonUser,' both extending the 'userFormat' class, which, in turn, extends the 'user' class. This allows the 'superUser' class to have permissions that the 'commonUser' class does not. Consequently, during login, the 'commonUser' cannot access the 'editor' attribute possessed by the 'superUser,' preventing exceptions in the code.

ISP (Interface Segregation Principle): Similar to the first principle where each class has its unique responsibility, this principle ensures that each 'client' has its own interface. For example, in the code, there are separate interfaces for login, data authentication, user entry, and the user object.

DIP (Dependency Inversion Principle): This principle encourages not connecting classes directly but using interfaces as intermediaries. This makes code changes less problematic. An example of this is the 'userInterface' interface, which serves as an intermediary between login and the user class that has the constructor, as well as access to the 'getter & setter' methods. Similarly, it allows connecting the 'user' class to 'userFormat' without the need to directly pass the 'user' object as a parameter.