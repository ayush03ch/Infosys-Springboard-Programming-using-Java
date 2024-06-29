class Room {
    //Implement your code here 
    private int roomNo;
    private int capacity;
    private static int roomCounter;
    
    static{
        roomCounter = 500;
    }
    public static int getRoomCounter(){
        return Room.roomCounter;
    }
    public static void setRoomCounter(int roomCounter){
        Room.roomCounter = roomCounter;
    }
    
    public Room(){
        this.roomNo = Room.roomCounter;
        Room.roomCounter++;
        this.capacity = 4;
    }
    public int getRoomNo(){
        return this.roomNo;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }
    
}

class Member {
	//Implement your code here 
	
	private int memberId;
	private String name;
	private Room room;
	
	public Member(int memberId, String name){
	    this.memberId = memberId;
	    this.name = name;
	}
	public void setMemberId(int memberId){
	    this.memebrId = memberId;
	}
	public int getMemberId(){
	    return this.memebrId;
	}
	public void setName(String name){
	    this.name = name;
	}
	public String getName(){
	    return this.name;
	}
	public void setRoom(Room room){
	    this.room = room;
	}
	public Room getRoom(){
	    return this.room;
	}
	
	//Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "Member\nmemberId: "+this.memberId+"\nname: "+this.name;
    }
    
}

class Admin {
	//Implement your code here 
	public void assignRoom(Room[] rooms, Member member){
	    for(int i=0; i<rooms.length;i++){
	        if(room[i].capacity()>0 &&  member!=null){
	            rooms[i].setCapacity(rooms[i].getCapacity() - 1);
	            member.setRoom(rooms[i]);
	            return;
	        }
	    }
	}
}


class Tester {
	public static void main(String args[]) {
		Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
		Room room5 = new Room();

		Room[] totalRooms = { room1, room2, room3, room4, room5 };

		Admin admin = new Admin();

		Member member1 = new Member(101, "Serena");
		Member member2 = new Member(102, "Martha");
		Member member3 = new Member(103, "Nia");
		Member member4 = new Member(104, "Maria");
		Member member5 = new Member(105, "Eva");
		
		Member[] members = { member1, member2, member3, member4, member5 };
		
		for (Member member : members) {
			admin.assignRoom(totalRooms, member);
			if(member.getRoom()!=null) {
				System.out.println("Hi "+member.getName()+"! Your room number is "+member.getRoom().getRoomNo());
			}
			else {
				System.out.println("Hi "+member.getName()+"! No room available");
			}
		}
	}
} 
 

