package com.avirash.learntrack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import com.avirash.learntrack.entity.Course;
import com.avirash.learntrack.entity.Enrollment;
import com.avirash.learntrack.entity.Student;
import com.avirash.learntrack.enums.Status;
import com.avirash.learntrack.service.CourseService;
import com.avirash.learntrack.service.EnrollmentService;
import com.avirash.learntrack.service.StudentService;

public class Main {
	public static void main(String[] args) {

		// Display welcome
		printData("welcome");
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		
		StudentService studentService = new StudentService();
		CourseService courseService = new CourseService();
		EnrollmentService enrollmentService = new EnrollmentService();

		while (choice != 0) {
			try {
				// To give a small break
				Thread.sleep(2000);

				// Display menu
				printData("menu");

				// Read user choice
				choice = sc.nextInt();
				sc.nextLine();

				// Switch case to handle options
				switch (choice) {
				case 1:
					System.out.println("Adding student...");

					// Add student logic here
					Student student = new Student();
					System.out.println("Enter first name :");
					student.setFirstName(sc.next());
					System.out.println("Enter last name :");
					student.setLastName(sc.next());
					System.out.println("Enter email ID :");
					student.setEmailId(sc.next());

					System.out.println(studentService.addStudent(student));
					break;
				case 2:
					System.out.println("Viewing all students...");

					// View all students logic here
					System.out.println(studentService.getStudents());
					break;
				case 3:
					System.out.println("Viewing student by Id...");

					// View student by Id logic here
					System.out.println("Enter Student ID :");
					System.out.println(studentService.getStudent(sc.nextLong()));
					break;
				case 4:
					System.out.println("Deleting student by Id...");

					// Delete student logic here
					System.out.println("Enter Student ID :");
					System.out.println(studentService.deleteStudent(sc.nextLong()));
					break;
				case 5:
					System.out.println("Adding course...");

					// Add course logic here
					Course course = new Course();
					System.out.println("Enter course name :");
					course.setCourseName(sc.nextLine());
					
					System.out.println("Enter course description :");
					course.setDescription(sc.nextLine());
					System.out.println("Enter course duration in weeks :");
					course.setDurationInWeeks(sc.nextInt());
					sc.nextLine();
					System.out.println(courseService.addCourse(course));
					break;
				case 6:
					System.out.println("Viewing all courses...");

					// View all courses logic here
					System.out.println(courseService.getCourses());
					break;
				case 7:
					System.out.println("Activating/Deactivating course...");

					// Activate/Deactivate course logic here
					System.out.println("Enter course id :");
					int id = sc.nextInt();
					int flag = -1;
					while (flag == 1 ^ flag == 2) {
						System.out.println("Enter 1 to activate and 2 for deactivate :");
						flag = sc.nextInt();
						switch (flag) {
						case 1:
							System.out.println(courseService.update(id, true));
							break;
						case 2:
							System.out.println(courseService.update(id, false));
							break;
						default:
							System.out.println("Kindly enter correct input for activate/deactivate");
							flag = -1;
							break;
						}
					}
					break;
				case 8:
					System.out.println("Enrolling student to course...");
					
					// Enroll student to course logic here
					Enrollment enrollment = new Enrollment();
					System.out.println("Enter course Id :");
					enrollment.setCourseId(sc.nextInt());
					System.out.println("Enter student Id :");
					enrollment.setStudentId(sc.nextInt());
					System.out.println(enrollmentService.addEnrollment(enrollment));
					break;
				case 9:
					System.out.println("Viewing enrollment for student by Student Id...");
					
					// View enrollment for student logic here
					System.out.println("Enter student Id :");
					System.out.println(enrollmentService.getEnrollments(sc.nextInt()));
					break;
				case 10:
					System.out.println("Marking enrollment as completed/cancelled...");
					
					// Mark enrollment logic here
					System.out.println("Enter Enrollment id :");
					int enrollmentId = sc.nextInt();
					int enrollmentFlag = -1;
					while (enrollmentFlag == 1 ^ enrollmentFlag == 2) {
						System.out.println("Enter 1 to completed and 2 for cancelled :");
						enrollmentFlag = sc.nextInt();
						switch (enrollmentFlag) {
						case 1:
							System.out.println(enrollmentService.changeStatus(enrollmentId, Status.COMPLETED));
							break;
						case 2:
							System.out.println(enrollmentService.changeStatus(enrollmentId, Status.CANCELLED));
							break;
						default:
							System.out.println("Kindly enter correct input for complete/cancel");
							enrollmentFlag = -1;
							break;
						}
					}
					break;
				case 0:
					System.out.println("Exiting the Application. Goodbye!");
					sc.close();
					return; // Terminate program
				default:
					System.out.println("Invalid choice! Please try again.");
				}

				System.out.println(); // blank line for readability
			} catch (Exception e) {
				System.out.println(e.getMessage());
				choice = -1;
			}
		}

	}

	private static void printData(String fileName) {
		try {
			System.out.println(Files.readString(Paths.get("src/main/resources/" + fileName + ".txt")));
		} catch (IOException e) {
			System.out.println("Failed to load file");
		}
	}

}
