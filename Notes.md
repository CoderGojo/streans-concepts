# Notes

## Java Streams:

  # Collection:
    - To represent group of data/subjects as single entity.
  # Stream:
    - To process the data from collection we use streams concept.
    
## Lambdas:
   - Back to the example of inline Strings and numbers. Just like you can pass an inline String value to a method, you can pass in an "inline" lambda expression tool
   - It is actually invalid to specify the return keyword when you have a one liner lambda expression without {}!
   - Implicit rule for lambdas expression is the interface should have one function as to when to implement the function
   - By calling the interface method on it, just as if it were an instance of class.
   - Runnable has a single method. If it had more than one method you could not have written a lamda function of that type.
   - A functional interface is an interface that contains only one abstract method
   - Functional Interface is additionally recognized as Single Abstract Method Interfaces (SAM).
   - Functional interfaces are used and executed by representing the interface with an annotation called @FunctionalInterface.
 
 ## What are Streams?
   - A sequence of elements supporting sequential and parallel aggregate operations. 

## Stream Operations

  ## Filter
   - A condition needs to be fulfilled so as to collect the filtered data on the collections.
   - Predicate Function is required for filter.

  ## Map
   - It is used to transform the data from the source to the target.
   - Mapper Function is required for Map to transform the data.

  ## Process - Map
   - collection --> stream --> filter --> map --> collect.