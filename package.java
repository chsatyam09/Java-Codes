// https://www.simplilearn.com/tutorials/java-tutorial/packages-in-java

// A package is basically collection of different classes  Think of it as a folder in a file directory. which store many classes of functionality ..
// In other words we can say that package is a way to group variety of classes and  / or interfaces  together .
// The grouping is usually done on the basis of functionality .


// package gives us  following benefits :

// 1. The classes contained in a package can be used in any program that import that classes . 
// 2. packages provides a way to hide classes .
// 3. packages also provides a way for seprating "design" from coding  .


// Why Are They Used For?
// The benefits of using Packages in Java are as follows:

// The packages organize the group of classes into a single API unit
// It will control the naming conflicts
// The access protection will be easier. Protected and default are the access level control to the package
// Easy to locate the related classes
// Reuse the existing classes in packages


// You can categorize packages into:

// Built-in Packages == Api 
// User-defined Packages

// ==================================================================================================================================================================

// The built-in packages are from the Java API
// . The JAVA API is the library of pre-defined classes available in the Java Development Environment. Few built-in packages are below:

// Java.lang– Bundles the fundamental classes
// Java.lang- language support classes.. these classes that Java compiler itself uses and therefore they are automatically imported.
//  they include classes for primitive data type string math function thread and exception..

// Java.io -  Bundle of input and output function classes(bufferReader)
// Java.awt– Bundle of abstract window toolkit classes
// Java.swing–  Bundle of windows application GUI toolkit classes
// Java.net– Bundle of network infrastructure classes
// Java.util –Bundle of collection framework classes, languages utility classes such as vector,scanner etc..
// Java.applet– Bundle of creating applet classes
// Java.sql - Bundle of related data processing classes
// The built-in packages are again categorized into extension packages. These extension packages start with javax. This is for all the Java languages, which have lightweight component classes.

// Javax.swing
// Javax.servlet
// Javax.sql
// Note: The default package imported with no declaration is java.lang package.


// import java.util.*;  //get all classes from subpackage loads Date class

// import java.util.Scanner; //get one specific class Scanner

// import package.name.* ; // import the whole package

// import package.name.class ; // import the single class 



// ================================================================================================================================================================================================================================


// Naming Conventions
// Package names are written in all lower case to avoid conflict with the names of classes or interfaces.

// y=java.lang.Math.sqrt(x) ;
// lang=package;
// Math=class
// sqrt=method ;
// x= argument ;

// ========================================================================================================================================================================================================================


// User-defined Packages

// Benefits of User-Defined Packages;

// Code Organization: User-defined packages allow developers to group related classes and resources together, making it easier to navigate and understand the codebase. 
// This organization promotes code modularity and improves overall maintainability.

// Encapsulation: Packages provide a level of encapsulation by allowing you to specify the access level of classes and resources within the package. 
// This helps in controlling the visibility and accessibility of code elements, making it easier to define the boundaries of your code.

// Code Reusability: By creating user-defined packages, you can encapsulate commonly used classes, utilities, or modules, making them easily reusable across different projects.
//  This reusability saves development time and effort, as well as promotes consistency across applications.

// To create a user-defined package in Java, follow these steps:
// FOR Creating user defined package, we need to first define the structure of the package ;



// lets go for the following structure :- 
// 1. first decide the name of the package and then ,
// create the sub-directory with the same name inside  bin directory of the java 






