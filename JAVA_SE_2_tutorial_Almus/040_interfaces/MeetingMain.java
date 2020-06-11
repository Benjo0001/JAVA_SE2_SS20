
public class MeetingMain {
    public static void main(String[] args) {
        // Folgender Beispielcode sei als Testcode gegeben:
        String[] participants = {"Luigi Lustig", "Michaela Schneider", "Ulf Wiel"};
        MeetingMinutes meeting = new MeetingMinutes("10.10.2017", "10-12 Uhr", "R123", participants);
        meeting.add(new DiscussionItem("Veröffentlichung Buch"));
        meeting.add(new DecisionItem("Dem Antrag wurde einstimmig zugestimmt."));
        meeting.add(new ActionItem("Bis zum nächsten Meeting muss Kapitel 9 (Buch A) fertig gestellt sein."));
        meeting.add(new ActionItem("Bis zum nächsten Meeting muss Kapitel 3 (Buch B) fertig gestellt sein."));
        System.out.println(meeting);

        // Dabei sollte folgende Ausgabe herauskommen (in etwa):
        // Meeting: 10.10.2017 (10-12 Uhr), R123
        // Participants: Luigi Lustig, Michaela Schneider, Ulf Wiel -----------
        // Discussion: Veröffentlichung Buch
        // Decision: Dem Antrag wurde einstimmig zugestimmt.
        // Action: Bis zum nächsten Meeting muss Kapitel 9 (Buch A) fertig gestellt sein.
        // Action: Bis zum nächsten Meeting muss Kapitel 3 (Buch B) fertig gestellt sein.

    }
}