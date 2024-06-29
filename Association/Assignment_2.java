class Participant {
    // Implement your code here
    private static int counter;
    private String registrationId;
    private String name;
    private long contactNumber;
    private String city;

    static {
        Participant.counter = 10000;
    }

    // Constructor
    public Participant(String name, long contactNumber, String city) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;
        this.registrationId = "D" + (counter + 1);
        counter++;
    }

    // Registration ID
    public String getRegistrationId() {
        return this.registrationId;
    }

    // Counter
    public static void setCounter(int counter) {
        Participant.counter = counter;
    }
    public static int getCounter() {
        return Participant.counter;
    }

    // Name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    // Contact Number
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
    public long getContactNumber() {
        return this.contactNumber;
    }

    // City
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return this.city;
    }
}

class Tester {
    public static void main(String[] args) {
        Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
        Participant participant2 = new Participant("Merina", 7890423112L, "New York");

        // Create more objects and add them to the participants array for testing your code
        Participant participant3 = new Participant("John", 9876543210L, "Los Angeles");

        Participant[] participants = { participant1, participant2, participant3 };

        for (Participant participant : participants) {
            System.out.println("Hi " + participant.getName() + "! Your registration id is " + participant.getRegistrationId());
        }
    }
}

    }
    
    // constructor
    public Participant(String name,long contactNumber,String city){
        setName(name);
        setContactNumber(contactNumber);
        setCity(city);
        this.registrationId = 'D' + Integer.toStringcounter;
        counter++;
    }
    // Registration
    public String getRegistrationId(){
        return this.registrationId;
    }
    // Counter
    public static void setCounter(int counter){
        this.counter = counter;
    }
    public static int getCounter(){
        return this.counter;
    }
    // Name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    // Contact Number
    public void setContactNumber(long contactNumber){
        this.contactNumber = contactNumber;
    }
    public long getContactNumber(){
        return this.contactNumber;
    }
    // city
    public void setCity(String city){
        return this.city;
    }
    public String getCity(){
        return this.city;
    }
}

class Tester {

	public static void main(String[] args) {
		
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		
		//Create more objects and add them to the participants array for testing your code
		
		Participant[] participants = { participant1, participant2 };
		
		for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}

	}
} 
