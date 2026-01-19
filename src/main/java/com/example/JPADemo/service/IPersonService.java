package com.example.JPADemo.service;

import com.example.JPADemo.model.Person;

import java.util.List;

public interface IPersonService {
    // Método para traer a todas las personas
    public List<Person> getPerson();

    //Método para traer una persona especifica
    public Person findPerson(Long id);

    //Método para guardar personas
    public void savePerson(Person person);

    //Método para eliminar personas
    public void deletePerson(Long id);

    //Método para actualizar
    public Person updatePerson(Long id, Person datosNuevos);
}