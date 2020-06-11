
public class MeetingMinutes {
    String date, String meetingTime, String room, String[] participants;


    MeetingMinutes(String date, String meetingTime, String room, String[] participants){
        setDate(date);
        setMeetingTime(meetingTime);
        setRoom(room);
        setParticipants(participants);
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }
    /**
     * @param t the meetingtime to set
     */
    public void setMeetingTime(String t){
        this.meetingTime = t;
    }
    /**
     * 
     * @param p the participants to set
     */
    public void setParticipants(Strin[] p){
        this.paricipants = p;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }
    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }
    public String getMeetingTime(){
        return this.meetingTime;
    }
    public String[] getParticipants(){
        return this.participants;
    }

    public void add(Item q){
        
    }


}