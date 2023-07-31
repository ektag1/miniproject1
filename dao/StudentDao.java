package com.dao;
import java.util.*;
public interface StudentDao 
{
	public List<Student> getallstudent();
	public Student getstudent(int rollno);
	public void deletestudent(Student stud);
	public void updaestudent(Student stud);
	List<Student> getallstudents();
}
