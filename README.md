java 8:-Features 

 benefit's:- 1)it reduce the code
            2)it use for functional  programing benefit's
            3)to enable the parallel programing enable multicore code with multi core processor 
      

Default method:- the methods that are with body is called Default
                - we can directly use without overriding them
- what is the use of default methods
                - Default methods avoid breaking existing code when new methods are added to an interface.

Static methods:- the method that are declared inside the interface with static keyword or declared with the abstract keyword
    to allow utility mehods in interfaces and support interface evolution without breaking existing implmenation 
  - it contain the complete definition of function because it cannot override
  - we can declared the main method inside the interface in java 8 version  


1)Functional Interface :- the interface   that conation only one abstract  methos is called is Function Interface but it can have any number of default and static method
                         - by using this we can achieve lambda expression


what is advantage of @FuntionalInterface Annotation
-it restrict the interface to be Functional Interface
-if any one after using lambda expression can add any abstract method in interface it give error
 
                   
                         
2)Lambada Expression(anonymous function ) :- the expression without return type, without access modifier and without method name 
by using Lambada Expression we can write implementation of Functional Interface 
it unable the funcational programing also 

-- by using lambda expression we don't need any to use any separate implementation class  

-- it also  use to reduce boiler plate code
-by using this we can implement method logic without creating object



3)Stream api :- Stream API represents a sequence of object obtained from a data source (such as a Collection, Array, or I/O channel) that supports functional-style operations like filtering, mapping, sorting, and aggregation.



Java is object-oriented but not fully object-oriented because it supports primitive data types, static methods, and static variables that can be accessed without creating objects. Additionally, from Java 8 onwards, interfaces can have static and default method implementations, which can be executed without object creation. These features violate pure object-oriented principles.
 
3)Stream api :-Stream API represents a sequence of object obtained from a data source (such as a Collection, Array, or I/O channel) that supports functional-style operations like filtering, mapping, sorting, and aggregation.




collection                   vs         stream api 
 Feature	Collection	Stream API
Nature	Data structure 	Data processing API
Purpose	Stores elements 	Processes elements
Storage	Holds data in memory	    Does not store data
Mutability	Can be modified           	Does not modify source
Traversal	External iteration (for, iterator)	  Internal iteration
Reusability	Can be reused	Stream can be used only once
Execution	Eager evaluation	       Lazy evaluation
Parallelism	Not directly supported        	Parallel streams supported
Thread Safety	Depends on implementation	   Safe for parallel processing
Performance	Normal	                        Better for bulk operations
Java Version	Available since Java 1.2	       Introduced in Java 8




Java 8 was introduced to bring functional programming features, improve collection processing with Streams, enable parallelism, and make Java code more concise and readable.
To support Functional Programming
To process data easily using Streams API
To enable Parallel Processing 
To solve interface evolution problem (Default methods)
To improve performance & code readability




-what is filter, map reduce
“In Java Streams, filter() is used to select elements based on a condition, 
map() is used to transform elements, and 
sorted() is used to arrange elements in a specific order.”



-sequence stream and parallel stream
-what is map and what is flat-map


reference comparison : 









