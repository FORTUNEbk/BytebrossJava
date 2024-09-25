# BytebrossJava
# Money comparison
This Java code defines a class called `MoneyOperations` with a nested class `money` that handles basic operations on two amounts of money, `money1` and `money2`. The `money` class has a constructor that initializes these amounts. It also provides three methods: `sum()`, which adds `money1` and `money2` and returns the result; `comparison()`, which compares the two amounts and returns the greater value while printing which one is greater; and `subtraction()`, which subtracts `money2` from `money1` and returns the result, but if the result is negative, it prints a warning and returns `0`. The `main` method demonstrates the use of the `money` class by creating an object `mon` with values `300` and `200` and calling these methods, printing the results to the console.

# Card Sorting
This code defines a card sorting system. The `Card` class represents a playing card with a `value` (2–14, where 11–14 represent Jack, Queen, King, and Ace) and a `suit` (CLUB, DIAMOND, HEART, SPADE, using an enum). Cards are compared by value and suit. The `Hand` class stores a list of `Card` objects and can sort them either by value or by suit. The hand's total value is calculated by summing the values of all its cards, and hands can be compared based on this total. The `Main` class demonstrates creating and printing three cards.

# Compare To
This code defines a `Human` class and a `MainProgram` to demonstrate sorting a list of humans by their wage. The `Human` class has two fields: `name` (a string) and `wage` (an integer). It implements the `Comparable` interface, allowing humans to be compared based on their wage in descending order. The `compareTo` method achieves this by subtracting the wage of the current object from the wage of the compared human. The `MainProgram` creates a list of humans with different names and wages, adds them to an ArrayList, and then prints the list. However, the list is not sorted before printing.

# Crud Operation
This code creates a simple CRUD API for managing products using Spring Boot. It has a `ProductController` class that handles HTTP requests to add, update, retrieve, and delete products. The `Product` class represents the product entity with fields like `id`, `name`, `quantity`, and `price`. The `ProductRepository` interface extends Spring Data JPA to provide basic database operations, while the `ProductService` class contains the logic to interact with the repository and handle product-related operations. Finally, the `CrudOperationApplication` class starts the Spring Boot application.

# Enums Collections
This code demonstrates how to use enums in Java by creating a `Transport` enum with values like `TRAIN`, `PLANE`, and `AUTOMOBILE`. In the first class, `Enums`, an enum value is checked using an `if` condition, and depending on whether the value is `AUTOMOBILE`, a message is printed. In the second class, `EnumsComparison`, the equality of two enum values is compared, and a `switch` statement is used to print a message based on the transport type. In the third class, `TransportModified`, the enum includes a speed for each transport, and the speed of `AUTOMOBILE` is printed, along with a comparison using the enum's ordinal value to check its position in the list.

# 
