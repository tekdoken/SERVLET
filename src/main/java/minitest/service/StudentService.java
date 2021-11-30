package minitest.service;

import minitest.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void save(Student student);

    Student findById(int id);
    int findIndexById(int id);

    void update(int id, Student student);

    void delete(int id);

    List<Student> findByName(String name);
}
