package com.lwk.dao;

import com.lwk.model.Student;

import java.util.List;

/**
 * Created by lianjia on 2017-5-4.
 */
public interface StudentDao {
    public boolean add(Student student);
    public boolean delete(int sid);
    public boolean update(Student student);
    public List<Student> find(Student student);
    public Student findById(int sid);
    public List<Student> findAll();
}
