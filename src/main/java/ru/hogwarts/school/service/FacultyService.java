package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;


import java.util.Collection;

public interface FacultyService {

    Faculty add(Faculty  faculty );

    Faculty get(Long id);

    Faculty  remove(Long id);

    Faculty  update(Faculty  faculty);

    Collection<Faculty > getByColor(String Color);

    Collection<Faculty > getAll();
}

