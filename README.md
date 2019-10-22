# Spring Dependency Injection Example

### How to inject the required bean when multiple beans implement the same interface

* @Qualifier(<nameOfTheImplementationClass>) before the attribute in the constructor. This is the preferred way and 
the best practise to choose the injected bean.

* The name of the attribute can be the name nameOfTheImplementationClass and spring will automatically 
inject the class by name. This is a shortcut that can cause problems down the line. Try to avoid.

*  The bean with the @Primary annotation overrides the method #2 above but does not override injections specified by @Qualifier annotation.
   


