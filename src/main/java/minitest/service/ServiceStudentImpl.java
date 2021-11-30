package minitest.service;

import bai11_bt1.model.Product;
import minitest.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ServiceStudentImpl implements StudentService {
    private List<Student> listStudent;

    public ServiceStudentImpl() {
        listStudent = new ArrayList<>();
        listStudent.add(new Student("aaa", 1, 7, 7, 7));
        listStudent.add(new Student("bbb", 2, 8, 8, 8));
        listStudent.add(new Student("ccc", 3, 9, 9, 9));
    }

    @Override
    public List<Student> findAll() {
        return listStudent;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public Student findById(int id) {
        for (Student p : listStudent
        ) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    @Override
    public int findIndexById(int id) {
        for (int index = 0; index < listStudent.size(); index++) {
            if (listStudent.get(index).getId() == id) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public void update(int id, Student student) {
        listStudent.set(findIndexById(id), student);
    }

    @Override
    public void delete(int id) {
        listStudent.remove(findIndexById(id));
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }
}
