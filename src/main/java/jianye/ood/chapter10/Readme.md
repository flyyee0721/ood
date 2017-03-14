##Case study: design the course class
* Attributes
  * Course name.
  * Course capacity.
  * List of students. A course class composes multiple students.
  
* Methods
  * Constructor that takes in class name and class capacity.
  * Constructor that takes in class name only with a default capacity.
  * Add students.
  * Drop students.
  * Get students list.
  * Get number of enrolled students.
  * Course name getter and setter.
  
* Tips
  * Synchronize on students list in add/drop students function.
  
##Case study: design the GuessDate class
* Utility class is declared to be final and has a private constructor.
* Define utility classes that contain static methods and static data.
