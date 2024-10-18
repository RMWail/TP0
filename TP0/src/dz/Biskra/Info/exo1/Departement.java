package dz.Biskra.Info.exo1;

import java.util.ArrayList;
import java.util.Iterator;
public class Departement {

	private String speciality ;
	private String address;
	
    private ArrayList <Student> students = new ArrayList <>();

	public Departement(String speciality, String address) {
		this.speciality = speciality;
		this.address = address;
	}

	
	public String toString() {
		return "Departement : \n speciality=" + speciality + "\n address=" + address + "\n students=" + students + "";
	}
	
	
	public void register(Student newStudent) {
		this.students.add(newStudent);
	}
	
	public void unregister(Student removedStudent) {
		
	 /*
	  	Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			
			Student stu = iterator.next();
			if(stu.getName().equals(removedStudent.getName()) &&
					   stu.getFirstName().equals(removedStudent.getFirstName()) &&
					   stu.getDateOfBirth().equals(removedStudent.getDateOfBirth())) {
				iterator.remove();
			}
		}
	   */
		
		this.students.remove(removedStudent);
	}
	
	
	/*
	 * 	public String toString() {
		
		String msg = "";
		for (Student stu : students) {
			msg +=stu.toString()+"\n";
		}
		
		return msg;
	}
	
	 * */
	

    
}
