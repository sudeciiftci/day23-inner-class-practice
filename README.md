# Java Inner Classes Practice

This project demonstrates **inner classes and static nested classes** in Java.

## Structure

### School (Outer Class)
- Stores school information (name, city)
- Manages classrooms using `ArrayList`
- Provides methods to add and display classrooms

### Classroom (Inner Class)
- Defined inside `School`
- Represents a class in the school
- Can access school data
- Contains a list of students

### Student (Inner Class of Classroom)
- Defined inside `Classroom`
- Stores student name and ID

### Teacher (Static Nested Class)
- Independent of `School` object
- Can be created without a school instance

## Key Concepts
- Inner class (non-static)
- Static nested class
- Object composition
- Hierarchical structure (School → Classroom → Student)

## Example Usage
- Create school
- Add classrooms
- Add students to a classroom
- Create teacher independently

## Purpose
- Understand inner class structure
- Practice real-world object modeling
- Learn difference between inner and static nested classes

