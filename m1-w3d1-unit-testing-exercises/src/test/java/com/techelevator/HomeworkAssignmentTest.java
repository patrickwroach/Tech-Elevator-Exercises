package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/*
 *  
 *  int getTotalMarks()
 *  void setTotalMarks(int totalMarks)
 *  getPossibleMarks()
 *  String getSubmitterName()
 *  setSubmitterName(String submitterName) 
 *  
 *   public String getLetterGrade()
 *   
 */
public class HomeworkAssignmentTest {

	private HomeworkAssignment homework;
	
	@Before
	
	public void setup() {
		homework = new HomeworkAssignment(100);
	}
	
	@Test
	public void set_total_marks() {
		//arrange
		//act
		homework.setTotalMarks(85);
		//assert
		Assert.assertEquals("Total marks should be 85", 85, homework.getTotalMarks());
	}
	
	@Test
	public void get_possible_marks() {
	//arrange
	//act
	homework.getPossibleMarks();
	//assert
	Assert.assertEquals("Possible Marks should be 100", 100, homework.getPossibleMarks());
	}
	
	@Test
	public void set_submitter_name() {
	//arrange
	//act
	homework.setSubmitterName("John Doe");
	//assert
	Assert.assertEquals("Submitter should be John Doe", "John Doe", homework.getSubmitterName());
	}
	
	@Test
	public void get_letter_grade_A() {
		//arrange
		//act
		homework.setTotalMarks(91);
		//assert
		Assert.assertEquals("91 should be an A", "A", homework.getLetterGrade());	
	}
	
	@Test
	public void get_letter_grade_B() {
		//arrange
		//act
		homework.setTotalMarks(81);
		//assert
		Assert.assertEquals("81 should be an B", "B", homework.getLetterGrade());	
	}
	
	@Test
	public void get_letter_grade_C() {
		//arrange
		//act
		homework.setTotalMarks(71);
		//assert
		Assert.assertEquals("71 should be an C", "C", homework.getLetterGrade());	
	}
	
	@Test
	public void get_letter_grade_D() {
		//arrange
		//act
		homework.setTotalMarks(61);
		//assert
		Assert.assertEquals("61 should be an D", "D", homework.getLetterGrade());	
	}
	
	@Test
	public void get_letter_grade_F() {
		//arrange
		//act
		homework.setTotalMarks(51);
		//assert
		Assert.assertEquals("51 should be an F", "F", homework.getLetterGrade());	
	}
	
	
}
