interface IFestival{
	public void peformEvent();
}

interface IPrograms {
	public void offerPrograms();
}

class CodeFest implements IFestival{

	@Override
	public void peformEvent() {
		System.out.println("Perform Code Fest Event");
		
	}
	
}

class RoboFest implements IFestival{

	@Override
	public void peformEvent() {
		System.out.println("Perform Robo Fest Event");
		
	}
	
}

class GameFest implements IFestival{

	@Override
	public void peformEvent() {
		System.out.println("Perform Game Fest Event");
		
	}
	
}

class DoctoralPrograms implements IPrograms{

	@Override
	public void offerPrograms() {
		System.out.println("Offer Doctoral Program");
		
	}
	
}

class MScPrograms implements IPrograms{

	@Override
	public void offerPrograms() {
		System.out.println("Offer MSc Program");
		
	}
	
}

class BScPrograms implements IPrograms{

	@Override
	public void offerPrograms() {
		System.out.println("Offer BSc Program");
		
	}
	
}

abstract class Student{
	
	private IPrograms iPrograms;
	private IFestival iFestival;
	
	public void offerPrograms() {
		iPrograms.offerPrograms();
	}
	
	public void conductFestival() {
		iFestival.peformEvent();
	}
	
	public void setOfferPrograms(IPrograms newProgram) {
		this.iPrograms = newProgram;
	}
	
	public void setConductFestival(IFestival newFestival) {
		this.iFestival = newFestival;
	}
	
	abstract void displayStudent();
}

class UnderGraduateStudents extends Student{

	public UnderGraduateStudents() {
		this.setOfferPrograms(new BScPrograms());
		this.setConductFestival(new CodeFest());
	}
	
	@Override
	void displayStudent() {
		System.out.println("Display Under Graduate Students");
		
	}
	
}

class PostGraduateStudents extends Student{

	
	public PostGraduateStudents() {
		this.setOfferPrograms(new DoctoralPrograms());
		this.setConductFestival(new RoboFest());
	}
	
	@Override
	void displayStudent() {
		System.out.println("Display Post Graduate Students");
		
	}
	
}

public class StrategyPattern {
	
	public static void main(String[] args) {
		
		Student underGrad = new UnderGraduateStudents();
		Student postGrad = new PostGraduateStudents();
		
		postGrad.offerPrograms();
		postGrad.conductFestival();
		postGrad.displayStudent();
		
		System.out.println();
		System.out.println();
		System.out.println("Assign New Event");
		System.out.println();
		System.out.println();
		
		postGrad.setConductFestival(new CodeFest());
		postGrad.offerPrograms();
		postGrad.conductFestival();
		postGrad.displayStudent();
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		underGrad.offerPrograms();
		underGrad.conductFestival();
		underGrad.displayStudent();
		
		System.out.println();
		System.out.println();
		System.out.println("Assign New Event");
		System.out.println();
		System.out.println();
		
		underGrad.setOfferPrograms(new MScPrograms());
		underGrad.offerPrograms();
		underGrad.conductFestival();
		
		
		
		
	
		
	}

}
