# design patterns
design pattern are very popular among software developers.
a design pattern is a well described solution to a common software problem, it saves time if we use them
using design patterns promotes reusability that leads to robust and highly maintainable code.
it makes our code easy to understand and debug.

### strategy design pattern
The Strategy pattern is known as a behavioural pattern - it's used to manage algorithms, relationships and responsibilities between objects.
we use strategy pattern when we want to choose the algorithm to use at runtime.

With using strategy pattern, we can avoid code smell in our code instead of using if-else or switch statements which indicates
that the code is more structural than object oriented. Because with using long conditional statements, when a new condition is added,
you have to find every occurrence of that switch case.
In this situation, we should think of strategy pattern.

I develop the strategy pattern in spring framework with using Java 8.
In our case, we have 2 different payment algorithms: CreditCard or PayPal
To do this, I have PaymentStrategy interface with pay method that takes amount,
then have two implementations, one for CreditCard and one for PayPal.
Next, we need a context which is the entry point for the client to call.

### factory design pattern
The Factory pattern is one of the creational patterns.
Factory pattern is used when we have a super class with multiple sub classes and based on a criteria,
we need to instantiate and return one of the sub classes.

In this example, I use factory pattern for user class hierarchy, when we need to create a user based on the user role.

The parent user object handle the most operations for each user but the subclasses handle the distinctions
One extension point to this implementation is to delegate creation of user to specific subclasses.

### singleton design pattern
We user singleton pattern when we need to have only one instance of our class and provide a global point of access to it.
there are two forms of singleton design pattern:
early instantiation: we create the instance at load time
lazy instantiation: we create the instance when required

To create the singleton class, we need to have:
static member of class
private constructor(prevent to instantiate the singleton class from outside the class)
static factory method (provides the global point to access to the singleton object and returns the instance to the client)

### builder design pattern
The Builder pattern is one of the creational patterns.
we use this pattern for complex objects and dealing with constructors that require too many parameters.