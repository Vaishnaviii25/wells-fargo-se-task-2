# Task 2 
# Data Model Implementation in Spring Application

This repository contains the implementation of the data model in a Spring application. The data model includes entities that are used to represent data in the application.
Structure
entities:
Each entity class represents a table in the database and contains fields that correspond to the columns in that table.
Each entity class is annotated with @Entity to indicate that it is a JPA entity.
Each id field is annotated with @Id to indicate that it is the primary key of the entity.
Each field is annotated with @Column to specify the name of the column in the database.
Each class contains a constructor that initializes all fields.
Each class contains getter and setter methods for each field.
