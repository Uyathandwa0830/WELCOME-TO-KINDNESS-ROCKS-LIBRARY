The Library Management System is a software system that helps libraries manage book inventories and member registrations efficiently. It includes features like adding new books, enrolling new members, searching for books by title or author, and managing book checkouts. This system prioritizes error handling, including exceptions for graceful error management, assertions for program state validation, collections and generics for efficient data management, and regular expressions for input validation and search capabilities.
The system is comprised of various components:
Book Class: A book entity that has characteristics such as title, author, ISBN, and isAvailable. It includes a technique for changing the availability state of the book.
Member Class: A library member's properties include their name, email address, and a list of books they have borrowed. During member creation, the email format is validated using regular expressions.
Collections: Generic collections are used to handle books and members in the library system. Lists of type <Book> and <Member> are used for flexible and type-safe data management.
Search functionality: Users may use string manipulation and search algorithms to find books by title or author. The search functionality is case insensitive, improving the user experience.
Handling Book Checkouts: The system provides a checkout mechanism that allows members to borrow books that are available. Exceptions are used to manage situations in which books are not accessible for checkout, ensuring that operations go smoothly.
Assertions and Input Validation: Assertions are used to verify correct book checkout and return procedures. Input validation uses regular expressions and exceptions to prevent incorrect data from being entered.




