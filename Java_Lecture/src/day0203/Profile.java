package day0203;
/**
 * 
 * @author  taewookim
 * @see ProfileMain
 * @version 1
 *
 */

public class Profile {
	/** 이름*/
	public String name;
	/** 나이*/
	public int age;
	/** 성별*/
	public boolean gender;
	
	Profile(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Profile(String name, int age, boolean gender){
		this(name, age);
		this.gender = gender;
	}
	
	Profile(){
	}
	
	void trans(Profile p){
		
	}
	
	/** 객체정보*/
	void print()
	{
		System.out.println(age+","+name+","+gender);
		trans(this);
	}
}
