java 8:-Features 

 benefit's:- 1)it reduce the code
            2)it use for functional  programing benefit's
            3)to enable the parallel programing enable multicore code with multi core processor 
      

Default method:- the methods that are with body is called Default
                - we can directly use without overriding them

Static methods:- the method that are declared inside the interface with static keyword or declared with the abstract keyword 
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


3)Stream api :- Stream API represents a sequence of elements obtained from a data source (such as a Collection, Array, or I/O channel) that supports functional-style operations like filtering, mapping, sorting, and aggregation.


Java is object-oriented but not fully object-oriented because it supports primitive data types, static methods, and static variables that can be accessed without creating objects. Additionally, from Java 8 onwards, interfaces can have static and default method implementations, which can be executed without object creation. These features violate pure object-oriented principles.
 
3)Stream api 
 
