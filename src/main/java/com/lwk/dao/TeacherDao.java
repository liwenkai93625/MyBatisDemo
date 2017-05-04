package com.lwk.dao;

import com.lwk.model.Teacher;

import java.util.List;

/**
 * Created by lianjia on 2017-5-4.
 */
public interface TeacherDao {
    public boolean add(Teacher teacher);
    public boolean delete(int tid);
    public boolean update(Teacher teacher);
    public List<Teacher> find(Teacher teacher);
    public Teacher findById(int tid);
    public List<Teacher> findAll();
}
